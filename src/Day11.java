import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

public class Day11 {

    static String input =
            "Monkey 0:\n" +
            "  Starting items: 59, 65, 86, 56, 74, 57, 56\n" +
            "  Operation: new = old * 17\n" +
            "  Test: divisible by 3\n" +
            "    If true: throw to monkey 3\n" +
            "    If false: throw to monkey 6\n" +
            "\n" +
            "Monkey 1:\n" +
            "  Starting items: 63, 83, 50, 63, 56\n" +
            "  Operation: new = old + 2\n" +
            "  Test: divisible by 13\n" +
            "    If true: throw to monkey 3\n" +
            "    If false: throw to monkey 0\n" +
            "\n" +
            "Monkey 2:\n" +
            "  Starting items: 93, 79, 74, 55\n" +
            "  Operation: new = old + 1\n" +
            "  Test: divisible by 2\n" +
            "    If true: throw to monkey 0\n" +
            "    If false: throw to monkey 1\n" +
            "\n" +
            "Monkey 3:\n" +
            "  Starting items: 86, 61, 67, 88, 94, 69, 56, 91\n" +
            "  Operation: new = old + 7\n" +
            "  Test: divisible by 11\n" +
            "    If true: throw to monkey 6\n" +
            "    If false: throw to monkey 7\n" +
            "\n" +
            "Monkey 4:\n" +
            "  Starting items: 76, 50, 51\n" +
            "  Operation: new = old * old\n" +
            "  Test: divisible by 19\n" +
            "    If true: throw to monkey 2\n" +
            "    If false: throw to monkey 5\n" +
            "\n" +
            "Monkey 5:\n" +
            "  Starting items: 77, 76\n" +
            "  Operation: new = old + 8\n" +
            "  Test: divisible by 17\n" +
            "    If true: throw to monkey 2\n" +
            "    If false: throw to monkey 1\n" +
            "\n" +
            "Monkey 6:\n" +
            "  Starting items: 74\n" +
            "  Operation: new = old * 2\n" +
            "  Test: divisible by 5\n" +
            "    If true: throw to monkey 4\n" +
            "    If false: throw to monkey 7\n" +
            "\n" +
            "Monkey 7:\n" +
            "  Starting items: 86, 85, 52, 86, 91, 95\n" +
            "  Operation: new = old + 6\n" +
            "  Test: divisible by 7\n" +
            "    If true: throw to monkey 4\n" +
            "    If false: throw to monkey 5";

    static class Monkey {
        List<Long> items;
        LongFunction<Long> operation;
        LongFunction<Integer> nextMonkeyCalculator;
        int inspectionCounter = 0;

        public Monkey(List<Long> items, LongFunction<Long> operation, LongFunction<Integer> nextMonkeyCalculator) {
            this.items = items;
            this.operation = operation;
            this.nextMonkeyCalculator = nextMonkeyCalculator;
        }

        public List<Long> getItems() {
            return items;
        }

        public LongFunction<Long> getOperation() {
            return operation;
        }

        public LongFunction<Integer> getNextMonkeyCalculator() {
            return nextMonkeyCalculator;
        }

        public int getInspectionCounter() {
            return inspectionCounter;
        }

        public void setInspectionCounter(int inspectionCounter) {
            this.inspectionCounter = inspectionCounter;
        }

        @Override
        public String toString() {
            return "Monkey{" +
                    "items=" + items +
                    ", operation=" + operation +
                    ", nextMonkeyCalculator=" + nextMonkeyCalculator +
                    ", inspectionCounter=" + inspectionCounter +
                    '}';
        }
    }

    public static void main(String[] args) {
        String[] lines = input.split("\\R");
        List<Monkey> monkeys = new ArrayList<>();
        List<Long> dividers = new ArrayList<>();

        for (int i = 0; i < lines.length; i+=7) {
            // get items
            String itemString = lines[i+1].split(": ")[1];
            String[] items = itemString.split(", ");
            List<Long> parsedItems = new ArrayList<>();
            for (String item : items) {
                parsedItems.add(Long.parseLong(item));
            }

            // get operation
            String operationString = lines[i+2].split(" = ")[1];
            String[] operationParts = operationString.trim().split("\\s");
            LongFunction<Long> operation;
            String operand = operationParts[1];
            if (operationParts[2].equals("old")) {
                if (operand.equals("+")) operation = item -> item + item;
                else if (operand.equals("*")) operation = item -> item * item;
                else if (operand.equals("/")) operation = item -> 1L;
                else operation = item -> 0L;
            } else {
                int operationFactor = Integer.parseInt(operationParts[2]);

                if (operand.equals("+")) operation = item -> item + operationFactor;
                else if (operand.equals("*")) operation = item -> item * operationFactor;
                else if (operand.equals("/")) operation = item -> item / operationFactor;
                else operation = item -> item - operationFactor;
            }


            // get test function
            long divisionFactor = Long.parseLong(lines[i+3].trim().split("\\s")[3]);
            dividers.add(divisionFactor);

            int monkeyIfTrue = Integer.parseInt(lines[i+4].trim().split("\\s")[5]);
            int monkeyIfFalse = Integer.parseInt(lines[i+5].trim().split("\\s")[5]);
            LongFunction<Integer> nextMonkeyFunction = item -> item % divisionFactor == 0 ? monkeyIfTrue : monkeyIfFalse;

            monkeys.add(new Monkey(parsedItems, operation, nextMonkeyFunction));
        }

        // lowest common multiple of divisors in monkey test phases
        long lcm = 1;
        for (long divider : dividers) {
            lcm = divider * lcm;
        }

        // part 1: 20 iterations
        // part 2: 10.000 iterations
        for (int i = 0; i < 10000; i++) {
            for (Monkey monkey : monkeys) {
                for (Long item : monkey.getItems()) {
                    item = monkey.operation.apply(item);

                    // part 1
                    //item = item / 3;

                    // part 2
                    item = item % lcm;

                    int newMonkeyIndex = monkey.nextMonkeyCalculator.apply(item);
                    monkeys.get(newMonkeyIndex).getItems().add(item);
                    monkey.setInspectionCounter(monkey.getInspectionCounter() + 1);
                }
                monkey.getItems().removeAll(monkey.getItems());
            }
        }

        long[] inspectionCounts = monkeys.stream()
                .mapToLong(Monkey::getInspectionCounter)
                .sorted().toArray();

        System.out.println(inspectionCounts[inspectionCounts.length - 1] * inspectionCounts[inspectionCounts.length - 2]);

    }
}

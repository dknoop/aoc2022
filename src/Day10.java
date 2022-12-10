import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringJoiner;

public class Day10 {

    static String input = "addx 1\n" +
            "noop\n" +
            "addx 4\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "addx 6\n" +
            "addx -1\n" +
            "addx 5\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "addx 5\n" +
            "addx -14\n" +
            "noop\n" +
            "addx 19\n" +
            "noop\n" +
            "addx 1\n" +
            "addx 4\n" +
            "addx 1\n" +
            "noop\n" +
            "noop\n" +
            "addx 2\n" +
            "addx 5\n" +
            "addx -27\n" +
            "addx 20\n" +
            "addx -30\n" +
            "addx 2\n" +
            "addx 5\n" +
            "addx 2\n" +
            "addx 4\n" +
            "addx -3\n" +
            "addx 2\n" +
            "addx 5\n" +
            "addx 2\n" +
            "addx -9\n" +
            "addx 1\n" +
            "addx 11\n" +
            "noop\n" +
            "addx -20\n" +
            "addx 7\n" +
            "addx 23\n" +
            "addx 2\n" +
            "addx 3\n" +
            "addx -2\n" +
            "addx -34\n" +
            "addx -2\n" +
            "noop\n" +
            "addx 3\n" +
            "noop\n" +
            "addx 3\n" +
            "addx 2\n" +
            "noop\n" +
            "addx 3\n" +
            "addx 2\n" +
            "addx 5\n" +
            "addx 2\n" +
            "addx -9\n" +
            "addx -7\n" +
            "addx 21\n" +
            "noop\n" +
            "addx 8\n" +
            "noop\n" +
            "addx -1\n" +
            "addx 3\n" +
            "addx -2\n" +
            "addx 5\n" +
            "addx -37\n" +
            "noop\n" +
            "addx 35\n" +
            "addx -31\n" +
            "addx 1\n" +
            "addx 4\n" +
            "addx -1\n" +
            "addx 2\n" +
            "noop\n" +
            "addx 3\n" +
            "addx 1\n" +
            "addx 5\n" +
            "addx -2\n" +
            "addx 7\n" +
            "addx -2\n" +
            "addx -2\n" +
            "addx 10\n" +
            "noop\n" +
            "addx 4\n" +
            "noop\n" +
            "noop\n" +
            "addx -19\n" +
            "addx 20\n" +
            "addx -38\n" +
            "noop\n" +
            "noop\n" +
            "addx 7\n" +
            "addx 2\n" +
            "addx 3\n" +
            "noop\n" +
            "addx 4\n" +
            "addx -3\n" +
            "addx 2\n" +
            "addx 2\n" +
            "noop\n" +
            "addx 3\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "addx 5\n" +
            "noop\n" +
            "addx 7\n" +
            "addx -2\n" +
            "addx 7\n" +
            "noop\n" +
            "noop\n" +
            "addx -5\n" +
            "addx 6\n" +
            "addx -36\n" +
            "noop\n" +
            "addx 1\n" +
            "addx 2\n" +
            "addx 5\n" +
            "addx 2\n" +
            "addx 3\n" +
            "addx -2\n" +
            "addx 2\n" +
            "addx 5\n" +
            "addx 2\n" +
            "addx 1\n" +
            "noop\n" +
            "addx 4\n" +
            "addx -16\n" +
            "addx 21\n" +
            "noop\n" +
            "noop\n" +
            "addx 1\n" +
            "addx -8\n" +
            "addx 12\n" +
            "noop\n" +
            "noop\n" +
            "noop\n" +
            "noop";

    public static void main(String[] args) {

        String[] lines = input.split("\\R");
        int register = 1;

        Stack<String> stack = new Stack<>();

        for (int i = lines.length - 1; i >= 0; i--) {
            stack.push(lines[i]);
        }

        boolean currentInstructionIsAdd = false;
        int cycleToExecuteAdd = 0;
        int amountToAdd = 0;

        int cumulatedSignalStrengths = 0;

        List<StringJoiner> crtLines = new ArrayList<>();
        int nrOfRows = 6;
        for (int i = 0; i < nrOfRows; i++) {
            crtLines.add(new StringJoiner(" "));
        }

        for (int i = 0; i < 240; i++) {

            if (currentInstructionIsAdd && i == cycleToExecuteAdd) {
                register += amountToAdd;
                currentInstructionIsAdd = false;
            } else if (currentInstructionIsAdd) {

                int cycle = i + 1;
                if (cycle == 20 || cycle == 60 || cycle == 100 || cycle == 140 || cycle == 180 || cycle == 220) {
                    cumulatedSignalStrengths += cycle * register;
                }

                // part 2
                int xPos = i % 40;
                int yPos = i / 40;

                if (xPos == register - 1 || xPos == register || xPos == register + 1) {
                    crtLines.get(yPos).add("#");
                } else {
                    crtLines.get(yPos).add(".");
                }

                continue;
            }

            if (!stack.isEmpty()) {
                String[] line = stack.pop().split("\\s");
                if (line[0].equals("addx")) {
                    currentInstructionIsAdd = true;
                    cycleToExecuteAdd = i + 2;
                    amountToAdd = Integer.parseInt(line[1]);
                } else {
                    currentInstructionIsAdd = false;
                }
            }

            int cycle = i + 1;
            if (cycle == 20 || cycle == 60 || cycle == 100 || cycle == 140 || cycle == 180 || cycle == 220) {
                cumulatedSignalStrengths += cycle * register;
            }

            // part 2
            int xPos = i % 40;
            int yPos = i / 40;

            if (xPos == register - 1 || xPos == register || xPos == register + 1) {
                crtLines.get(yPos).add("#");
            } else {
                crtLines.get(yPos).add(".");
            }
        }

        System.out.println(cumulatedSignalStrengths);

        for (StringJoiner crtLine : crtLines) {
            System.out.println(crtLine);
        }
    }
}

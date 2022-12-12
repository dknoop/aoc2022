import org.w3c.dom.Node;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Day12 {

    static String input =
            "abcccccaaaccccaacaaccaaaaaaaaaaaaaaaaaaaaccccccccccccccccccccccccccccccccccaaaaaa\n" +
            "abcccccaaaacccaaaaaccaaaaaaaaaaaaaaaaaaaaacccccccccccccccccccccccccccccccccccaaaa\n" +
            "abcccccaaaaccaaaaaccccaaaccaaaaaacccacaaaaccccccccccccccccaaaccccccccccccccccaaaa\n" +
            "abcccccaaacccaaaaaaccccccccaaaaaacccccaaccccccccccccccccccaaaccccccccccccccccaaaa\n" +
            "abcccccccccccccaaaacccccccaaaaaaaaccccccccccccccccccccccccaaacccccccccccccccaaaaa\n" +
            "abccccccaacccccaacccccccccaaaaaaaaccccccccccccccccccccccccaaaaccaaacccccccccccccc\n" +
            "abccccccaacccccccccccccccaaacccaaaacccaacaaccccccccccacaccaaacaajaacccccccccccccc\n" +
            "abcccaaaaaaaaccccacccccccaaaccccaaacccaaaaaccccccccccaaaaaaajjjjkkkccccccaacccccc\n" +
            "abcccaaaaaaaacaaaacccccccccccccccccccaaaaaccccccccciiiijjjjjjjjjkkkkcaaaaaacccccc\n" +
            "abcccccaaaacccaaaaaacccccccccccccccccaaaaaacccccciiiiiijjjjjjjrrrkkkkaaaaaaaacccc\n" +
            "abcccccaaaaacccaaaacccccccccaacccccccccaaaaccccciiiiiiiijjjjrrrrrsskkaaaaaaaacccc\n" +
            "abccccaaaaaaccaaaaacccccccccaaaacccccccaccccccciiiiqqqqrrrrrrrrrssskkkaaaaaaacccc\n" +
            "abaaccaaccaaccaacaacccccccaaaaaaccccccccccccccciiiqqqqqrrrrrrruussskkkaaaaacccccc\n" +
            "abaaaacccccccccccccccccccccaaaaccccccccaaaccccciiqqqqqttrrrruuuuussskkaaaaacccccc\n" +
            "abaaaacccccccccccccccccccccaaaaaccccccccaaaaccchiqqqtttttuuuuuuuussskkcccaacccccc\n" +
            "abaaacccccaaaccacccccccccccaacaaccccccaaaaaaccchhqqqtttttuuuuxxuussslllcccccccccc\n" +
            "abaaaaccccaaaaaacaaccccccaccccccccccccaaaaacccchhqqqttxxxxuuxxyyusssllllccccccccc\n" +
            "abacaaccccaaaaaacaaaaaaaaaaccccccccccccaaaaaccchhqqqttxxxxxxxxyuusssslllccccccccc\n" +
            "abcccccccaaaaaaacaaaaaaaaaccccaacccccccaaccaccchhhqqtttxxxxxxyyvvvsssslllcccccccc\n" +
            "abcccccccaaaaaaaaaaaaaaaaaccccaaaaccccccccccccchhhppqttxxxxxyyyvvvvsqqqlllccccccc\n" +
            "SbcccaaccaaaaaaaaaaaaaaaaaacaaaaaacccccccccccchhhhpptttxxxEzzyyyyvvvqqqqlllcccccc\n" +
            "abcccaaccccaaacaaaaaaaaaaaaacaaaaccccccccccccchhhppptttxxxyyyyyyyyvvvqqqlllcccccc\n" +
            "abaaaaaaaacaaacaaaaaaaaaaaaacaaaaacaaccccccccchhpppsssxxyyyyyyyyvvvvvqqqlllcccccc\n" +
            "abaaaaaaaaccccccccaaacaaaccccaacaaaaaccccccaagggpppsswwwwwwyyyvvvvvvqqqmmmmcccccc\n" +
            "abccaaaaccccaacaacaaacaaacccccccccaaacaaaccaagggppssswwwwwwyyywvvqqqqqqmmmccccccc\n" +
            "abcaaaaaccccaaaaacaaccaaccaaaccaaaaaaaaaaaaaagggppsssswwwswwyywvrqqqqmmmmcccccccc\n" +
            "abcaaaaaaccaaaaacccccccccaaaaccaaaaaaaaaacaaagggpppssssssswwwwwwrrqmmmmmccccccccc\n" +
            "abcaacaaaccaaaaaaccccccccaaaaccccaaaaaacccaaagggppppssssssrwwwwrrrmmmmmdccccccccc\n" +
            "abccccaaaccaaaaaaccccccccaaaaccccaaaaaacccaacggggpooooooosrrwwwrrnmmmddddcacccccc\n" +
            "abccccaaaaaaaacccccccccccccccccccaaaaaaaccccccggggoooooooorrrrrrrnnmdddddaaaacccc\n" +
            "abcccccaaaaaaccccccccccccccccccccaaacaaacccccccggggfffooooorrrrrrnnddddaaaaaacccc\n" +
            "abccaaaaaaaacccccccccccccccccccccaccccccccccccccggffffffooonrrrrnnndddaaaaaaacccc\n" +
            "abccaaaaaaaaaccccaacccccccccccccccccccccccccccccccfffffffoonnnnnnndddcaaaaacccccc\n" +
            "abccaaaaaaaaaacccaaccccccccccccccaccccccccccccccccccccffffnnnnnnnedddaaaaaacccccc\n" +
            "abcccccaaaaaaaaaaaacccccccaccccaaacccccccccccccccccccccfffeennnneeedcccccaacccccc\n" +
            "abcccccaaacccaaaaaaaaccccaaacccaaaccacccccccccccccccccccafeeeeeeeeecccccccccccccc\n" +
            "abcccccaaccccaaaaaaaaacccaaaaaaaaaaaaccccccaaaccccccccccaaeeeeeeeeeccccccccccccca\n" +
            "abaccccccccccaaaaaaaaacccaaaaaaaaaaacccccccaaaaacccccccaaaaceeeeecccccccccccaccca\n" +
            "abaccccccccccaaaaaaaaccaaaaaaaaaaaaaacccccaaaaaccccccccaaaccccaaacccccccccccaaaaa\n" +
            "abaccccccccccaaaaaaacccaaaaaaaaaaaaaacccccaaaaacccccccccccccccccccccccccccccaaaaa\n" +
            "abaccccccccccaccaaaacccaaaaaaaaaaaaaaccccccaaaaaccccccccccccccccccccccccccccaaaaa";

    static int[][] data;

    record Node(int x, int y, int cost){
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return x == node.x && y == node.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }

    public static void main(String[] args) {
        String[] lines = input.split("\\R");
        data = new int[lines.length][lines[0].length()];

        for (int i = 0; i < lines.length; i++) {
            data[i] = lines[i].chars().toArray();
        }

        Node start = new Node(0, 0, 0);
        Node end = new Node(0, 0, 0);

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (((char)data[i][j]) == 'S') start = new Node(i, j, 0);
                if (((char)data[i][j]) == 'E') end = new Node(i, j, 0);
            }
        }

        Node finalEnd = end;
        Predicate<Node> stopConditionPart1 = node -> node.x == finalEnd.x && node.y == finalEnd.y;
        System.out.println(findShortestPath(start, stopConditionPart1, Day12::getNeighbours));

        Predicate<Node> stopConditionPart2 = node -> data[node.x][node.y] == 'a';
        System.out.println(findShortestPath(end, stopConditionPart2, Day12::getNeighboursInverse));
    }

    /* implements Dijkstra's algorithm */
    static int findShortestPath(Node start, Predicate<Node> stopCondition, Function<Node, List<Node>> neighbourFunction) {
        PriorityQueue<Node> nodesToBeInspected = new PriorityQueue<>(Comparator.comparingInt(Node::cost));
        nodesToBeInspected.add(start);
        Set<Node> visitedNodes = new HashSet<>();

        while (!nodesToBeInspected.isEmpty()) {
            Node currentNode = nodesToBeInspected.poll();

            // stop condition
            if (stopCondition.test(currentNode)) {
                return currentNode.cost;
            }

            if (visitedNodes.contains(currentNode)) {
                continue;
            }

            visitedNodes.add(currentNode);
            nodesToBeInspected.addAll(neighbourFunction.apply(currentNode).stream().filter(n -> !visitedNodes.contains(n)).toList());
        }

        return visitedNodes.stream().mapToInt(Node::cost).max().getAsInt();
    }

    static List<Node> getNeighbours(Node node) {
        List<Node> neighbours = new ArrayList<>();
        List<Node> neighbourCandidates = new ArrayList<>();
        neighbourCandidates.add(new Node(node.x + 1, node.y, Integer.MAX_VALUE));
        neighbourCandidates.add(new Node(node.x - 1, node.y, Integer.MAX_VALUE));
        neighbourCandidates.add(new Node(node.x, node.y + 1, Integer.MAX_VALUE));
        neighbourCandidates.add(new Node(node.x, node.y - 1, Integer.MAX_VALUE));

        for (Node neighbourCandidate : neighbourCandidates) {
            int x = neighbourCandidate.x;
            int y = neighbourCandidate.y;

            if (x < 0 || y < 0 || x >= data.length || y >= data[0].length) continue;

            int height = getNodeHeight(neighbourCandidate);

            if (height <= getNodeHeight(node) + 1) {
                neighbours.add(new Node(x, y, node.cost() + 1));
            }
        }

        return neighbours;
    }

    static List<Node> getNeighboursInverse(Node node) {
        List<Node> neighbours = new ArrayList<>();
        List<Node> neighbourCandidates = new ArrayList<>();
        neighbourCandidates.add(new Node(node.x + 1, node.y, Integer.MAX_VALUE));
        neighbourCandidates.add(new Node(node.x - 1, node.y, Integer.MAX_VALUE));
        neighbourCandidates.add(new Node(node.x, node.y + 1, Integer.MAX_VALUE));
        neighbourCandidates.add(new Node(node.x, node.y - 1, Integer.MAX_VALUE));

        for (Node neighbourCandidate : neighbourCandidates) {
            int x = neighbourCandidate.x;
            int y = neighbourCandidate.y;

            if (x < 0 || y < 0 || x >= data.length || y >= data[0].length) continue;

            int height = getNodeHeight(neighbourCandidate);

            if (height >= getNodeHeight(node) - 1) {
                neighbours.add(new Node(x, y, node.cost() + 1));
            }
        }

        return neighbours;
    }

    static int getNodeHeight(Node node) {
        int height = data[node.x][node.y];
        height = ((char) height) == 'S' ? 'a' : height;
        height = ((char) height) == 'E' ? 'z' : height;

        return height;
    }
}

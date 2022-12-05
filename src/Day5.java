import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Day5 {

    private static String input =
            "    [P]                 [Q]     [T]\n" +
            "[F] [N]             [P] [L]     [M]\n" +
            "[H] [T] [H]         [M] [H]     [Z]\n" +
            "[M] [C] [P]     [Q] [R] [C]     [J]\n" +
            "[T] [J] [M] [F] [L] [G] [R]     [Q]\n" +
            "[V] [G] [D] [V] [G] [D] [N] [W] [L]\n" +
            "[L] [Q] [S] [B] [H] [B] [M] [L] [D]\n" +
            "[D] [H] [R] [L] [N] [W] [G] [C] [R]\n" +
            " 1   2   3   4   5   6   7   8   9 \n" +
            "\n" +
            "move 1 from 7 to 6\n" +
            "move 1 from 8 to 5\n" +
            "move 3 from 7 to 4\n" +
            "move 5 from 9 to 6\n" +
            "move 3 from 7 to 9\n" +
            "move 2 from 5 to 7\n" +
            "move 10 from 6 to 8\n" +
            "move 2 from 2 to 3\n" +
            "move 2 from 9 to 1\n" +
            "move 6 from 8 to 2\n" +
            "move 5 from 3 to 8\n" +
            "move 4 from 5 to 9\n" +
            "move 3 from 4 to 5\n" +
            "move 2 from 1 to 8\n" +
            "move 3 from 1 to 7\n" +
            "move 1 from 7 to 1\n" +
            "move 4 from 7 to 8\n" +
            "move 1 from 5 to 6\n" +
            "move 1 from 9 to 3\n" +
            "move 8 from 2 to 4\n" +
            "move 1 from 5 to 8\n" +
            "move 1 from 5 to 3\n" +
            "move 2 from 1 to 8\n" +
            "move 4 from 3 to 4\n" +
            "move 1 from 3 to 4\n" +
            "move 1 from 1 to 7\n" +
            "move 1 from 7 to 8\n" +
            "move 1 from 7 to 4\n" +
            "move 5 from 9 to 1\n" +
            "move 2 from 6 to 7\n" +
            "move 3 from 2 to 1\n" +
            "move 12 from 8 to 7\n" +
            "move 8 from 7 to 3\n" +
            "move 1 from 2 to 8\n" +
            "move 6 from 7 to 1\n" +
            "move 1 from 6 to 3\n" +
            "move 8 from 4 to 3\n" +
            "move 5 from 3 to 6\n" +
            "move 6 from 1 to 8\n" +
            "move 2 from 1 to 2\n" +
            "move 2 from 3 to 1\n" +
            "move 4 from 4 to 5\n" +
            "move 1 from 5 to 7\n" +
            "move 1 from 6 to 9\n" +
            "move 1 from 4 to 9\n" +
            "move 8 from 1 to 4\n" +
            "move 10 from 3 to 5\n" +
            "move 2 from 4 to 5\n" +
            "move 2 from 2 to 6\n" +
            "move 2 from 1 to 6\n" +
            "move 11 from 4 to 7\n" +
            "move 9 from 6 to 5\n" +
            "move 16 from 8 to 3\n" +
            "move 15 from 5 to 6\n" +
            "move 10 from 3 to 6\n" +
            "move 24 from 6 to 5\n" +
            "move 5 from 7 to 5\n" +
            "move 1 from 6 to 3\n" +
            "move 1 from 7 to 2\n" +
            "move 2 from 7 to 6\n" +
            "move 3 from 3 to 6\n" +
            "move 8 from 5 to 1\n" +
            "move 3 from 9 to 8\n" +
            "move 3 from 8 to 4\n" +
            "move 1 from 7 to 1\n" +
            "move 1 from 2 to 9\n" +
            "move 1 from 9 to 2\n" +
            "move 2 from 3 to 1\n" +
            "move 2 from 4 to 2\n" +
            "move 5 from 6 to 8\n" +
            "move 3 from 7 to 1\n" +
            "move 1 from 4 to 2\n" +
            "move 26 from 5 to 9\n" +
            "move 1 from 3 to 6\n" +
            "move 7 from 1 to 9\n" +
            "move 1 from 3 to 5\n" +
            "move 1 from 6 to 5\n" +
            "move 1 from 5 to 4\n" +
            "move 5 from 5 to 6\n" +
            "move 1 from 4 to 9\n" +
            "move 3 from 9 to 3\n" +
            "move 4 from 8 to 5\n" +
            "move 2 from 5 to 2\n" +
            "move 1 from 1 to 6\n" +
            "move 1 from 8 to 9\n" +
            "move 2 from 2 to 4\n" +
            "move 2 from 3 to 7\n" +
            "move 1 from 7 to 6\n" +
            "move 7 from 6 to 7\n" +
            "move 1 from 4 to 3\n" +
            "move 2 from 2 to 4\n" +
            "move 28 from 9 to 3\n" +
            "move 26 from 3 to 7\n" +
            "move 2 from 4 to 3\n" +
            "move 2 from 9 to 1\n" +
            "move 4 from 3 to 6\n" +
            "move 1 from 4 to 5\n" +
            "move 1 from 3 to 4\n" +
            "move 3 from 1 to 9\n" +
            "move 1 from 4 to 7\n" +
            "move 1 from 5 to 7\n" +
            "move 1 from 6 to 9\n" +
            "move 23 from 7 to 1\n" +
            "move 4 from 9 to 5\n" +
            "move 3 from 9 to 4\n" +
            "move 2 from 6 to 3\n" +
            "move 1 from 6 to 7\n" +
            "move 3 from 3 to 9\n" +
            "move 11 from 7 to 2\n" +
            "move 4 from 2 to 3\n" +
            "move 23 from 1 to 2\n" +
            "move 15 from 2 to 4\n" +
            "move 2 from 7 to 9\n" +
            "move 13 from 2 to 8\n" +
            "move 1 from 7 to 5\n" +
            "move 1 from 2 to 8\n" +
            "move 7 from 4 to 8\n" +
            "move 6 from 4 to 3\n" +
            "move 1 from 2 to 4\n" +
            "move 1 from 2 to 9\n" +
            "move 20 from 8 to 5\n" +
            "move 1 from 8 to 4\n" +
            "move 3 from 4 to 7\n" +
            "move 3 from 3 to 9\n" +
            "move 1 from 2 to 8\n" +
            "move 20 from 5 to 3\n" +
            "move 6 from 5 to 3\n" +
            "move 26 from 3 to 9\n" +
            "move 2 from 7 to 5\n" +
            "move 1 from 5 to 4\n" +
            "move 1 from 7 to 8\n" +
            "move 2 from 8 to 5\n" +
            "move 12 from 9 to 4\n" +
            "move 2 from 3 to 2\n" +
            "move 4 from 1 to 9\n" +
            "move 2 from 3 to 1\n" +
            "move 4 from 5 to 6\n" +
            "move 5 from 9 to 4\n" +
            "move 2 from 6 to 3\n" +
            "move 2 from 6 to 8\n" +
            "move 2 from 8 to 3\n" +
            "move 1 from 2 to 7\n" +
            "move 21 from 4 to 2\n" +
            "move 1 from 4 to 5\n" +
            "move 13 from 2 to 4\n" +
            "move 4 from 3 to 9\n" +
            "move 25 from 9 to 7\n" +
            "move 7 from 2 to 4\n" +
            "move 18 from 7 to 8\n" +
            "move 2 from 1 to 5\n" +
            "move 1 from 3 to 9\n" +
            "move 2 from 9 to 3\n" +
            "move 1 from 1 to 6\n" +
            "move 8 from 7 to 6\n" +
            "move 4 from 3 to 2\n" +
            "move 1 from 4 to 7\n" +
            "move 6 from 2 to 5\n" +
            "move 1 from 7 to 3\n" +
            "move 5 from 6 to 8\n" +
            "move 4 from 4 to 1\n" +
            "move 9 from 5 to 1\n" +
            "move 12 from 4 to 3\n" +
            "move 1 from 6 to 5\n" +
            "move 1 from 5 to 2\n" +
            "move 13 from 3 to 8\n" +
            "move 14 from 8 to 6\n" +
            "move 2 from 1 to 6\n" +
            "move 1 from 2 to 5\n" +
            "move 11 from 1 to 3\n" +
            "move 1 from 5 to 3\n" +
            "move 6 from 6 to 8\n" +
            "move 23 from 8 to 5\n" +
            "move 1 from 8 to 1\n" +
            "move 18 from 5 to 8\n" +
            "move 5 from 6 to 8\n" +
            "move 10 from 3 to 8\n" +
            "move 1 from 1 to 5\n" +
            "move 2 from 4 to 8\n" +
            "move 1 from 4 to 7\n" +
            "move 5 from 5 to 3\n" +
            "move 1 from 6 to 1\n" +
            "move 6 from 3 to 9\n" +
            "move 35 from 8 to 4\n" +
            "move 1 from 7 to 6\n" +
            "move 2 from 9 to 8\n" +
            "move 1 from 1 to 6\n" +
            "move 17 from 4 to 7\n" +
            "move 1 from 5 to 1\n" +
            "move 4 from 9 to 6\n" +
            "move 12 from 6 to 4\n" +
            "move 29 from 4 to 2\n" +
            "move 17 from 7 to 8\n" +
            "move 27 from 2 to 7\n" +
            "move 2 from 2 to 1\n" +
            "move 1 from 3 to 1\n" +
            "move 25 from 7 to 4\n" +
            "move 25 from 4 to 6\n" +
            "move 1 from 4 to 2\n" +
            "move 4 from 1 to 6\n" +
            "move 1 from 2 to 6\n" +
            "move 25 from 6 to 1\n" +
            "move 5 from 6 to 8\n" +
            "move 15 from 1 to 6\n" +
            "move 2 from 7 to 8\n" +
            "move 15 from 6 to 2\n" +
            "move 14 from 2 to 8\n" +
            "move 1 from 2 to 3\n" +
            "move 4 from 1 to 4\n" +
            "move 4 from 4 to 2\n" +
            "move 6 from 1 to 8\n" +
            "move 3 from 2 to 5\n" +
            "move 3 from 5 to 7\n" +
            "move 1 from 2 to 3\n" +
            "move 1 from 6 to 8\n" +
            "move 8 from 8 to 5\n" +
            "move 2 from 7 to 4\n" +
            "move 1 from 7 to 9\n" +
            "move 3 from 5 to 8\n" +
            "move 2 from 4 to 6\n" +
            "move 3 from 5 to 8\n" +
            "move 2 from 3 to 4\n" +
            "move 2 from 6 to 5\n" +
            "move 1 from 9 to 8\n" +
            "move 48 from 8 to 5\n" +
            "move 1 from 8 to 9\n" +
            "move 41 from 5 to 4\n" +
            "move 4 from 5 to 2\n" +
            "move 3 from 2 to 7\n" +
            "move 1 from 2 to 7\n" +
            "move 1 from 8 to 1\n" +
            "move 1 from 9 to 4\n" +
            "move 1 from 1 to 3\n" +
            "move 7 from 4 to 7\n" +
            "move 11 from 7 to 4\n" +
            "move 4 from 4 to 1\n" +
            "move 37 from 4 to 9\n" +
            "move 4 from 4 to 3\n" +
            "move 32 from 9 to 3\n" +
            "move 5 from 9 to 1\n" +
            "move 12 from 3 to 2\n" +
            "move 3 from 4 to 1\n" +
            "move 3 from 1 to 6\n" +
            "move 3 from 1 to 6\n" +
            "move 2 from 1 to 5\n" +
            "move 9 from 2 to 7\n" +
            "move 3 from 7 to 3\n" +
            "move 6 from 6 to 5\n" +
            "move 4 from 3 to 6\n" +
            "move 3 from 6 to 9\n" +
            "move 13 from 3 to 8\n" +
            "move 3 from 1 to 9\n" +
            "move 2 from 3 to 2\n" +
            "move 2 from 7 to 8\n" +
            "move 1 from 6 to 8\n" +
            "move 4 from 2 to 8\n" +
            "move 2 from 8 to 3\n" +
            "move 1 from 2 to 1\n" +
            "move 4 from 7 to 3\n" +
            "move 6 from 3 to 5\n" +
            "move 3 from 9 to 8\n" +
            "move 13 from 8 to 6\n" +
            "move 1 from 9 to 2\n" +
            "move 2 from 3 to 8\n" +
            "move 1 from 1 to 9\n" +
            "move 1 from 1 to 3\n" +
            "move 10 from 6 to 3\n" +
            "move 1 from 2 to 5\n" +
            "move 22 from 5 to 7\n" +
            "move 1 from 9 to 3\n" +
            "move 1 from 8 to 7\n" +
            "move 2 from 7 to 8\n" +
            "move 6 from 8 to 4\n" +
            "move 2 from 9 to 2\n" +
            "move 21 from 7 to 6\n" +
            "move 4 from 8 to 5\n" +
            "move 1 from 8 to 4\n" +
            "move 1 from 5 to 7\n" +
            "move 12 from 3 to 6\n" +
            "move 1 from 2 to 6\n" +
            "move 1 from 7 to 9\n" +
            "move 1 from 2 to 6\n" +
            "move 6 from 3 to 5\n" +
            "move 6 from 4 to 2\n" +
            "move 1 from 3 to 6\n" +
            "move 1 from 9 to 7\n" +
            "move 6 from 2 to 7\n" +
            "move 22 from 6 to 4\n" +
            "move 3 from 6 to 5\n" +
            "move 7 from 5 to 7\n" +
            "move 3 from 7 to 8\n" +
            "move 2 from 5 to 3\n" +
            "move 2 from 3 to 7\n" +
            "move 13 from 6 to 8\n" +
            "move 3 from 7 to 1\n" +
            "move 3 from 5 to 9\n" +
            "move 16 from 4 to 5\n" +
            "move 1 from 5 to 8\n" +
            "move 2 from 1 to 6\n" +
            "move 1 from 1 to 7\n" +
            "move 6 from 4 to 2\n" +
            "move 4 from 8 to 7\n" +
            "move 13 from 5 to 7\n" +
            "move 1 from 6 to 3\n" +
            "move 2 from 5 to 6\n" +
            "move 10 from 7 to 6\n" +
            "move 1 from 3 to 9\n" +
            "move 1 from 4 to 3\n" +
            "move 1 from 3 to 5\n" +
            "move 12 from 7 to 3\n" +
            "move 2 from 2 to 1\n" +
            "move 1 from 5 to 9\n" +
            "move 2 from 9 to 6\n" +
            "move 4 from 2 to 7\n" +
            "move 7 from 7 to 9\n" +
            "move 1 from 7 to 8\n" +
            "move 1 from 1 to 9\n" +
            "move 11 from 9 to 7\n" +
            "move 4 from 8 to 3\n" +
            "move 5 from 3 to 5\n" +
            "move 2 from 8 to 4\n" +
            "move 3 from 5 to 2\n" +
            "move 2 from 2 to 8\n" +
            "move 1 from 5 to 2\n" +
            "move 5 from 8 to 2\n" +
            "move 7 from 7 to 2\n" +
            "move 4 from 8 to 9\n" +
            "move 2 from 7 to 6\n" +
            "move 4 from 9 to 7\n" +
            "move 6 from 2 to 4\n" +
            "move 1 from 5 to 6\n" +
            "move 5 from 3 to 5\n" +
            "move 1 from 8 to 1\n" +
            "move 10 from 6 to 3\n" +
            "move 8 from 2 to 8\n" +
            "move 1 from 8 to 1\n" +
            "move 5 from 3 to 2\n" +
            "move 2 from 8 to 7\n" +
            "move 6 from 7 to 4\n" +
            "move 12 from 4 to 1\n" +
            "move 4 from 1 to 2\n" +
            "move 1 from 2 to 1\n" +
            "move 8 from 2 to 9\n" +
            "move 2 from 4 to 8\n" +
            "move 5 from 9 to 7\n" +
            "move 8 from 3 to 8\n" +
            "move 2 from 3 to 1\n" +
            "move 6 from 8 to 2\n" +
            "move 7 from 7 to 2\n" +
            "move 1 from 3 to 5\n" +
            "move 2 from 7 to 2\n" +
            "move 1 from 9 to 1\n" +
            "move 1 from 9 to 7\n" +
            "move 1 from 9 to 4\n" +
            "move 1 from 6 to 7\n" +
            "move 1 from 2 to 3\n" +
            "move 1 from 3 to 8\n" +
            "move 1 from 4 to 9\n" +
            "move 5 from 6 to 1\n" +
            "move 7 from 8 to 2\n" +
            "move 1 from 7 to 4\n" +
            "move 9 from 2 to 8\n" +
            "move 7 from 2 to 7\n" +
            "move 1 from 4 to 2\n" +
            "move 8 from 7 to 5\n" +
            "move 4 from 8 to 7\n" +
            "move 8 from 8 to 6\n" +
            "move 9 from 1 to 4\n" +
            "move 1 from 9 to 1\n" +
            "move 4 from 7 to 6\n" +
            "move 7 from 1 to 7\n" +
            "move 6 from 7 to 3\n" +
            "move 4 from 1 to 8\n" +
            "move 13 from 6 to 3\n" +
            "move 6 from 2 to 3\n" +
            "move 1 from 3 to 4\n" +
            "move 2 from 3 to 7\n" +
            "move 1 from 6 to 9\n" +
            "move 11 from 5 to 1\n" +
            "move 1 from 6 to 3\n" +
            "move 8 from 4 to 1\n" +
            "move 2 from 5 to 2\n" +
            "move 1 from 9 to 5\n" +
            "move 2 from 8 to 7\n" +
            "move 7 from 1 to 5\n" +
            "move 2 from 7 to 3\n" +
            "move 8 from 5 to 4\n" +
            "move 1 from 8 to 2\n" +
            "move 1 from 5 to 7\n" +
            "move 3 from 7 to 2\n" +
            "move 4 from 4 to 7\n" +
            "move 4 from 3 to 4\n" +
            "move 20 from 3 to 2\n" +
            "move 1 from 8 to 3\n" +
            "move 1 from 3 to 8\n" +
            "move 4 from 7 to 2\n" +
            "move 1 from 8 to 6\n" +
            "move 1 from 7 to 5\n" +
            "move 1 from 3 to 1\n" +
            "move 1 from 4 to 2\n" +
            "move 5 from 1 to 4\n" +
            "move 14 from 4 to 1\n" +
            "move 1 from 6 to 5\n" +
            "move 1 from 2 to 3\n" +
            "move 1 from 5 to 1\n" +
            "move 11 from 2 to 9\n" +
            "move 18 from 1 to 2\n" +
            "move 4 from 1 to 3\n" +
            "move 12 from 2 to 5\n" +
            "move 5 from 2 to 4\n" +
            "move 7 from 5 to 1\n" +
            "move 1 from 2 to 9\n" +
            "move 9 from 1 to 9\n" +
            "move 1 from 3 to 6\n" +
            "move 2 from 3 to 9\n" +
            "move 1 from 6 to 1\n" +
            "move 1 from 4 to 8\n" +
            "move 1 from 3 to 4\n" +
            "move 1 from 3 to 8\n" +
            "move 16 from 9 to 5\n" +
            "move 2 from 2 to 7\n" +
            "move 14 from 5 to 8\n" +
            "move 16 from 8 to 5\n" +
            "move 1 from 7 to 9\n" +
            "move 1 from 7 to 6\n" +
            "move 4 from 9 to 5\n" +
            "move 11 from 5 to 6\n" +
            "move 12 from 2 to 4\n" +
            "move 16 from 5 to 7\n" +
            "move 4 from 7 to 2\n" +
            "move 1 from 5 to 6\n" +
            "move 3 from 9 to 1\n" +
            "move 4 from 7 to 9\n" +
            "move 3 from 6 to 4\n" +
            "move 9 from 2 to 9\n" +
            "move 3 from 1 to 8\n" +
            "move 2 from 8 to 1\n" +
            "move 1 from 8 to 2\n" +
            "move 5 from 6 to 1\n" +
            "move 7 from 7 to 1\n" +
            "move 1 from 7 to 6\n" +
            "move 8 from 4 to 5\n" +
            "move 1 from 2 to 6\n" +
            "move 12 from 9 to 2\n" +
            "move 3 from 2 to 9\n" +
            "move 8 from 5 to 8\n" +
            "move 12 from 4 to 5\n" +
            "move 1 from 2 to 9\n" +
            "move 1 from 5 to 6\n" +
            "move 2 from 1 to 7\n" +
            "move 4 from 5 to 2\n" +
            "move 6 from 5 to 1\n" +
            "move 2 from 7 to 6\n" +
            "move 1 from 5 to 1\n" +
            "move 1 from 8 to 5\n" +
            "move 7 from 6 to 9\n" +
            "move 2 from 9 to 4\n" +
            "move 16 from 1 to 8\n" +
            "move 1 from 5 to 8\n" +
            "move 7 from 2 to 8\n" +
            "move 3 from 6 to 2\n" +
            "move 1 from 4 to 8\n" +
            "move 28 from 8 to 3\n" +
            "move 1 from 4 to 2\n" +
            "move 4 from 1 to 2\n" +
            "move 11 from 2 to 7\n" +
            "move 9 from 7 to 8\n" +
            "move 7 from 9 to 5\n" +
            "move 4 from 8 to 1\n" +
            "move 2 from 9 to 1\n" +
            "move 2 from 1 to 5\n" +
            "move 1 from 7 to 9\n" +
            "move 1 from 1 to 9\n" +
            "move 6 from 5 to 3\n" +
            "move 3 from 5 to 1\n" +
            "move 2 from 2 to 8\n" +
            "move 7 from 8 to 3\n" +
            "move 7 from 3 to 7\n" +
            "move 4 from 1 to 9\n" +
            "move 1 from 8 to 9\n" +
            "move 2 from 8 to 1\n" +
            "move 1 from 8 to 1\n" +
            "move 6 from 7 to 6\n" +
            "move 6 from 6 to 5\n" +
            "move 17 from 3 to 6\n" +
            "move 2 from 9 to 2\n" +
            "move 2 from 1 to 4\n" +
            "move 12 from 3 to 8\n" +
            "move 6 from 6 to 5\n" +
            "move 2 from 2 to 1\n" +
            "move 4 from 9 to 7\n" +
            "move 2 from 7 to 3\n" +
            "move 1 from 1 to 5\n" +
            "move 10 from 8 to 6\n" +
            "move 2 from 3 to 9\n" +
            "move 9 from 5 to 2\n" +
            "move 7 from 2 to 8\n" +
            "move 1 from 4 to 8\n" +
            "move 1 from 4 to 6\n" +
            "move 7 from 8 to 7\n" +
            "move 3 from 9 to 7\n" +
            "move 4 from 3 to 4";

    public static void main(String[] args) {

        String[] lines = input.split("\\R");
        List<Stack<String>> stacks = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            stacks.add(new Stack<>());
        }

        for (int i = 7; i >= 0; i--) {
            String[] data = lines[i].split("");
            for (int j = 0; j < 9; j++) {
                String c = data[j * 4 + 1];
                if (!c.trim().isBlank()) {
                    stacks.get(j).push(c);
                }
            }
        }

        for (int i = 10; i < lines.length; i++) {
            String[] instruction = lines[i].split("\\s");
            int nrOfItems = Integer.parseInt(instruction[1]);
            int source = Integer.parseInt(instruction[3]) - 1;
            int destination = Integer.parseInt(instruction[5]) - 1;

            // part 1
            /* for (int j = 0; j < nrOfItems; j++) {
                stacks.get(destination).push(stacks.get(source).pop());
            } */

            // part 2
            List<String> movingItems = new ArrayList<>();

            for (int j = 0; j < nrOfItems; j++) {
                movingItems.add(stacks.get(source).pop());
            }

            Collections.reverse(movingItems);

            for (String movingItem : movingItems) {
                stacks.get(destination).push(movingItem);
            }
        }

        StringBuilder result = new StringBuilder();

        for (Stack<String> stack : stacks) {
            result.append(stack.pop());
        }

        System.out.println(result);
    }
}

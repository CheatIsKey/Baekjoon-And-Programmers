import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] ROW = {2, 2, 1, -1, -2, -2, 1, -1};
    static int[] COL = {-1, 1, 2, 2, 1, -1, -2, -2};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean[][] board = new boolean[6][6];

        String line = br.readLine();

        int startPosCol = line.charAt(0) - 'A';
        int startPosRow = line.charAt(1) - '0' - 1;

        board[startPosRow][startPosCol] = true;

        int prevPosRow = startPosRow;
        int prevPosCol = startPosCol;
        int currPosRow = 0;
        int currPosCol = 0;

        for (int i = 0; i < 35; i++) {
            line = br.readLine();
            char c = line.charAt(0);
            char r = line.charAt(1);
            currPosCol = c - 'A';
            currPosRow = r - '0' - 1;

            if ((Math.abs(prevPosRow - currPosRow) == 2 && Math.abs(prevPosCol - currPosCol) == 1
                    || Math.abs(prevPosRow - currPosRow) == 1 && Math.abs(prevPosCol - currPosCol) == 2)
                    && !board[currPosRow][currPosCol]) {

                board[currPosRow][currPosCol] = true;

                prevPosCol = currPosCol;
                prevPosRow = currPosRow;
                continue;
            }

            System.out.println("Invalid");
            return;
        }

        for (int k = 0; k < ROW.length; k++) {
            int row = prevPosRow + ROW[k];
            int col = prevPosCol + COL[k];

            if (row < 0 || row >= 6 || col < 0 || col >= 6) continue;
            if (startPosRow == row && startPosCol == col) {
                System.out.println("Valid");
                return;
            }
        }

        System.out.println("Invalid");
    }
}



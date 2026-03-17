import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        char[][] board = new char[N][N];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int[] heartPos = new int[0];
        boolean flag = false;

        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                if (board[r][c] == '*') {
                    heartPos = new int[]{r + 1, c};
                    flag = true;
                    break;
                }
            }

            if (flag) {
                break;
            }
        }

        int row = heartPos[0];
        int col = heartPos[1];
        int leftArm = 0;
        int rightArm = 0;
        int waist = 0;
        int leftLeg = 0;
        int rightLeg = 0;

        for (int i = col - 1; i >= 0; i--) {
            if (board[row][i] == '*') {
                leftArm++;
                continue;
            }
            break;
        }

        for (int i = col + 1; i < N; i++) {
            if (board[row][i] == '*') {
                rightArm++;
                continue;
            }
            break;
        }

        for (int i = row + 1; i < N; i++) {
            if (board[i][col] == '*') {
                waist++;
                continue;
            }
            break;
        }

        for (int i = row + waist + 1; i < N; i++) {
            if (board[i][col - 1] == '*') {
                leftLeg++;
                continue;
            }
            break;
        }

        for (int i = row + waist + 1; i < N; i++) {
            if (board[i][col + 1] == '*') {
                rightLeg++;
                continue;
            }
            break;
        }

        System.out.println((row + 1) + " " + (col + 1));
        System.out.println(leftArm + " " + rightArm + " " + waist + " " + leftLeg + " " + rightLeg);
    }
}



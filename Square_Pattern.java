/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(N);
            }
            System.out.println("");
        }

    }
}

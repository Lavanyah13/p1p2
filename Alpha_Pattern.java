import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int N = s.nextInt();
        char c = 65;
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c);

            }
            c++;
            System.out.println("");
        }

    }
}

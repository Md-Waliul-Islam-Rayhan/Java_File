import java.util.Scanner;

public class Naive_Algorithm {
    public static void search(String str, String pattern){
        int n = str.length();
        int m = pattern.length();

        for (int s = 0; s <= n - m; s++) {
            int j;
            for (j = 0; j < m; j++)
                if (str.charAt(s + j) != pattern.charAt(j))
                    break;
            if (j == m)
                System.out.println("Pattern occurs at index: " + s);
        }
    }

        /*txt = "AABAACAADAABAAABAA";
    pat = "AABA";*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Text: ");
        String txt = input.nextLine();

        System.out.print("Enter the pattern: ");
        String pat = input.nextLine();

        search(txt, pat);
    }
}

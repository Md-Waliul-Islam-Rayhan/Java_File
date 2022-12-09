import java.util.Scanner;

public class KMP_Algorithm {
    void KMPSearch(String pat, String txt)
    {
        int M = pat.length();
        int N = txt.length();

        int lps[] = new int[M];
        int j = 0;

        computeLPSArray(pat, M, lps);

        int i = 0;
        while ((N - i) >= (M - j)) {
            if (pat.charAt(j) == txt.charAt(i)) {
                j++;
                i++;
            }
            if (j == M) {
                System.out.println("Found pattern "
                        + "at index " + (i - j));
                j = lps[j - 1];
            }

            else if (i < N && pat.charAt(j) != txt.charAt(i)) {

                if (j != 0)
                    j = lps[j - 1];
                else
                    i = i + 1;
            }
        }
    }

    void computeLPSArray(String pat, int M, int lps[])
    {
        int len = 0;
        int i = 1;
        lps[0] = 0;

        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {

                if (len != 0) {
                    len = lps[len - 1];


                }
                else
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
    }

    /*        String txt = "ABABDABACDABABCABAB";
        String pat = "ABABCABAB";*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Text: ");
        String txt = input.nextLine();

        System.out.print("Enter the pattern: ");
        String pat = input.nextLine();

        new KMP_Algorithm().KMPSearch(pat, txt);
    }
}

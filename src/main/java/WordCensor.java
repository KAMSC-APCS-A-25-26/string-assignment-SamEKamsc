import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        StringBuilder sb = new StringBuilder(line);
        while (sb.indexOf("dang") != -1) {
            sb.replace(sb.indexOf("dang"), sb.indexOf("dang") + 4, "***");
        }
        while (sb.indexOf("nuts") != -1) {
            sb.replace(sb.indexOf("nuts"), sb.indexOf("nuts") + 4, "***");
        }
        while (sb.indexOf("oops") != -1) {
            sb.replace(sb.indexOf("oops"), sb.indexOf("oops") + 4, "***");
        }
        while (sb.indexOf("yikes") != -1) {
            sb.replace(sb.indexOf("yikes"), sb.indexOf("yikes") + 5, "***");
        }
        System.out.println("Censored: " + sb.toString());
    }
}

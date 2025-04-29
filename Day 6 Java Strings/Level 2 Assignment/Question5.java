import java.util.Arrays;import java.util.Scanner;
public class Question5 {

    public static String ToLowerCase (String text) {
        int length = text.length();
        StringBuilder ASCII = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ASCII.append((char) (ch + 32));
            }
            else {
                ASCII.append(ch);
            }
        }
        return ASCII.toString();
    }

    public static int[] VowelsOrConsonants (String text) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        StringBuilder vows = new StringBuilder();
        StringBuilder cons = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            boolean isVowel = false;
            for (char v : vowels) {
                if (ch == v) {
                    vows.append(ch);
                    isVowel = true;
                    break;
                }
            }
            if (!isVowel && ch >= 'a' && ch <= 'z') {
                cons.append(ch);
            }
        }
        int v = vows.length();
        int c = cons.length();
        return new int[]{v, c};
    }

    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String text = input.nextLine();
        String lower = ToLowerCase(text);
        int[] count = VowelsOrConsonants(lower);
        System.out.println("Vowels count: " + count[0]);
        System.out.println("Consonants count: " + count[1]);
        input.close();
    }
}
;
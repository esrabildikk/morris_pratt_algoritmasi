import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // dosya okuma
        File file = new File(System.getProperty("user.home") + "\\Desktop\\alice_in_wonderland.txt");
        String text = "";
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                text += scanner.nextLine() + "\n";
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // upon kelimesinin sayısı :
        String pattern = "upon";
        int count = countOccurrences(text, pattern);
        System.out.println("Upon kelimesinin sayısı: " + count);

        // sigh kelimesinin sayısı :
        pattern = "sigh";
        count = countOccurrences(text, pattern);
        System.out.println("Sigh kelimesinin sayısı " + count);

        // Dormouse kelimesinin sayısı:
        pattern = "Dormouse";
        count = countOccurrences(text, pattern);
        System.out.println("Dormouse kelimesinin sayısı: " + count);

        // jury-box kelimesinin sayısı (Morris-Pratt)
        pattern = "jury-box";
        count = countOccurrences(text, pattern);
        System.out.println("Jury-box kelimesinin sayısı : " + count);

        //swim kelimesinin sayısı:
        pattern = "swim";
        count = countOccurrences(text,pattern);
        System.out.println("swim kelimesinin sayısı: "+count);
    }

    public static int countOccurrences(String text, String pattern) {
        int[] prefix = prefixTable(pattern);
        int count = 0;
        int i = 0, j = 0;
        while (i < text.length()) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                count++;
                j = prefix[j - 1];
            } else if (i < text.length() && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0)
                    j = prefix[j - 1];
                else
                    i++;
            }
        }
        return count;
    }

    public static int[] prefixTable(String pattern) {
        int[] prefix = new int[pattern.length()];
        prefix[0] = 0;
        int i = 1, j = 0;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
                prefix[i] = j;
                i++;
            } else {
                if (j != 0) {
                    j = prefix[j - 1];
                } else {
                    prefix[i] = 0;
                    i++;
                }
            }
        }
        return prefix;
    }
}

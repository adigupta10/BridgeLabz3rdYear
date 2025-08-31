package Level3;
import java.util.Scanner;

public class CharFrequencyNested {

    // Method to find frequency of characters using nested loops
    public static String[] charFrequency(String text) {
        char[] chars = text.toCharArray();   // store characters
        int[] freq = new int[chars.length];  // store frequencies

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1; // initialize frequency

            if (chars[i] == '0') // already counted
                continue;

            // inner loop to check duplicates
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark as counted
                }
            }
        }

        // Step 2: Store results in 1D String array
        String[] result = new String[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') { // ignore marked duplicates
                result[index] = chars[i] + " -> " + freq[i];
                index++;
            }
        }

        // Step 3: Resize array to exact size
        String[] finalResult = new String[index];
        for (int i = 0; i < index; i++) {
            finalResult[i] = result[i];
        }

        return finalResult;
    }

    // Display Method
    public static void display(String[] arr) {
        System.out.println("Character | Frequency");
        System.out.println("----------------------");
        for (String s : arr) {
            System.out.println("   " + s);
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequency = charFrequency(text);

        display(frequency);
    }
}

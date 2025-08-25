import java.util.Scanner;

public class ShortestLongestWord {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    public static String[] manualSplit(String text) {
        int length = getLength(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int start = 0, index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }
        words[index] = text.substring(start, length);
        return words;
    }

    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestAndLongest(String[][] wordTable) {
        String shortest = wordTable[0][0];
        String longest = wordTable[0][0];
        int minLen = Integer.parseInt(wordTable[0][1]);
        int maxLen = minLen;

        for (String[] row : wordTable) {
            int len = Integer.parseInt(row[1]);
            if (len < minLen) {
                minLen = len;
                shortest = row[0];
            }
            if (len > maxLen) {
                maxLen = len;
                longest = row[0];
            }
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = manualSplit(text);
        String[][] table = getWordsWithLength(words);
        String[] result = findShortestAndLongest(table);

        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}

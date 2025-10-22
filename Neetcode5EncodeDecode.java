 import java.util.*;
public class Neetcode5EncodeDecode {

  



    // Step 1️⃣: Encode a list of strings into one string
    public static String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String s : strs) {
            // Add length of string, then '#', then the string itself
            encoded.append(s.length()).append('#').append(s);
        }

        return encoded.toString();
    }

    // Step 2️⃣: Decode that single string back to list of strings
    public static List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            // 1️⃣ find where '#' is (to get the length)
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }

            // 2️⃣ get length of string
            int length = Integer.parseInt(s.substring(i, j));

            // 3️⃣ move pointer after '#'
            j++;

            // 4️⃣ take the next 'length' characters
            String word = s.substring(j, j + length);
            result.add(word);

            // 5️⃣ move i to next string’s start
            i = j + length;
        }

        return result;
    }

    // Step 3️⃣: Test both functions
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        String encoded = encode(words);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}



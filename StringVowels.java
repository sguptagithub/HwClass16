package Class16HW;

public class StringVowels {
    /*Create a method that will accept a String as a parameter
    and return a new String that consists only of vowels.
    Method should be available inside the class only where it was declared
    and executed by calling it is name.*/
         private static String extractVowels(String str) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    sb.append(c);
                }
            }
            return sb.toString();
        }

        public static void main(String[] args) {
            String originalStr = "Hello, World!";
            String vowelsStr = extractVowels(originalStr);
            System.out.println(vowelsStr);
        }
    }



package Class16HW;

public class reverseString {
     /*Create a method that will take a string as a parameter and returns reversed String.
  Method should be available to all classes within your project and accessible by class name.*/

    public static String reverse(String input) {
        StringBuilder newReverce = new StringBuilder(input);
        newReverce.reverse();
        String r = newReverce.toString();
        return r;
    }

    public static void main(String[] args) {

        String result = reverseString.reverse("Hello");
        System.out.println(result);


    }
}
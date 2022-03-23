package replit_Turkish;

public class Yeni {
    public static void main(String[] args) {
        /* Interview Question
             Write a Java program to reverse a string.
              Use for loop and create a method called
               reverseString */

        String str="hello world";

        reverseString(str);


    }

    private static void reverseString(String str) {

        for (int i=str.length()-1;i>=0; i--){
            System.out.print(str.charAt(i));

        }
        System.out.print("\n");

    }
}

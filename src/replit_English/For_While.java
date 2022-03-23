package replit_English;

public class For_While {
    public static void main(String[] args) {
        /*Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

e.g:

char ch1= 'a' ;

String name =“John came late"

Expected Output: Number of a = 2*/
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");

        String name = sc.next();
        System.out.println("Enter a letter");
        char harf = sc.next().charAt(0);

        int sum = 0;
        for (int i = 0; i < name.length(); i++) {
            if (harf == name.charAt(i)) {
                sum++;
            }

        }
        System.out.println(sum);
    }
}

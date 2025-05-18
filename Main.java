 import java.util.Scanner;
 import java.lang.String;
 public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the bot:");
        String botName = input.nextLine();

        System.out.println("Year the bot was created: ");
        int birthYear = input.nextInt();
        input.nextLine(); // consumes extra new line as only number is read.
        Main.greeting(botName, birthYear);
        // user Info
        System.out.println("Please, remind me your name.");
        String nameUser = input.nextLine();
        Main.userInfo(nameUser);

        // Age guessing Game
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        int rem3 = input.nextInt();
        int rem5 = input.nextInt();
        int rem7 = input.nextInt();
        input.nextLine();

        Main.guessTheAge(rem3, rem5, rem7);



        
    }

    public static void greeting(String botName, int birthYear){
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
    }

    public static void userInfo(String nameUser){
        System.out.println("What a great name you have, " + nameUser + "!");
        
    }

    public static void guessTheAge(int rem3, int rem5, int rem7){
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println(String.format("Your age is %d; that's a good time to start programming!", age));
    }
 }
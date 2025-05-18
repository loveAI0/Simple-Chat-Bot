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
    }

    public static void greeting(String botName, int birthYear){
        System.out.println("Hello! My name is " + botName + ".");
        System.out.println("I was created in " + birthYear + ".");
    }

    public static void userInfo(String nameUser){
        System.out.println("What a great name you have, " + nameUser + "!");
        
    }
 }
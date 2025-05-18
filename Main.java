 import java.util.Scanner;
 import java.lang.String;
 public class Main {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of the bot:");
        String botName = input.nextLine();

        System.out.println("Year the bot was created: ");
        int birthYear = input.nextInt();

        Main.greeting(botName, birthYear);
    }

    public static void greeting(String botName, int birthYear){
        System.out.println("Hello! My name is " + String.format("%s", botName));
        System.out.println("I was created in " + String.format("%d", birthYear));
    }
 }
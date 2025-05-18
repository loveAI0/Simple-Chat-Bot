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

        // count number
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int targetNum = input.nextInt();
        Main.countNumber(targetNum);

        // play Quiz

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        System.out.println("Answer: ");
        int answer = input.nextInt();

        Main.playQuiz(answer);
        
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

    public static void countNumber(int targetNum){
        for(int i = 0; i <= targetNum; i++){
            System.out.println(String.format("%d!", i));
        }
        System.out.println("Completed, have a nice day!");
    }

    public static void playQuiz(int answer){
        boolean flag = true;
        
        while(flag){
            System.out.println("Choose from the option:");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if(choice == answer){
                System.out.println("Congratulations, have a nice day!");
                flag = false;
            }
            else{
                System.out.println("Please, try again.");
            }
        }
    }
 }
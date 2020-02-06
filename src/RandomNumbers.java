import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args){
        var randGenerator = new Random();
        var number = randGenerator.nextInt(10)+1;
        System.out.println("Guess a number from 1 to 10");
        var reader = new Scanner(System.in);
        var user_guess = reader.nextInt();
       /* while(user_guess != number) {
            if (user_guess < number) {
                System.out.println("The number you have guessed is to low.");
                System.out.println("Try to guess a number from 1 to 10 again.");
                user_guess = reader.nextInt();
            }
            if(user_guess > number){
                System.out.println("The number you have guessed is to high.");
                System.out.println("Try to guess a number from 1 to 10 again.");
                user_guess = reader.nextInt();
            }
        }*/
      while(user_guess != number){
            if (user_guess < number) {
                System.out.println("The number you have guessed is to low.");
            }
            else
                System.out.println("The number you have guessed is to high.");
          System.out.println("Enter a new guess.");
          user_guess = reader.nextInt();
                }


        if(user_guess == number)
            System.out.println("You guessed "+number+" which is correct!");
    }
}


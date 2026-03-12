import java.util.*;
public class Guess {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Random rand=new Random();

    int number=rand.nextInt(100)+1;
    int guess=0;
    System.out.println("===Number Guessing Game===");

    while(guess != number){
        System.out.print("Enter Your Number: ");
        guess=sc.nextInt();

        if(guess>number){
            System.out.println("Oops,Your Number Is too High..!");
        }else if(guess<number){
            System.out.println("Oops,Your Number Is too Low..!");
        }else{
            System.out.println("Wow,You are correct..!");
        }
    }
    sc.close();
    
}
}
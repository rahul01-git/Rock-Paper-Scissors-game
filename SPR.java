import java.util.Random;
import java.util.Scanner;

public class SPR{
    public static void main(String[] args) {
        //take input from user S,P,R
        Scanner inputObj = new Scanner(System.in);
        System.out.print("Please enter s, P, or R: ");
        char userMove = Character.toUpperCase(inputObj.next().charAt(0));
        System.out.println("User Gave >> " + userMove);

        //make computer choose any one
        char[] npcMove = {'S','P','R'};  
        Random random = new Random();
        int n = random.nextInt(3);
        System.out.println("AI choose >> " + npcMove[n]);

        if(userMove == npcMove[n]){
            System.out.println("Draw");
        }else if(userMove == 'S'){
            if(npcMove[n]=='P'){
                System.out.println("User Won");
            }else{
                System.out.println("AI Won");
            }
        }else if(userMove == 'P'){ 
            if(npcMove[n]=='R'){
                System.out.println("User Won");
            }else{
                System.out.println("AI Won");
            }
        }else{
            if(npcMove[n]=='S'){
                System.out.println("User Won");
            }else{
                System.out.println("AI Won");
            }
        }
        

        inputObj.close();
    }
}
import java.util.Random;
import java.util.Scanner;

public class SPR {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        char replay = 'j';
        do{
             //take input from user S,P,R
            System.out.println("");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("-----------------------Scissor Paper Rock Game--------------------------");
            System.out.println("------------------------------------------------------------------------");
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
            System.out.println("");
            System.out.println("Replay ?(y/n)");
            replay = inputObj.next().charAt(0);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("------------------------------------------------------------------------");
            System.out.println("");
        }while(replay=='y');
       
        

        inputObj.close();
    }
}
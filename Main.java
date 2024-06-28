import java.util.Random;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        int H=0,T=0;
        String name;
        System.out.println("Who are you?");
        System.out.print(">");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Hello, "+name+"!");
        System.out.println("Tossing a coin...");
        for(int i=0;i<3;i++){
            Random random = new Random();
            int randomValue = random.nextInt(100);
            switch (randomValue%2) {
                case 0:
                    System.out.println("Round"+i+": Heads");
                    H++;
                    break;
                case 1:
                    System.out.println("Round"+i+": Tails");
                    T++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Heads: "+H+", Tails: "+T);
        if(H>T){
            System.out.println(name+" win");
        }else{
            System.out.println(name+" lost");
        }
    }
    
}
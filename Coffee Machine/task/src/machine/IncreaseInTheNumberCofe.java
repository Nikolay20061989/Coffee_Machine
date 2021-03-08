package machine;

import java.util.Scanner;

public class IncreaseInTheNumberCofe {
    void increaseInTheNumberCofe(){
        System.out.println("Write how many cups of coffee you will need:");
        int a;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        System.out.println("For "+a+" cups of coffee you will need:");
        System.out.println(a*200+" ml of water");
        System.out.println(a*50+" ml of milk");
        System.out.println(a*15+" g of coffee beans");
    }
}

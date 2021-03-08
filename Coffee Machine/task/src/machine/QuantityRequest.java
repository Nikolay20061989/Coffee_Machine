package machine;

import java.util.Scanner;

public class QuantityRequest {
    int water;
    int milk;
    int coffee;
    int needCoffee;
    int makeCoffee;
    void quantityRequestCoffee(){
        {Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        water=sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        milk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        coffee=sc.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        needCoffee=sc.nextInt();}
        int min1=water/200; int min2=milk/50; int min3=coffee/15;
        makeCoffee=min1<min2?(min1<min3?min1:min3):(min2<min3?min2:min3);
       if (needCoffee==makeCoffee) System.out.println("Yes, I can make that amount of coffee");
       if (needCoffee<makeCoffee) System.out.println("Yes, I can make that amount of coffee (and even "+ (makeCoffee-needCoffee) +" more than that)");
       if (needCoffee>makeCoffee) System.out.println("No, I can make only "+makeCoffee+" cup(s) of coffee");









    }



}

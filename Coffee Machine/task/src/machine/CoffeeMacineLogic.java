package machine;

import java.util.Scanner;

public class CoffeeMacineLogic {
    int water= 400;
    int milk = 540;
    int coffee =120;
    int cups=9;
    int money = 550;
    boolean bol=true;
    void printMachineHas(){
        System.out.println("The coffee machine has:");
        System.out.println(water+ " of water");
        System.out.println(milk+" of milk");
        System.out.println(coffee+" of coffee beans");
        System.out.println(cups+" of disposable cups");
        System.out.println(money+" of money\n");
    }
    void take(){
        System.out.println("I gave you $"+money);
        money=0;

    }
    void fill(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        water=water+scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk=milk+scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffee=coffee+scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        cups=cups+scanner.nextInt();
        System.out.println();

      //  printMachineHas();
    }//scanner
    void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        Scanner sc=new Scanner(System.in);
        String temp =sc.next();
        switch (temp){
            case "1":
                if(water<250){ System.out.println("Sorry, not enough water!");break;}
                else if (coffee<16) {System.out.println("Sorry, not enough coffee!");break;}
                else if(cups<1) {System.out.println("Sorry, not enough cups!");break;}
                else water=water-250;coffee=coffee-16;money=money+4;cups=cups-1;break;

            case "2":
                if(water<350){ System.out.println("Sorry, not enough water!");break;}
                else if (milk<75) {System.out.println("Sorry, not enough milk!");break;}
                else if (coffee<12) {System.out.println("Sorry, not enough coffee!");break;}
                else if(cups<1) {System.out.println("Sorry, not enough cups!");break;}
                else water=water-350;coffee=coffee-20;milk=milk-75;money=money+7;cups=cups-1;;break;

            case "3":
                if(water<200){ System.out.println("Sorry, not enough water!");break;}
                else if (milk<100) {System.out.println("Sorry, not enough milk!");break;}
                else if (coffee<20) {System.out.println("Sorry, not enough coffee!");break;}
                else if(cups<1) {System.out.println("Sorry, not enough cups!");break;}
                else water=water-200;coffee=coffee-12;milk=milk-100;money=money+6;cups=cups-1;
                System.out.println("I have enough resources, making you a coffee!");
               break;
               case "back":break;

        } System.out.println("");
     //   printMachineHas();

    }//sc
    void play(){
while (bol==true) {
    System.out.println("Write action (buy, fill, take, remaining, exit):");
    Scanner scan = new Scanner(System.in);
    String command = scan.next();
    switch (command) {
        case "buy":
            buy();
            break;
        case "fill":
            fill();
            break;
        case "take":
            take();
            break;
        case "remaining":
            printMachineHas();
            break;
        case "exit": bol=false;

    }

}

    }//scan


}

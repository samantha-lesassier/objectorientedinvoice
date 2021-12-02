package com.company;
import java.util.Scanner;

public class Invoice {
    double[] Prices = {55.99, 14.99, 23.99, 4.99};
    double total = 0.00;
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;

    public int setUp() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number [1-4] of the item you would like to purchase,\n" +
                "or the number 5 to stop shopping:\n(If you dont enter a numeric-character, I will quit.)");
        System.out.println();
        System.out.print("1) Bison Sweater\n2) Bison Tee\n3) Bison Hoodie\n4) Bison BumperSticker\n5) I'm done shopping!\n\nYour Choice: ");
        int user_choice = 0;
        user_choice = scan.nextInt();
        return user_choice;
    }

    public void shop() {
        int user_choice;
        Scanner scan = new Scanner(System.in);
        user_choice = setUp();
        if (user_choice != 5) {
            if (user_choice >= 1 && user_choice <= 5) {
                total += Prices[user_choice - 1];
                if (user_choice == 1) {
                    count1 += 1;
                } else if (user_choice == 2) {
                    count2 += 1;
                } else if (user_choice == 3) {
                    count3 += 1;
                } else if (user_choice == 4) {
                    count4 += 1;
                }
                System.out.print("Your total is now $");
                System.out.printf("%.2f", total);
                System.out.println();
                System.out.println("You have bought " + count1 + " Bison Sweater(s), " + count2 + " Bison Tee(s), " + count3 + " Bison Hoodie(s) and " + count4 + " Bison BumperSticker(s)");
            } else {
                while (!(user_choice >= 1 && user_choice <= 5)) {
                    System.out.println("Please input a valid number [1-5]");
                    System.out.print("Your new choice: ");
                    user_choice = scan.nextInt();
                    System.out.println();
                }
                if (user_choice != 5) {
                    total += Prices[user_choice - 1];
                    if (user_choice == 1) {
                        count1 += 1;
                    } else if (user_choice == 2) {
                        count2 += 1;
                    } else if (user_choice == 3) {
                        count3 += 1;
                    } else if (user_choice == 4) {
                        count4 += 1;
                    }
                    System.out.print("Your total is now $");
                    System.out.printf("%.2f", total);
                    System.out.println();
                    System.out.println("You have bought " + count1 + " Bison Sweater(s), " + count2 + " Bison Tee(s), " + count3 + " Bison Hoodie(s) and " + count4 + " Bison BumperSticker(s)");
                } else {
                    System.out.println("I see. Get your funds in order and then come back! Have a nice day!");
                }
            }
        } else {
            System.out.println("I see. Get your funds in order and then come back! Have a nice day!");
        }
        
        while (user_choice != 5) {
            System.out.println();
            System.out.print("Would you like to purchase anything else:\n1) Bison Sweater\n2) Bison Tee\n3) Bison Hoodie\n4) Bison BumperSticker\n5) I'm done shopping!\n\n(If you dont enter a numeric-character, I will quit.)\nYour Choice: ");
            user_choice = scan.nextInt();
            while (!(user_choice >= 1 && user_choice <= 5)) {
                System.out.println("Please input a valid number [1-5]");
                System.out.print("Your new choice: ");
                user_choice = scan.nextInt();
                System.out.println();
            }
            if (user_choice != 5) {
                total += Prices[user_choice - 1];
                if (user_choice == 1) {
                    count1 += 1;
                } else if (user_choice == 2) {
                    count2 += 1;
                } else if (user_choice == 3) {
                    count3 += 1;
                } else if (user_choice == 4) {
                    count4 += 1;
                }
                System.out.print("Your total is now $");
                System.out.printf("%.2f", total);
                System.out.println();
                System.out.println("You have bought " + count1 + " Bison Sweater(s), " + count2 + " Bison Tee(s), " + count3 + " Bison Hoodie(s) and " + count4 + " Bison BumperSticker(s)");
            } else {
                System.out.println();
                System.out.print("Your final total is $");
                System.out.printf("%.2f", total);
                System.out.println();
                System.out.println("Have a nice day!");
            }
        }
    }
}

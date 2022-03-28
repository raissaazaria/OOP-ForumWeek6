package com.company;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); // creating object for user
        System.out.println("Enter the number of items: ");
        int NUM_ITEMS = scanner.nextInt(); // reads character and convert into int type
        int items[] = new int[NUM_ITEMS]; // new array are created from the previous line
        System.out.println("Enter the value of all items (separated by space): ");
        for (int i = 0; i < items.length; i++) { // storing new array which will be used on printing
            items[i] = scanner.nextInt(); // scan the next input as an int
        }

        System.out.println("The Values are: {");
        for (int i= 0; i < NUM_ITEMS ; i++) {
            if (i == NUM_ITEMS - 1){
                System.out.print(items[i] + "]");
            }
            else {
                System.out.print(items[i]+ ", ");
            }
         }
    }
}

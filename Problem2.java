package com.company;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // creating objects for users
        System.out.print("Enter the number of the items: "); // printing an output which later ask user to input something
        int NUM_ITEMS = input.nextInt(); // reads character
        int [] items = new int[NUM_ITEMS];
        System.out.println("Enter the value of all items (separated by space): ");// ask user to input a value
        for(int i = 0; i < items.length; i++){ // storing new array
            items[i] = input.nextInt(); // storing values
        }
        for(int i = 0; i < items.length; i++){ // using loop for array values
            System.out.print(i + ": ");
            for(int j = 0; j < items[i]; j++){
                System.out.print('*');
            }
            System.out.println("("+ items[i] + ")");
        }}
}

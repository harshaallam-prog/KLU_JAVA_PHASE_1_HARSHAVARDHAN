/*
 * Program: HV_D17_P4_Processor
 * Author: Harsha Vardhan
 * Email: harshaallamallam@gmail.com
 * Date: 24-07-2026
 * Description: Day 17 - Program 4
 * KL University - Placement Training
 */

import java.util.Scanner;

public class HV_D17_P4_Processor {
    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Day 17 - Program 4");
        System.out.println("Created by: Harsha Vardhan");
        
        System.out.print("Enter a number: ");
        int inputNumber = userInputScanner.nextInt();
        System.out.println("You entered: " + inputNumber);
        
        userInputScanner.close();
    }
}

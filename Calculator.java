/*
    * Calculator using java with ArrayList
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        String number[] = {"First", "Second"};
        
        while(true) {
            System.out.println("Calculator using Java");
            
            numbers.clear();
        
            for(int i = 0; i < 2; i++)  {
                boolean isValid = false;

                while(!isValid) {
                    try {
                        System.out.print("Enter " + number[i] + " number: ");
                        int num = s.nextInt();
                        numbers.add(num);
                        isValid = true;
                    } catch(InputMismatchException e) {
                        System.out.println("You need to enter valid number.");
                        s.next();
                    }
                }
            }
            
            s.nextLine();
            
            System.out.print("Enter operation (+ - * /): ");
            String operation = s.nextLine();
            
            if(operation.equals("+")) {
                System.out.println(numbers.get(0) + " + " + numbers.get(1) + " = " + (numbers.get(0) + numbers.get(1)));
            } else if(operation.equals("-")) {
                System.out.println(numbers.get(0) + " - " + numbers.get(1) + " = " + (numbers.get(0) - numbers.get(1)));
            } else if(operation.equals("*")) {
                System.out.println(numbers.get(0) + " * " + numbers.get(1) + " = " + (numbers.get(0) * numbers.get(1)));
            } else if(operation.equals("/")) {
                System.out.println(numbers.get(0) + " / " + numbers.get(1) + " = " + (numbers.get(0) / numbers.get(1)));
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

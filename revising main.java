import java.util.Scanner;
import java.lang.Math;
public class d{
	
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      String y = "Y";
      
      while (y.equals("Y") || y.equals("y")) {
         String operation = "-";
         String operationName;
         System.out.println("Enter the calculator mode: Standard/Scientific?");
         String calcMode = scnr.next();
      
         if (calcMode.equals("Standard") || calcMode.equals("standard")) {
            System.out.println("The calculator will operate in standard mode.");
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
            operation = scnr.next();
               while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")){
                  System.out.println("Invalid calculator operation.");
                  System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
                  operation = scnr.next();
               }
         }
         else if (calcMode.equals("Scientific") || calcMode.equals("scientific")) {
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
            operation = scnr.next();
               while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/") && !operation.equals("sin") && !operation.equals("cos") && !operation.equals("tan")) {
                  System.out.println("Invalid calculator operation.");
                  System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
                  operation = scnr.next();
               }
         }
         else {
        	 System.out.println("Invalid calculator mode.");
        	 System.out.println("Enter the calculator mode: Standard/Scientific?");
        	 calcMode = scnr.next();
            	while ( (!calcMode.equals("Scientific")) || (!calcMode.equals("scientific")) || (!calcMode.equals("Standard")) || (!calcMode.equals("standard"))) {
            		System.out.println("Invalid calculator mode.");
            		System.out.println("Enter the calculator mode: Standard/Scientific?" );
            		operation = scnr.next();
            	}
            	continue;
         }
         
         double inputOne;
         double inputTwo;
         double finalResult = 1;
         double sum = 0;
         double difference = 0;
         double product = 1;
         double quotient = 1;
         double radianValue;
            
         operationName = "subtract";
            switch (operation) {
            case "+":
               operationName = "add";
               break;
            case "-":
               operationName = "subtract";
               break;
            case "*":
               operationName = "multiply";
               break;
            case "/":
               operationName = "divide";
               break;
            case "sin":
               operationName = "sine";
               break;
            case "cos":
               operationName = "cosine";
               break;
            case "tan":
               operationName = "tangent";
               break;
            }
               
            
            if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
               
               System.out.println("How many numbers do you want to " + operationName + "?");
               int n = scnr.nextInt();
               System.out.println("Enter " + n + " numbers");
               
                  if (operation.equals("+")) {
                     for (int i = 1; i<=n; ++i) {
                        inputOne = scnr.nextDouble();
                        sum = sum + inputOne;
                        finalResult = sum;
                     }
                  }
               
                  if (operation.equals("-")) {
                     if (n > 1) {
                        inputOne = scnr.nextDouble();
                        inputTwo = scnr.nextDouble();
                        difference = inputOne - inputTwo;
                        finalResult = difference;
                        for (int i = 1; i <= (n-2); ++i) {
                           inputOne = scnr.nextDouble();
                           difference = difference - inputOne;
                           finalResult = difference;
                        }
                     }
                  }
                  
                  if (operation.equals("*")){
                     for (int i = 1; i<=n; ++i) {
                        inputOne = scnr.nextDouble();
                        product = product * inputOne;
                        finalResult = product;
                     }
                  }
                  
                  if (operation.equals("/")) {
                     if (n > 1) {
                        inputOne = scnr.nextDouble();
                        inputTwo = scnr.nextDouble();
                        quotient = inputOne / inputTwo;
                        finalResult = quotient;
                        for (int i = 1; i <= (n-2); ++i) {
                           inputOne = scnr.nextDouble();
                           quotient = quotient / inputOne;
                           finalResult = quotient;
                        }
                     }
                  }
            }
                  
            if ( ((operation.equals("sin")) || (operation.equals("cos")) || (operation.equals("tan"))) && ((calcMode.equals("Scientific") || calcMode.equals("scientific"))) ) {
               System.out.println("Enter a number in radians to find the " + operationName);
               radianValue = scnr.nextDouble();
               
               if (operation.equals("sin")) {
                  finalResult = Math.sin(radianValue);
               }
               
               if (operation.equals("cos")) {
                  finalResult = Math.cos(radianValue);
               }
               if (operation.equals("tan")) {
                  finalResult = Math.tan(radianValue);
               }
            }
            
            System.out.println("Result: " + finalResult);   
            System.out.println("Do you want to start over? (Y/N)");
            y = scnr.next();
            if (y.equals("N") || y.equals("n")) {
               System.out.println("Goodbye");
            }
         }
      }
   }


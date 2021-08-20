package com.calculator;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		char operator;
	    Double numb1, numb2, answer;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);
	    
	    try{
	      System.out.println("Enter first number");
	      numb1 = input.nextDouble();
	      System.out.println("Enter second number");
	      numb2 = input.nextDouble();
	      
	      switch (operator) {
	      
	        case '+':
	        answer = numb1 + numb2;
	        System.out.println(numb1 + " + " + numb2 + " = " + answer);
	        break;
	        
	        case '-':
	        answer = numb1 - numb2;
	        System.out.println(numb1 + " - " + numb2 + " = " + answer);
	        break;
	        
	        case '*':
	        answer = numb1 * numb2;
	        System.out.println(numb1 + " * " + numb2 + " = " + answer);
	        break;
	        
	        case '/':
	        if (numb2 != 0){
	          answer = numb1 / numb2;
	          System.out.println(numb1 + " / " + numb2 + " = " + answer);
	        }
	        else{
	          throw new ArithmeticException("Dividing number by 0 is not allowed in this calculator");
	        }
	        break;
	        
	        default:
	        System.out.println("Invalid operator!");
	        break;
	      }
	    
	    }
	    catch(ArithmeticException e){
	      System.out.println(e.getMessage());
	    }
	    catch(ArrayIndexOutOfBoundsException e){
	      System.out.println("Warning: ArrayIndexOutOfBoundsException");
	    }
	    catch(Exception e){
	      System.out.println("input should be in form of number 123");
	    }
	}

}

/**
 * 
 */


/**
 * 
 */
import java.util.Scanner;


public class ArithmeticOperatorSwitch2 {

	

			/**
			 * @param args
			 */
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner n = new Scanner(System.in);
				
				int answer;
				System.out.println("1. ADDITION");
				System.out.println("2. SUBTRACTION");
				System.out.println("3. MULTIPLICATION");
				System.out.println("4. DIVISION");
				System.out.println("5. MODULOUS");
				System.out.println("6. INCREMENT");
				System.out.println("7. DECREMENT");
		System.out.println("Enter your number what you want to do");
		        int i = n.nextInt();

		         
		        switch(i) {
		        case 1: System.out.println("Enter any two numbers for the purpose");
		                int a = n.nextInt();
		                int b = n.nextInt();
		        	    answer = a+b;
		                System.out.println("Your Answer is "+answer);
		                break;
		        case 2: System.out.println("Enter any two numbers for the purpose");
		        int c = n.nextInt();
		        int d = n.nextInt();
		        	answer = c-d;
		                System.out.println("Your Answer is "+answer);
		                break;
		        case 3: System.out.println("Enter any two numbers for the purpose");
		        int e = n.nextInt();
		        int f = n.nextInt();
		        	answer = e*f;
		                System.out.println("Your Answer is "+answer);
		                break;
		        case 4: System.out.println("Enter any two numbers for the purpose");
		        int g = n.nextInt();
		        int h = n.nextInt();
		        	answer = g/h;
		                System.out.println("Your Answer is "+answer);
		                break;
		        case 5:System.out.println("Enter any two numbers for the purpose");
		        int j = n.nextInt();
		        int k = n.nextInt();
		        	answer = j%k;
		                System.out.println("Your Answer is "+answer);
		                break;
		        case 6:  System.out.println("Enter a numbers for the purpose");  
		               int l = n.nextInt();
		        answer = ++l;
		                System.out.println("Your Answer is "+answer);
		                break;
		        case 7: System.out.println("Enter a numbers for the purpose"); 
		                int m = n.nextInt();
		                answer = --m;
		                System.out.println("Your Answer is "+answer);
		               break; 
		       default:  System.out.println("Invalid");   
		                 break;   
		        }
		        }

			
			


	}



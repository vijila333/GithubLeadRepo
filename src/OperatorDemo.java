import java.util.Scanner;


public class OperatorDemo {
    int num1,num2;
    public int add(int n1,int n2) {
    	return (n1+n2);
    }
    public int difference (int n1,int n2) {
    	return (n1-n2);
    }
    public int multiply (int n1,int n2) {
    	return (n1*n2);
    }
    public int division (int n1,int n2) {
    	return (n1/n2);
    }
    public int remainder (int n1,int n2) {
    	return (n1%n2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperatorDemo o=new OperatorDemo();
		Scanner sc=new Scanner(System.in);
		System.out.println("please two numbers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println(o.add(num1, num2));
		System.out.println(o.difference(num1, num2));
		System.out.println(o.multiply(num1, num2));
		System.out.println(o.division(num1, num2));
		System.out.println(o.remainder(num1, num2));

	}

}

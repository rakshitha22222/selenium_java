package Day1;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int a,b, sum, diff, mul, avg;
		System.out.println("Enter 1st numbers");
		a=sc.nextInt();
		System.out.println("Enter 2nd number");
		b=sc.nextInt();
		
		sum=a+b;
		diff=a-b;
		mul=a*b;
		avg=(a+b)/2;
				System.out.println(+sum);
		System.out.println(+diff);
		System.out.println(+mul);
		System.out.println(+avg);
		if (a==b) {
			System.out.println("equal");}
			if(a<=b) {
				System.out.println("b greater");
				
			}
			else
				System.out.println("a greater");
	}

}

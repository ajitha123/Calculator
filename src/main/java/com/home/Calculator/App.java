package com.home.Calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public long first_num;
	public long second_num;
	
	
    public long getFirst_num() {
		return first_num;
	}


	public void setFirst_num(long first_num) {
		this.first_num = first_num;
	}


	public long getSecond_num() {
		return second_num;
	}


	public void setSecond_num(long second_num) {
		this.second_num = second_num;
	}

public long sum()
{
return first_num+second_num;

}
public long sub()
{
return first_num-second_num;

}
public long mul()
{
return first_num/second_num;

}
	public static void main( String[] args )
    {
		App cal = new App();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First number");
		 cal.setFirst_num(sc.nextLong());
		 System.out.println("Enter Second number");
		cal.setSecond_num(sc.nextLong());
		
		System.out.println("Sum = "+ cal.sum());
		System.out.println("Sub=  "+cal.sub());
		System.out.println("Mul= "+cal.mul());
		
		 }
}

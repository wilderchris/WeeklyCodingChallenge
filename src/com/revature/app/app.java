package com.revature.app;

import java.util.Scanner;

import com.revature.problem.Fib;
import com.revature.problem.triNum;

public class app {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		System.out.print("Divisor input: ");
//		int num = scan.nextInt();
//		
//		triNum triNumber = new triNum();
//		int result = 0;
//		int count = 1;
//
//		while (triNumber.divCalc(result) < num) {
//			result = result + count;
//			count++;
//		}
//
//		System.out.println("The 1st number with " + num + " divisors is: " + result);
//		scan.close();
//	}
		
		Fib fb = new Fib();
		fb.calc();
}
	
}

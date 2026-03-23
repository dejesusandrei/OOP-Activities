/**
 * @(#)Main.java
 *
 *
 * @author 
 * @version 1.00 2026/3/14
 */

import java.util.*;
public class Main {
	public static void main(String args[]) {
    	Scanner scan = new Scanner(System.in);
    	PrintData a = new PrintData();
    	int num[] = {1,2,3,4,5};
    
    	a.showArraySummation(num);
	}
}

class PrintData{
	public void show(int a){ System.out.println ("Integer: " + a); }
	public void show(double a){ System.out.printf("Double: %.2f\n" , a); }
	public void show(String a){ System.out.println ("String: " + a); }
	public void show(int a, double b){ System.out.println("Integer: " + a + ", Double: " + b); }
	public void showArraySummation(int arr[]){
		int sum= 0;
		for (int i = 0; i < arr.length; i++){ sum +=arr[i]; }
		System.out.println ("Total sum is: " + sum);
	}
}
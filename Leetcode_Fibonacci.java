/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Leetcode;

/**
 *
 * @author Adolf K Weismann
 */
public class Leetcode_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public int fib(int n) {
        if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fib(n-2) + fib(n-1);
	}
    
}

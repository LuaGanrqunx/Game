package game.guess_number.test;

import java.util.Scanner;

public class TestSCanner {
	public static void main(String[] args) {
		// 測試Scanner的用法，及了解細部行為
		// ? nextInt()的流程
		System.out.println("測試Scanner....");
		System.out.println("隨便寫一些數字");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int id = sc.nextInt();
			System.out.println("Your input: "+id);
		}
		sc.close();
		System.out.println("Program ended.. ");

	}

}

package game.guess_number.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScanner01 {

	public static void main(String[] args) {
		// 測試Scanner的用法，及了解細部行為
		// ? nextInt()的流程
		System.out.println("測試Scanner....");
		System.out.println("隨便寫一些數字");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			try {
				int id = sc.nextInt();
				System.out.println("Your input: "+id);
			} catch (InputMismatchException e) {
				System.out.println("你輸錯了，先生!!");
				sc.nextLine();
			}
		}
		sc.close();
		System.out.println("Program ended.. ");

	}

}

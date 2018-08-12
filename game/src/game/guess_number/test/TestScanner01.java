package game.guess_number.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestScanner01 {

	public static void main(String[] args) {
		// 這是一個較好的範例
		// 非整數會提示
		// 
		System.out.println("測試Scanner....");
		System.out.println("隨便寫一些數字");
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			try {
				int id = sc.nextInt();
				System.out.println("Your input: "+id);
			} catch (InputMismatchException e) {
				System.out.println("請輸入整數!!");
				sc.nextLine();
			}
		}
		sc.close();
		System.out.println("Program ended.. ");

	}

}

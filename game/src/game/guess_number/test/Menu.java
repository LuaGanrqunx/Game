package game.guess_number.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * 顯示提示訊息
	 * 接收使用者輸入
	 * 非法選項顯示警告訊息
	 * 回傳使用者選項
	 */
	public int getUserChoice(String msg, int[] legalOptions, String warnMsg) {
//		 * 顯示提示訊息
		System.out.println(msg);
		
//		 * 接收使用者輸入
		Scanner sc = new Scanner(System.in);
		int userChoice = 0;//使用者按 ^D，效果等於按0
		while(sc.hasNext()) {
			try {
				userChoice = sc.nextInt();
				break;//離開迴圈 
			} catch (InputMismatchException e) {
//				 * 非法選項顯示警告訊息
				System.out.println(warnMsg);
				//因為inputStream裡還有東西，透過nextLine清除
				sc.nextLine();
			}
		}
		//記得要關閉scanner
		sc.close();
//		 * 回傳使用者選項
		return userChoice;
	}

}

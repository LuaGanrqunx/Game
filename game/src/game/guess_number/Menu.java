package game.guess_number;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	Checkable checker = new Checker();
	public static void main(String[] args) {
		// 測試getUserChoice
		/*
		 * 給"你only能輸入1,2,3,4 [1,2,3,4] "你輸錯了"
		 */
		// 起始menu
		Menu menu = new Menu();
//		 * 給"你only能輸入1,2,3,4
//		 * [1,2,3,4]
//		 * "你輸錯了"
		menu.getUserChoice("You can only choose 1,2,3 ", menu.checker, "something goes wrong...");
		menu = null;

	}

	/*
	 * 思考：設計一個介蠠，Checkable
	 */
	public interface Checkable {
		public boolean check(int id);// 檢測答案合理性
	}

	public class Checker implements Checkable {

		@Override
		public boolean check(int id) {
//			if(id >=0 || id <=20) {//叭能輸入0~20
			if (0 <= id || id <= 20) {// 叭能輸入0~20
				return true;
			}
			return false;
		}

	}

	/*
	 * 顯示提示訊息 接收使用者輸入 非法選項顯示警告訊息 回傳使用者選項
	 */
	public int getUserChoice(String msg, Checkable checker, String warnMsg) {
//		 * 顯示提示訊息
		System.out.println(msg);

//		 * 接收使用者輸入
		Scanner sc = new Scanner(System.in);
		int userChoice = 0;// 使用者按 ^D，效果等於按0
		while (sc.hasNext()) {
			try {
				userChoice = sc.nextInt();
				if (!checker.check(userChoice)) {
					System.out.println(warnMsg);
					continue;
				}
				break;// 離開迴圈
			} catch (InputMismatchException e) {
//				 * 非法選項顯示警告訊息
//				System.out.println(warnMsg);
				System.out.println("請輸入整數!!");
				// 因為inputStream裡還有東西，透過nextLine清除
				sc.nextLine();
			}
		}
		// 記得要關閉scanner
		sc.close();
//		 * 回傳使用者選項
		return userChoice;
	}

}

package game.guess_number;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Dialog {

	public static void main(String[] args) {
		Dialog t = new Dialog();
		t.getUserInput();
		t = null;

	}

	public int getUserInput() {
		Scanner scanner = new Scanner(System.in);
//		 * 無窮迴圈
		while (true) {
//		 * 顯示提示文字
			System.out.printf("%s\n%s\n%s\n%s\n",
					"請輸入以下選項：", 
					"1. 開始遊戲", 
					"9. 遊戲說明", 
					"0. 結束(^D)" );
			int value = 0;
//		 * 格式正確否？
			try {
				value = scanner.nextInt();

//		 * 	否：格式錯誤警示，continue
			} catch (InputMismatchException ie) {
				System.out.println("格式錯誤...");
				//加入清除buffer動作
				scanner.nextLine();
				continue;
			}
//		 * 數值合法否？
//		 * 	否：數值非法警示, continue
			if (Arrays.binarySearch(new int[] { 1, 9, 0 }, value) != -1) {
				System.out.println("數值非法...");
				continue;
			}
			scanner.close();
//		 * 回傳使用者輸入值
			return value;

		}

	}

}

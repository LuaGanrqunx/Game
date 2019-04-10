package game.guess_number.version02;

import java.util.Scanner;

public abstract class IntGetterDialog {
	public static final int ILLEGAL_VALUE = -1;

	protected abstract boolean checkValue(int id);//檢查值是否合理

	protected abstract String getFormatErrMsg();//格式錯誤提示訊息
	
	protected abstract String[] getPrompt();//在這裡設定提示字串

	protected abstract String getValueErrMsg();//給值錯誤提示訊息
	
	public int getUserInput() {
		Scanner scanner = new Scanner(System.in);
		int value = ILLEGAL_VALUE;
//		 * 無窮迴圈
		while (true) {
//		 * 顯示提示文字
			printPrompt();
//		 * 格式正確否？
			try {
				String line = scanner.nextLine();
				value = getIntValue(line);
//		 * 	否：格式錯誤警示，continue
			} catch (NumberFormatException ne) {
				printFormatErrMsg();
				//加入清除buffer動作
//				scanner.nextLine();
				continue;
			}
//		 * 數值合法否？
			if(!checkValue(value)) {
//		 * 	否：數值非法警示, continue
				printValueErrMsg();
				continue;
			}
			scanner.close();
//		 * 回傳使用者輸入值
			return value;

		}

	}

	private void printFormatErrMsg() {
		System.out.println(getFormatErrMsg());
	}

	private void printPrompt() {
		String[] lines = getPrompt();
		for (String  line: lines) {
			System.out.println(line);
		}
	}

	private void printValueErrMsg() {
		System.out.println(getValueErrMsg());
	}


	private int getIntValue(String str) throws NumberFormatException{
		int id = Integer.parseInt(str);
		return id;
	}
}

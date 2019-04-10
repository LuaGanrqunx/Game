package game.guess_number.version02;

public class MainMenu {
	//選單選項
	public static final int PLAY = 1;
	public static final int HELP = 2;
	public static final int EXIT = 0;

	//取得合法選項矩陣
	public int[] getlegalChoices() {
		return new int[] {
			PLAY,
			HELP,
			EXIT
		};
	}
	
	//取得選單文字
	private String[] getDescs() {
		return new String[] {
				"開始遊戲",
				"遊戲說明",
				"離開"	
		};
	}
}

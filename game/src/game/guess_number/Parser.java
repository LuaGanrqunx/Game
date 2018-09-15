package game.guess_number;

public class Parser implements Parsable {

	@Override
	public int parse(String str) throws NumberFormatException {
		return Integer.parseInt(str);
	}

}

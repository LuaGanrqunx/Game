package game.guess_number;

public class IntParser implements Parsable {

	@Override
	public int parse(String str) throws NumberFormatException {
		return Integer.parseInt(str);
	}

}

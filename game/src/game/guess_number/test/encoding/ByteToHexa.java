package game.guess_number.test.encoding;

public class ByteToHexa {

	public static void main(String[] args) {
		byte[] bytes = { -1, 0, 1, 2, 3 };
		StringBuilder sb = new StringBuilder();
		for (byte b : bytes) {
			sb.append(String.format("%02X ", b));
		}
		System.out.println(sb.toString());
		// prints "FF 00 01 02 03 "
	}

}

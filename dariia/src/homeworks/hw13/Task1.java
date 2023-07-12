package homeworks.hw13;

/*
 * Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
 * Method encrypt should take a string and return coded string where every letter is moved
 * on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
 * return decoded value
 */

public class Task1 {

	public static String encrypt(String s, int n) throws ArrayIndexOutOfBoundsException {
		if (n >= 0) {
			return s.chars()
					.mapToObj(ch -> (char) (ch + n))
					.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
		} else {
			throw new ArrayIndexOutOfBoundsException("Only positive numbers for encoding allowed!");
		}

	}

	public static String decrypt(String s, int n) throws NegativeArraySizeException {
		if(n >= 0) {
			return s.chars()
					.mapToObj(ch -> (char) (ch-n))
					.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
		} else {
			throw new NegativeArraySizeException("Only positive numbers for encoding allowed!");
		}
	}

	public static void main(String[] args) {
		String test = "abc";

		System.out.println("encrypted: " + encrypt(test, 3)); 
		System.out.println("decrypted: " + decrypt(encrypt(test, 3), 3));

	}

}

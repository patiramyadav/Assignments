package lesson2democode.charsandstrings;



public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println((char)65);
		System.out.println('\u0041');
		//if this doesn't print correctly,
		//change window>preferences>workspace>text encoding
		//to UTF-8
		System.out.println('\u7ec8');
		System.out.println("\ud835\udd6b_\ud835\udd6b"); //'\ud835\udd6b' is illegal
		System.out.println(Integer.toHexString((int)'c'));
		System.out.println(Integer.toHexString(Character.toCodePoint('\ud835','\udd6b')));
		
	}

}

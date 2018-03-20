package src2;

public class StringToArr {
	public static void main(String args[]) {
		String aString="这是一个好的办法";
		char[] newChar=aString.toCharArray();
		for(int i=0;i<newChar.length;i++) {
			System.out.println("字符的第"+(i+1)+"个字符是"+newChar[i]);
		}
	}
}

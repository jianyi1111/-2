package src2;

public class StringToArr {
	public static void main(String args[]) {
		String aString="����һ���õİ취";
		char[] newChar=aString.toCharArray();
		for(int i=0;i<newChar.length;i++) {
			System.out.println("�ַ��ĵ�"+(i+1)+"���ַ���"+newChar[i]);
		}
	}
}

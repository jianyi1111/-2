package Number1p;

public class StringIndexOf {
	public static void main(String args[]) {
		String str="明月几时有，把酒问苍天";
		int charIndex=str.indexOf("，");
		if(charIndex==-1) {
			System.out.println("没有你要查询的字符");
		}else {
			System.out.println("你要查询的字符小标是"+charIndex);
		}
	}
}

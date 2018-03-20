package Number1p;

public class IndexOfqq {
	public static void main(String args[]) {
		String str="明月几时有，把酒问苍天";
		int charIndex=str.indexOf("，");
		if(charIndex!=-1) {
			System.out.println("查找的字符在字符串的第"+(charIndex+1)+"索引位置");
		}else {
			System.out.println("您查找的字符不存在");
		}
	}//这里的字符串拼接之前必须加一，所以必须以括号括起来
}

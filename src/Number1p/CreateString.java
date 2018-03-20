package Number1p;

public class CreateString {
	String a="时间就是金钱";
	String b=new String("我爱清汤小肥羊");
	String c=new String(b);
	char[] charArry2= {'我','惜','时','如','金'};
	String charString=new String(charArry2);//new方法构造对象时不可用static修饰
	public static void main(String args[]) {
		CreateString Str=new CreateString();
		System.out.println(Str.a);
		System.out.println(Str.b);
		System.out.println(Str.c);
		System.out.println(Str.charString);
	}
}

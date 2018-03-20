package Number1p;

public class voidAbout {
	static int a=3;
	static int b;
	int c=a+4;
	public void total(){
		b=a*c;
	}
	static void total2(){
		voidAbout to1=new voidAbout();
		b=a*to1.c;
	}
//	void标志的方法调用其员属性和成员方法，必须要通过其对象。其可以直接调用静态放法
	public static void main(String args[]) {
		voidAbout to=new voidAbout();
		to.total();
		System.out.println(b);
		System.out.print(to.c);
	}
}

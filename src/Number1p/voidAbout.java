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
//	void��־�ķ���������Ա���Ժͳ�Ա����������Ҫͨ������������ֱ�ӵ��þ�̬�ŷ�
	public static void main(String args[]) {
		voidAbout to=new voidAbout();
		to.total();
		System.out.println(b);
		System.out.print(to.c);
	}
}

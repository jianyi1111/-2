package Number1p;

public class CreateString {
	String a="ʱ����ǽ�Ǯ";
	String b=new String("�Ұ�����С����");
	String c=new String(b);
	char[] charArry2= {'��','ϧ','ʱ','��','��'};
	String charString=new String(charArry2);//new�����������ʱ������static����
	public static void main(String args[]) {
		CreateString Str=new CreateString();
		System.out.println(Str.a);
		System.out.println(Str.b);
		System.out.println(Str.c);
		System.out.println(Str.charString);
	}
}

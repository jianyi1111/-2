package Number1p;

public class StringIndexOf {
	public static void main(String args[]) {
		String str="���¼�ʱ�У��Ѿ��ʲ���";
		int charIndex=str.indexOf("��");
		if(charIndex==-1) {
			System.out.println("û����Ҫ��ѯ���ַ�");
		}else {
			System.out.println("��Ҫ��ѯ���ַ�С����"+charIndex);
		}
	}
}

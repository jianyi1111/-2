package Number1p;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���������ĳɼ�");
		int grade=sc.nextInt();
		switch(grade) {
		case 10:
		case 9:
			System.out.print("�ɼ����㣬����������Ҫ������");
			String gift=sc.next();
			System.out.print("����Ҫ��������"+gift);
			break;
			
		case 8:
		case 7:
			System.out.print("�ɼ�����");
			break;
		case 6:
			System.out.print("�ɼ��պúϸ�");
			break;
		default:
			System.out.print("�÷�ʡ��");
		}
		sc.close();
	}
}

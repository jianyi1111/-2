package Number1p;
import java.util.Scanner;
public class Login2 {
	public static void main(String[] args) {
		System.out.println("����");
		Scanner sc=new Scanner(System.in);
		int password=sc.nextInt();
		if(password==123456) {
			System.out.println("��������");
		}else {
			System.out.println("��Ѿ��");
		}
		sc.close();
	}
}

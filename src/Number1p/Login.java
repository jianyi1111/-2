package Number1p;
import java.util.Scanner;
public class Login {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("������λ����");
		int passWord=sc.nextInt();
		boolean result=(passWord==924867);
		if(result) {
			System.out.println("�û�������ȷ");
		}else {
			System.out.println("�û��������");
		}
		sc.close();
	}
}

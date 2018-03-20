package Number1p;
import java.util.Scanner;
public class Login {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("输入六位数字");
		int passWord=sc.nextInt();
		boolean result=(passWord==924867);
		if(result) {
			System.out.println("用户密码正确");
		}else {
			System.out.println("用户密码错误");
		}
		sc.close();
	}
}

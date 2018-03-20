package Number1p;
import java.util.Scanner;
public class Move {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入密码");
		int password=sc.nextInt();
		long localPass=12234;
		int key=3;
		localPass=localPass<<key;
		password=password<<key;
		if(localPass==password) {
			System.out.print("登录成功");
		}else {
			System.out.print("请重新输入密码");
		}
		sc.close();
	}
}

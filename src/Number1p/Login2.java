package Number1p;
import java.util.Scanner;
public class Login2 {
	public static void main(String[] args) {
		System.out.println("您好");
		Scanner sc=new Scanner(System.in);
		int password=sc.nextInt();
		if(password==123456) {
			System.out.println("美丽的神话");
		}else {
			System.out.println("你丫的");
		}
		sc.close();
	}
}

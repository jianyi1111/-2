package Number1p;
import java.util.Scanner;
public class Chart {
	public static void main(String[] args) {
		System.out.println("�������������� �Կո����");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("a<b_"+(a<b));
		System.out.println("a>b_"+(a>b));
		System.out.println("a==b_"+(a==b));
		System.out.println("a!=b_"+(a!=b));
		System.out.println("a<=b_"+(a<=b));
		System.out.println("a>=b_"+(a>=b));
		sc.close();
	}
}

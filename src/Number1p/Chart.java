package Number1p;
import java.util.Scanner;
public class Chart {
	public static void main(String[] args) {
		System.out.println("请输入两个数字 以空格隔开");
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

package Number1p;
import java.util.Scanner;
public class JiSuan {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入两个数字，并且以空格隔开");
		float qq=sc.nextFloat();
		float bb=sc.nextFloat();
		double cc=qq*bb;
		System.out.println(cc);
		sc.close();
	}

}

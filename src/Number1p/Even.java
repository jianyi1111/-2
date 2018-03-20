package Number1p;
import java.util.Scanner;
public class Even {
	public static void main(String[] args) {
		System.out.print("请输入一个数字，以筛选与零之间的偶数");
		Scanner sc=new Scanner(System.in);
		float maxNumber=sc.nextFloat();
		for(int i=0;i<maxNumber;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		sc.close();
	}
}

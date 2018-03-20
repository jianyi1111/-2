package Number1p;
import java.util.Scanner;
public class BreakOne {
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入你想要便利的对象");
		int count=sc.nextInt();
		do {
			count++;
			if(count==11) {
				continue;
			}
			System.out.println(count);
		}while(count<16);
		sc.close();
	}
}

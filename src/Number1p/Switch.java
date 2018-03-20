package Number1p;
import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入您的成绩");
		int grade=sc.nextInt();
		switch(grade) {
		case 10:
		case 9:
			System.out.print("成绩优秀，请输入你想要的礼物");
			String gift=sc.next();
			System.out.print("您想要的礼物是"+gift);
			break;
			
		case 8:
		case 7:
			System.out.print("成绩良好");
			break;
		case 6:
			System.out.print("成绩刚好合格");
			break;
		default:
			System.out.print("该反省了");
		}
		sc.close();
	}
}

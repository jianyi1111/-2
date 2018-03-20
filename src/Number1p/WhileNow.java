package Number1p;

public class WhileNow {
	public static void main(String[] args) {
		int jj=1;
		int sum=0;
		while(jj<=10) {
			sum+=jj;
			jj++;
		}
		System.out.println(sum==55);
	}
}

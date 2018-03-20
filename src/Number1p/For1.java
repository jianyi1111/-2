package Number1p;

public class For1 {
	int sum=0;
	public static void main(String[] args) {
		For1 summer=new For1();
		for(int i=0;i<=100;i++) {
			summer.sum+=i;
		}
		System.out.print(summer.sum);
	}
}

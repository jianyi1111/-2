package Number1p;

public class Height {
	public static void main(String[] args) {
		float maxHeight=80;
		for(int i=2;i<=6;i++) {
			maxHeight=maxHeight/2;
		}
		System.out.print("第六次降落的高度是"+maxHeight);
		System.out.print("第六次反弹的高度是"+maxHeight/2);
	}
}

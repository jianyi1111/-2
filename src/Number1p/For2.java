package Number1p;

public class For2 {
	public static void main(String[] args) {
		loop:for(int i=0;i<3;i++) {
			for(int j=0;j<6;j++) {
				for(int k=0;k<5;k++) {
					if(k==2) {
						break loop;
					}
					System.out.println("i="+i+"j="+j+"k="+k);
				}
			}
		}
	}
}

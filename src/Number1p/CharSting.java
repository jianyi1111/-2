package Number1p;

public class CharSting {
	public static void main(String args[]) {
		String licensePlate[]= {
				"xx123","xx21421","xxwf21312","4323434","31233156","32xx43243244"
		};
		String number="4";
		System.out.println("今日限号"+number+"限制出行的车牌有：");
		for(int i=0;i<licensePlate.length;i++) {
			if(licensePlate[i].endsWith(number)) {
				System.out.println(licensePlate[i]);
			}
		}
	}
}

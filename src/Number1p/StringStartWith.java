package Number1p;

public class StringStartWith {
	public static void main(String args[]) {
		String[] brandArr= {"美的电磁炉","海尔冰箱","格力空调","小米手机","海尔空调","海尔手机","海尔遥控器","海尔品牌"};
		int sum=0;
		for(int i=0;i<brandArr.length;i++) {
			String name=brandArr[i];
			if(name.startsWith("海尔")) {
				sum++;
			}
		}
		System.out.println("海尔的商品总共有"+sum+"种");
	}
}

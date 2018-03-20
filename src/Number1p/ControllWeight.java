package Number1p;

public class ControllWeight {
	public static void main(String[] args) {
		double height=2.72;
		int weight=70;
		double exponent =weight/(height*height);
		System.out.println("您的身高为"+height);
		System.out.println("您的体重为"+weight);
		System.out.println("您的BMI指数为"+exponent);
		System.out.print("您的体重属于：");
		if(exponent>=18.5&&exponent<=24.9) {
			System.out.print("正常范围");
		}else {
			System.out.print("不正常范围");
		}
	}
}

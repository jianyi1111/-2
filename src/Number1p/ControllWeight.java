package Number1p;

public class ControllWeight {
	public static void main(String[] args) {
		double height=2.72;
		int weight=70;
		double exponent =weight/(height*height);
		System.out.println("�������Ϊ"+height);
		System.out.println("��������Ϊ"+weight);
		System.out.println("����BMIָ��Ϊ"+exponent);
		System.out.print("�����������ڣ�");
		if(exponent>=18.5&&exponent<=24.9) {
			System.out.print("������Χ");
		}else {
			System.out.print("��������Χ");
		}
	}
}

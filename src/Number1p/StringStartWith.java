package Number1p;

public class StringStartWith {
	public static void main(String args[]) {
		String[] brandArr= {"���ĵ��¯","��������","�����յ�","С���ֻ�","�����յ�","�����ֻ�","����ң����","����Ʒ��"};
		int sum=0;
		for(int i=0;i<brandArr.length;i++) {
			String name=brandArr[i];
			if(name.startsWith("����")) {
				sum++;
			}
		}
		System.out.println("��������Ʒ�ܹ���"+sum+"��");
	}
}

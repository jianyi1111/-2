package Number1p;
//����ĩβ��ĸ��ͬ���ַ���
public class ForFor {
	public static void main(String args[]) {
		String[] peopleArr= {"����","����","����","����","����","����","�׺�","����","����","����"};
		for(int i=0;i<=peopleArr.length;i++) {
			for(int j=i+1;j<peopleArr.length;j++) {
				char lastEm=peopleArr[i].charAt(peopleArr[i].length()-1);
				String lastEnString=String.valueOf(lastEm);
				if(peopleArr[j].endsWith(lastEnString)&&(i!=j)) {
					System.out.println(peopleArr[j]);
					System.out.println(peopleArr[i]);
				}
			}
		}
	}
}

package Number1p;

public class ForChar {
	long jj[]= {65,66,67,68};
	char jsjs[]= new char[jj.length];
	public static void main(String[] args) {
		ForChar arr=new ForChar();
		for(int i=0;i<arr.jj.length;i++) {
			float ai=arr.jj[i];
			char aiChar=(char)ai;
			arr.jsjs[i]=aiChar;
		}
		System.out.println(arr.jj);
		System.out.print(arr.jsjs);
	}
}

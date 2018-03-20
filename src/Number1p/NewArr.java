package Number1p;

public class NewArr {
	public static void main(String[] args) {
		int arr[][]=new int[3][];
		arr[0]=new int[] {1,2,3,4};
		arr[1]=new int[] {11,22,33,44};
		arr[2]=new int[] {21,22,23,24};
		for(int i=0;i<arr.length;i++) {
			for(int x:arr[i]) {
				System.out.print("-"+x);
			}
		}
	}
}

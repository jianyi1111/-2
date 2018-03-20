package Number1p;

public class Arrs {
	public static void main(String[] args) {
		int tdArr[][]= {{1,2,3},{3,4,5}};
		int arr2[][]=new int[][] {{1,2,3},{3,4,5}};
		int arr3[][]=new int[2][3];
		arr3[0]=new int[] {1,2,3};
		arr3[1][0]=3;
		arr3[1][1]=4;
		arr3[1][2]=5;
		System.out.println(tdArr==arr2);
		System.out.println(arr3==arr2);
	}
}

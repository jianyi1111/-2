package Number1p;
import java.util.Arrays;
public class FillArr {
	public static void main(String[] args) {
		int arr[]=new int[5];
		Arrays.fill(arr,8);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}

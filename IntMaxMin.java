package set3;
import java.util.*;
public class IntMaxMin {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=in.nextInt();
		}Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[a-1]);
	}
}

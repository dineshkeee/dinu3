package hunter;
import java.util.*;
public class SameIndex {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<a;i++){
			if(arr[i]==i){
				System.out.print(arr[i]+" ");
			}
		}
	}
}

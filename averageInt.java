package set4;
import java.util.*;
public class averageInt {
		public static void main(String args[]){
			Scanner in=new Scanner(System.in);
			int a=in.nextInt();
			int arr[]=new int[a];
			for(int i=0;i<a;i++){
				arr[i]=in.nextInt();
			}if(a%2==0)System.out.println(arr[a/2-1]);
			else System.out.println(arr[a/2]);
		}
}

package hunter;
import java.util.*;
public class RotationArray {
		public static void main(String args[]){
			int a,b;
			Scanner in=new Scanner(System.in);
			a=in.nextInt();
			b=in.nextInt();
			int arr[]=new int[a];
			for(int i=0;i<a;i++){
				arr[i]=in.nextInt();
			}
			for(int i=b;i<a;i++){
				System.out.print(arr[i]+" ");
			}for(int i=0;i<b;i++){
				System.out.print(arr[i]+" ");
			}
		}
}

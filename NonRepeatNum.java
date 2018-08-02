package hunter;
import java.util.*;
public class NonRepeatNum {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int arr[]=new int[a],c=0;
		for(int i=0;i<a;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<a;i++,c=0){
			for(int j=i+1;j<a;j++){
			if(arr[i]==arr[j]){
				c++;
				arr[j]=0;
			}
		 }
			if(c==0&&arr[i]!=0){
				System.out.println(arr[i]);
			}
	   }
	}
}

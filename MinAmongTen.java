package guvi;
import java.util.*;
public class MinAmongTen {
 public static void main(String args[]){
	 Scanner in=new Scanner(System.in);
	 int arr[]=new int[10];
	 for(int i=0;i<10;i++){
		 arr[i]=in.nextInt();
	 }Arrays.sort(arr);
	 System.out.println(arr[0]);
 }
}

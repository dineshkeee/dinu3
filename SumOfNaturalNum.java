package guvi;
import java.util.*;
public class SumOfNaturalNum {
 public static void main(String args[]){
	 Scanner in=new Scanner(System.in);
	 int a=in.nextInt(),sum=0;
	 for(int i=1;i<=a;i++){
		 sum+=i;
	 }System.out.println(sum);
 }
}

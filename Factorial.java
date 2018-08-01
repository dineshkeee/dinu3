package set4;
import java.util.*;
public class Factorial {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int a=in.nextInt(),i,sum=1;
		for(i=1;i<=a;i++){
			sum*=i;
			}System.out.println(sum);
	}
}

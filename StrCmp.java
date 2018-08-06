package set4;
import java.util.*;
public class StrCmp {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String a=in.next();
		String b=in.next();
		if(a.length()>b.length()|| a.length()==b.length()){
			System.out.println(a);
		}else if(a.length()<b.length()){
			System.out.println(b);
		}
	}
}

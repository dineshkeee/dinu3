package guvi;
import java.util.*;
public class BinaryRep {
  public static void main(String args[]){
	  Scanner in=new Scanner(System.in);
	  String a=in.next();int c=0;
	  String arr[]=new String[a.length()];
	  for(int i=0;i<a.length();i++){
		  arr[i]=a.substring(i,i+1);
		  if(!arr[i].equals("0")&& !arr[i].equals("1")){
			  c++;
		  }
	  }if(c==0){
		  System.out.println("yes");
	  }else{
		  System.out.println("No");
	  }
	  
  }
}

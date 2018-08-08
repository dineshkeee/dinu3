import java.util.*;
public class StringContains {
    public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
String a=in.next();
if((a.replaceAll("[^0-9]","")).length()>0&&(a.replaceAll("[^A-z]","")).length()>0){
System.out.println("Yes");
}else{
System.out.println("No");}}}

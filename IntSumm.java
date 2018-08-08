import java.util.*;
class IntSum{
 public static void main(String args[]){
System.out.println("enter the number");
 Scanner in=new Scanner(System.in);
int a=in.nextInt(),sum=0;
while(a!=0){
int b=a%10;
sum+=b;
a/=10;}
System.out.println(sum);
}
}

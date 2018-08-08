import java.util.*;
public class NumRepInGiven {
    public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
       int a=in.nextInt();
       int b=in.nextInt(),c=0;
       int arr[]=new int[a];
       for(int i=0;i<a;i++){
           arr[i]=in.nextInt();
       }
       for(int i=0;i<a;i++){
           if(arr[i]==b){
               c++;
           }
       }System.out.println(c);}}

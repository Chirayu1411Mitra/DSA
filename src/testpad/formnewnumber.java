 package testpad;

 import java.util.Scanner;

 public class formnewnumber {
     public static void main(String[] args) {
         int result=even(8342116,0);
         System.out.println(result);
     }
     static int even(int n, int temp ){
//         while(n!=0){
//             int dig=n%10;
//             if((dig)%2==0){
//                 int temp2=temp*10;
//                 temp=temp2+dig;
//             }
//             n=n/10;
//         }
//         return temp;
         if(n==0) return temp;
         if(n%2==0){
             return even(n/10,(temp*10)+n%10);

         }
         else {
             return even(n / 10, temp);
         }

     }
 }

package Recursion;

import java.sql.SQLOutput;

public class intro {
    public static void main(String[] args) {
        //print(1,5);
        int result2=reversewithrecursion(45,0);
        System.out.println(result2);
        String s= "cHIRAYU";
        String result="";
        result=reversestringwithrecursion(s,s.length(),result);
        System.out.println(result);
        int temp = hcfusingrecursion(4,2);
        System.out.println(temp);
    }
//    static void print(int n,int k){
//        if(n>k) return;
//       // System.out.println(n);
//        print(n+1,k);
//
//       // System.out.println(fact);
//    }
    static int factorial(int n){
        if(n==0 || n==1) return 1;
        //int result=factorial(n-1,fact*n);
        return n*(factorial(n-1));
    }
//    static int reverse(int n ){
//        int result=0;
//        while (n!=0){
//            int temp=n%10;
//            result=result*10+temp;
//            n=n/10;
//        }
//        return result;
//    }
    static int reversewithrecursion(int n,int start){
        if(n==0) return start;
        return reversewithrecursion(n/10,start*10+n%10);
    }
//    static String reversestring(String s,int n){
//        String result="";
//        while(n>=0){
//            Character temp=s.charAt(n);
//            result+=temp;
//            n--;
//        }
//        return result;
//    }
    static String reversestringwithrecursion(String s, int n,String result){     // Reverse eith String
        if(n<=0) {
            return result;
        }
        else {
            char temp = s.charAt(n - 1);
            return reversestringwithrecursion(s, n - 1, result + temp);
        }
        }
    static int hcfusingrecursion(int a, int b){
        if(a==0) return b;
        return hcfusingrecursion(b%a,a);
    }

}

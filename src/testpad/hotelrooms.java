package testpad;

public class hotelrooms {
    public static void main(String[] args) {
    int min= extra(3, "ramesh      aryan    gagan chirayu");
        System.out.println(min);
    }
    static int extra(int N , String s){
        String [] arr=s.trim().split("\\s+");
        for(String i: arr){
            System.out.println(i);
        }
        return Math.abs(N-arr.length);
     }
}

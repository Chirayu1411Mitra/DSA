package testpad;

public class minoperations {

    public static void main(String[] args) {
    int min= min("degf");
        System.out.println(min);
    }
    static int min(String s){
        int temp=0;
        for(int i =0;i<s.length()/2;i++){
            int left=s.charAt(i);
            int right=s.charAt(s.length()-1-i);

            temp+=Math.abs(left-right);
        }
        return temp;
    }
}

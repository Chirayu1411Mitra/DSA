package testpad;

public class noofways {
    static int totalWaysToDistance(int d, int k){
        if(d==0) return 1;
        if(d<0) return 0;
        int total=0;
        for(int i =1;i<=k;i++){
            total+=totalWaysToDistance(d-i,k);
        }
        return total;
    }

    public static void main(String[] args) {
        int result=totalWaysToDistance(3,3);
        System.out.println(result);
    }
}

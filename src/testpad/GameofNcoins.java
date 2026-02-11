package testpad;

public class GameofNcoins {
    public static void main(String[] args) {
        int min=helper(6);
        System.out.println(min);
    }
    static int helper(int N){
        int temp=N%5; // 4+1 karna hai isme cuz hum either 4 coins le sakte hai 1 turn or 1 coin in one turn
        if(temp==0 || temp==2){
            return 1;
        }
        return 2;
    }

}

public class Bubble_sort {
    static int[] Bubble_sort(int[] arr){
        int n= arr.length;
        boolean swapped=false;
        for(int i=0;i<n-1;i++){
            for(int j=1;j<n-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,1};
        int[]sort=Bubble_sort(arr);
        for(int i=0;i< sort.length;i++){
            System.out.println(sort[i]);
        }
    }
}

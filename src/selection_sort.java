import java.util.Arrays;

public class selection_sort {
    static int[] selectionsort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=max(arr,0,last);
            swap(arr,max,last);

        }
        return arr;
    }
    static void swap (int [] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int max(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,1};
       selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

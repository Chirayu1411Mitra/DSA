import java.util.Arrays;

public class cyclic_sort {
    static void swap (int [] arr, int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    static int c_sort(int[]arr){
        int count=0;
        int i=0;
      while (i<arr.length){
          int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
                count++;
            }
            else{
                i++;
            }


        }
      return count;
    }
    public static void main(String[] args) {
        int[] arr={2,3,4,5,1};
       int count= c_sort(arr);
        System.out.println(count);

    }
}

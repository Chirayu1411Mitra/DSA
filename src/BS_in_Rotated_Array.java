import java.util.Scanner;

public class BS_in_Rotated_Array {
    static int BS(int[] arr,int target){
        int index;
        int pivot=Find_pivot(arr);
        if(pivot==-1){
            index=binary(arr,target,0,arr.length-1);
        } else if (target>=arr[0]) {
            index=binary(arr,target,0,pivot);
        }
        else{
            index=binary(arr,target,pivot+1,arr.length-1);
        }
        return index;
    }
    static int binary(int[]arr,int target,int start,int end){
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    static int Find_pivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+((end-start)/2);
            if(mid<end && arr[mid]>arr[mid+1] ){
                return mid;
            }
            if(mid>start&& arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[end]){
                end=mid-1;
            }
            if(arr[mid]>=arr[start]){
                start=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4,5,6,0,1,2,3};
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        int index = BS(arr, target);
        System.out.println(index);
    }

}

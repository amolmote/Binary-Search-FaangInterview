package binarySearchInterview;



public class FloorOfNumber {


    private static int floorOfTarget(int[] arr, int key) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;

            if(arr[mid]==key){
                return mid;
            }
            else if (arr[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return end;
    }
    public static void main(String[] args) {
        int[] arr={2,4,7,9,12,14,16,19};
        int key=13;
        int ans=floorOfTarget(arr,key);
        System.out.println("target element is at "+ans);
    }

}

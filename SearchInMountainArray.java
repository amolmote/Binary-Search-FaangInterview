package binarySearchInterview;

public class SearchInMountainArray {

    public static int searchInMountain(int[] arr,int target){
        int peak = searchingPeakInMountain(arr);

        int firstTry=orderAgnostics(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }

        return orderAgnostics(arr,target,peak+1,arr.length-1);

    }

    private static int searchingPeakInMountain(int[] arr){
        int start=0;
        int end= arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid-1;
            }
            start=mid+1;
        }
        return start;
    }

    private static int orderAgnostics(int[] arr, int target, int start, int end) {

        boolean isAsc=arr[start]<arr[end];

        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
            else {
                if (target<arr[mid]){
                    start=mid+1;        //work on notebook
                }
                else {
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,6,7,9,7,4,3,2,0};
        int target=0;
        int ans=searchInMountain(arr,target);
        System.out.println(ans);
    }
}

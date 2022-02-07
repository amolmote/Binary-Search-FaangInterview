package binarySearchInterview;



//main target is to find out the peek element in mountain array
public class MauntainArray {

    public static  int ans(int[] arr){
        int start=0;
        int end=arr.length-1;

        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                end=mid;
            }
            else {
                start=mid+1;
            }

        }
        return start;       //we can take also end here bcz at the end both end and start point to peek element
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,7,4,3,2,1};

        int ans=ans(arr);
        System.out.println("index of the peek element in the mountain array="+ans);
    }
}

package binarySearchInterview;

import java.util.Arrays;

public class FirstAndLastOccarance {

    private static int[] searchRange(int[] arr, int target) {
        int[] ans={-1,-1};

        //check for first occurance
        int start=search(arr,target,true);
        int end=search(arr,target,false);

        ans[0]=start;
        ans[1]=end;

        return ans;
    }
    //this function just return the index of the target
  static int search(int[] arr,int target,boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                start=mid+1;
            }else if (arr[mid]>target){
                end=mid-1;
            }
            else{
                //when potential ans is found
                ans=mid;
                if (findStartIndex){
                    //it may be possible the more lie on the left side of the mid
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,6,7,7,8,8,8,9,10};
        int target=8;
        int[] ans=searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

}

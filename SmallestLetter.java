package binarySearchInterview;

public class SmallestLetter {

    private static char smallLetter(char[] arr, char key) {
        int start=0;
        int end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<key){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return arr[start % arr.length];
    }
    public static void main(String[] args) {
        char[] arr={'c','f','g'};
        char key='a';
        char ans=smallLetter(arr,key);
        System.out.println("char which is smaller in array and greater than the searched character= "+ans);
    }


}
/*
    ***please see all these cases properly

     case 1: char which is smaller in array and greater than the searched character= f

     case 2:->case of wrapping the array(if not present then return element at the 0th index
     char which is smaller in array and greater than the searched character= c

     case 3:char which is smaller in array and greater than the searched character= c

 */
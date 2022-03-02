//given a sorted array in ascending order,
//find the first occurence of the array.
//example {2, 7, 10, 10, 10, 23,56}; output must be 2

public class FirstOccurenceBinarySearch {
    public static int firstOccurenceBinarySearch(int[] arr, int x) {
    	//Your code goes here
        int start = 0;
        int end = arr.length-1;
        int result = -1; //for the case when number is not found
        while(start<=end){
            int mid= start +(end-start)/2; //optimized to prevent Integer Overflow.
            if(x==arr[mid]){
                result = mid;
                end=mid-1; //for 1st occurence, since it is sorted array first occurence will be on left side
            }
            else if(x<arr[mid]){
                end = mid-1;
            }else{
                //In this case arr[mid] == x
                start = mid+1;
            }
        }
        return result; //if element is not found return -1.
    }

    public static void main(String[] args) {
        int arr[] = {7,7,8, 10, 10, 23, 56};
        System.out.println(firstOccurenceBinarySearch(arr, 7)); //ouputs 2
    }
}

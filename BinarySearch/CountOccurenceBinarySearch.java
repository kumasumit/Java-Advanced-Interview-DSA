//given a sorted array in ascending order.
//count the no. of times a particular element occurs.


public class CountOccurenceBinarySearch {
    public static int firstOccurence(int[] arr, int x) {
    	//Your code goes here
        int start = 0;
        int end = arr.length-1;
        int firstIndex = -1; //for the case when number is not found
        while(start<=end){
            int mid= start +(end-start)/2; //optimized to prevent Integer Overflow.
            if(x==arr[mid]){
                firstIndex = mid;
                end=mid-1; //for 1st occurence, since it is sorted array first occurence will be on left side
            }
            else if(x<arr[mid]){
                end = mid-1;
            }else{
                //In this case arr[mid] == x
                start = mid+1;
            }
        }
        return firstIndex; //if element is not found return -1.
    }
    public static int lastOccurence(int[] arr, int x) {
    	//Your code goes here
        int start = 0;
        int end = arr.length-1;
        int lastIndex = -1; //for the case when number is not found
        while(start<=end){
            int mid= start +(end-start)/2; //optimized to prevent Integer Overflow.
            if(x==arr[mid]){
                lastIndex = mid;
                start=mid+1; //for 1st occurence, since it is sorted array first occurence will be on left side
            }
            else if(x<arr[mid]){
                end = mid-1;
            }else{
                //In this case arr[mid] == x
                start = mid+1;
            }
        }
        return lastIndex; //if element is not found return -1.
    }
    public static int countOccurence(int arr[], int x){
      int count;  
      int first = firstOccurence(arr, x);
      int last = lastOccurence(arr, x);
      if(first==-1|| last==-1){
          count = -1;
      }else{
      count = (last-first+1);
      }
      return count;
    }
    //main code to check solution code
    public static void main(String[] args) {
        int arr[] = {2, 4, 10, 10, 10 ,18, 20};
        System.out.println(countOccurence(arr, 20)); //output 3
    }
}

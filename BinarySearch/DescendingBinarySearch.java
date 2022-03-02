//here we are given a sorted array in
//descending order and we need to 
//search element by Binary Search.
import java.util.Scanner;
public class DescendingBinarySearch { 
    //a static Scanner for taking input in differnt functions.
    static Scanner s = new Scanner(System.in);
    public static int descendingBinarySearch(int[] arr, int x) {
    	//Your code goes here
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid= start +(end-start)/2; //optimized to prevent Integer Overflow.
            if(x==arr[mid]){
                return mid; //return mid and exit from the function.
            }
            else if(x<arr[mid]){
                start = mid+1;
            }else{
                //In this case arr[mid] == x
                end = mid-1;
            }
        }
        return -1; //if element is not found return -1.
    }
    //main code to check for solution code
    //function to take input for Arrays
    public static int[] takeInput(){
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter a sorted Array in Descending Order for Binary Search");
        for(int i=0;i<n;i++){
            System.out.println("Enter element at "+i+"th position.");
            arr[i] = s.nextInt();
        }
        // 
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = takeInput();
        int itemToSearch = s.nextInt();
        System.out.println(descendingBinarySearch(arr, itemToSearch));
        s.close();
    }
}

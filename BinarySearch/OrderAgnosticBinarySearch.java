//here we are given a sorted array in
//order and we need to 
//search element by Binary Search.
//We dont know whether it is ascending or descending sorted Array.
import java.util.Scanner;
public class OrderAgnosticBinarySearch { 
    //a static Scanner for taking input in differnt functions.
    static Scanner s = new Scanner(System.in);
    //this function works perfectly well for both increasing as well as decreasing array
    public static int orderAgnosticBinarySearch(int[] arr, int x) {
    	//Your code goes here
        boolean ascending = true;
        if(arr.length==0){ //in case of blank array return -1
            return -1;
        }
        else if(arr.length == 1){ //In case of single array, check it there iself
            if(x==arr[0]){
                return 0;
            }
            else{
                return -1;
            }
        }else{
            if(arr[1]<arr[0]){
                ascending = false;
            }
            int start = 0;
            int end = arr.length - 1;
            while(start<=end){
                int mid= start+ (end-start)/2;
                if(x==arr[mid]){
                    return mid;
                }
                if(ascending){
                    if(x<arr[mid]){
                        end = mid - 1;
                    }else{
                        start = mid + 1; 
                    }
                }
                else if(ascending ==false){
                    if(x<arr[mid]){
                        start = mid + 1;
                    }else{
                        end = mid -1; 
                    }
                }
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
        System.out.println(orderAgnosticBinarySearch(arr, itemToSearch));
        s.close();
    }
}

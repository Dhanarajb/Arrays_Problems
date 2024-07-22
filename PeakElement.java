package Arrays_Problems;

/**
 * Finds the peak element in the given array.
 * A peak element is an element that is greater than or equal to its neighbors.
 * If there are multiple peak elements, it returns any one of them.
 * 
 * @param arr the input array
 * @param n the length of the input array
 * @return the index of the peak element, or -1 if no peak element is found
 */
public static int peakElement(int[]arr,int n){
// Implementation details omitted for brevity
    if(n==1){
        return 0;
    }
    if(arr[0]>arr[1]){
        return 0;
    }
    if(arr[n-1]>arr[n-2]){
        return n-1;
    }
    for(int i=1;i<n-1;i++){
        if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
            return arr[i];
        }
    }
    return -1;
}   
public class PeakElement {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        int peak = peakElement(arr, n);
        System.out.println("The peak element is: " + peak);
    }

}


import java.util.Scanner;

public class Binary {
    public static void main(String[] args){
        int[] array={-1,0,3,5,9,12};
        int target=0;
        System.out.println(Search(array, target, 0, array.length-1));
    }
    static int Search(int[] arr, int target, int s, int e){
        //base case
        if(s>e){
            return -1;
        }

        //binary search
        int mid=s+(e-s)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if (target>mid){
            return Search(arr,target,mid+1, e);
        }else{
            return Search(arr,target,s,mid);
        }
    }
}
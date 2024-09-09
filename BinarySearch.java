//binary Search in java
import java.util.*;

class BinarySearch{
    public static void main(String[] args){
        int[] arr={1,3,5,7,9,10,13,15,17,19,21,24,26};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        binarySearch(arr,num);
    }

    public static void binarySearch(int[] arr,int x){
        int low=0;
        int high=arr.length;
        binarySearch(arr,low,high,x);
    }

    private static void binarySearch(int[] arr,int low,int high,int x){
        if(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                System.out.println(x+" found in the array");
                return;
            }
            else if(arr[mid]>x){
                binarySearch(arr,low,mid-1,x);
            }else{
                binarySearch(arr,mid+1,high,x);
            }
        }else{
            System.out.println(x+" does not found in array");
        }
    }
}
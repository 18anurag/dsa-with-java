//java code to perform the linear search
import java.util.*;

class LinearSearch{
    public static void main(String[] args){
        System.out.println("Enter a number to find in the array");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arr={1,3,2,6,4,5,9,8,7,10};
        linearSearch(arr,num);
    }

    public static void linearSearch(int[] arr,int num){
        for(int ele:arr){
            if(ele==num){
                System.out.println(ele+" found in the array ");
                return;
            }
        }

        System.out.println(num+" does not found in the array ");
    }
}
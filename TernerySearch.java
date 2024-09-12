//java prgoram to demonstrate the terenrys search for monotonic array 
import java.util.*;

class TernarySearch1{
    public static void main(String[] args){
        int[] arr={0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256,
                                 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 900,
                                 961, 1024, 1089, 1156, 1225, 1296, 1369, 1444, 1521, 1600, 1681, 1764,
                                 1849, 1936, 2025, 2116, 2209, 2304, 2401, 2500, 2601, 2704, 2809, 2916,
                                 3025, 3136, 3249, 3364, 3481, 3600, 3721, 3844, 3969, 4096, 4225, 4356,
                                 4489, 4624, 4761, 4900, 5041, 5184, 5329, 5476, 5625, 5776, 5929, 6084,
                                 6241, 6400, 6561, 6724, 6889, 7056, 7225, 7396, 7569, 7744, 7921, 8100};

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=sc.nextInt();

        TernarySearch(arr,num,0,arr.length);
    }

    public static void TernarySearch(int[] arr,int x,int low,int high){
        if (low < high) {
            int mid1= low +(high-low)/3;
            int mid2= high -(high-low)/3;

            if(arr[mid1]==x){
                System.out.println("found");
                return;
            }else if(arr[mid2]==x){
                System.out.println("found");
                return;
            }
            else if(arr[mid1] > x){
                TernarySearch(arr,x,low,mid1-1);
            }else if(arr[mid1] <  x&& arr[mid2] > x){
                TernarySearch(arr,x,mid1+1,mid2-1);
            }else{
                TernarySearch(arr,x,mid2+1,high);
            }
        }else{
            System.out.println("not found");
            return;
        }
    }
}
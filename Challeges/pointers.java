/* 
GIVEN an array of integers numbers that is already sorted in non decreasing order, 
find two numbers such that they add up to a specific target number.

*/ 
import java.lang.*;
public class pointers{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,8,9,10};
        int target = 8;
        int n = 8;
        for ( int i=0;i<n-1;i++) {
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==target){
                    System.out.print("True");
                }

            }
        }

    }
}
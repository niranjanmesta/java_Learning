/*Given an array of integers with 1 to n elements and the size of the array if n+1.  
One element iis occurring more than once i.e duplicate numbers is present.
Find the duplicate element.*/


import java.lang.*;
public class duplicate {
    public static void main (String args[]){
     int arr[] = {6,1,7,3,2,5,4,8,9,11,10};
     int n= 11;
      for(int i = 0;i<n-1;i++){
        for(int j= i+1 ;j<n; j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[i]);
                break;
            }
        }
      }
    }
}
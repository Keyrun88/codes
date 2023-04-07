package CodingRound.Java;

import java.util.Arrays;

/* sorting array in descending order */
//import java.util.Arrays;
public class Sort {
 public static void main(String[] args){
     int temp=0;
     int [] arr ={1,5,2,9,3,6,4,10,15};
     // Arrays.sort(arr);  // using sort method
     for(int i=0;i<arr.length;i++){  //without using sort method
         for(int j=i+1;j<arr.length;j++){
             if(arr[i]<arr[j]){
                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
             }
         }
     }
     // for(int i=arr.length-1;i>=0;i--){  //used when sort method
     //     System.out.println(arr[i]);
     // }
     
     System.out.println(Arrays.toString(arr));
     for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
     }
 }
}


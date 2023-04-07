package bai2;

public class checkindex {
    public static int indexArr(int key,int[] arr){
     int first =0;
     int last =arr.length-1;
     while (last>=first){
         int mid =(first+last)/2;
         if(key<arr[mid]){
             last=mid-1;
         }
         else if (arr[mid]==key) {
             return mid;
         }
         else {
             first=mid+1;
         }
     }
     return -1;
    }
}

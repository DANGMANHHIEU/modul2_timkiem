package ex1;

public class binarySearch {
    public static int search(int[] list, int key ){
        int first =0;
        int last = list.length-1;
        while (last>=first){
            int mid= (first+last)/2;
            if(key<list[mid]){
                 last =mid-1;
            }
            else if(key==list[mid]){
                return mid;
            }
            else {
                first = mid+1;
            }
        }
        return -1;
    }
}

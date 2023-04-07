package bai2;

import java.util.Arrays;
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size:");
        int size= sc.nextInt();
        int[] arr =new int[size];
        for (int i=0;i<arr.length;i++){
            System.out.println("Phần tử thứ"+(i+1)+":");
            arr[i]=sc.nextInt();
        }
        System.out.println("arr: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("sắp xếp mảng arr: "+Arrays.toString(arr));

        System.out.println(checkindex.indexArr(5,arr));

    }
}

package bai1;

import java.util.Arrays;
import java.util.LinkedList;

public class max {
    public static void checkMax(String s){
        LinkedList<Character>max=new LinkedList<Character>();
        for(int i=0; i<s.length();i++){
            LinkedList<Character>list=new LinkedList<Character>();
            list.add(s.charAt(i));
            for (int j=i+1; j<s.length();j++){
                if(s.charAt(j)>list.getLast()){
                    list.add(s.charAt(j));
                }
            }
            if(list.size()>max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
      for(Character a:max){
          System.out.print(a);
      }
    }
}

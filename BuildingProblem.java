***// Given N,a[],L, the task is to find the starting index and the ending index of the buildings whose height is same as the value given by L. ****//

Solution:

import java.util.*;
public class BuildingProblem {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      int n =scn.nextInt();
      int l = scn.nextInt();
      int[]a = new int[n];
      for(int i=0;i<n;i++){
          a[i] = scn.nextInt();
      }
      Arrays.sort(a);
      int res1 = startingindex(a,0,l);
      int res2 = lastindex(a,a.length-1,l);
      if(res1 == -1 && res2 == -1 ){
          System.out.print("Not found");
      }
      else{
          System.out.print(res1 +" " + res2);
      }
      
      
    }
    
    public static int startingindex(int[] a , int idx, int l){
        if(idx == a.length) return -1;
         if(a[idx] == l) return idx;
       else{
        int fiisa = startingindex(a,idx+1,l);
        return fiisa;
          }
    }
    
     public static int lastindex(int[] a , int idx, int l){
        if(idx < a.length) return -1;
         if(a[idx] == l) return idx;
       else{
        int liisa = lastindex(a,idx-1,l);
        return liisa;
       }
        
    }
}

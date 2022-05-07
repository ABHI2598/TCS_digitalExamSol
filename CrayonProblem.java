***// Given N crayons in the box , find the number of crayons each brother gets once game is over. ****/

Solution:

import java.util.*;
public class CrayonProblem {
    public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      int n =scn.nextInt();
      game(n);
    }
    
    public static void game(int n){
      int b1,b2;
      int temp=n;
      int res=0,res2=0;
      for(int i=0;i<temp;i++){
          if(i%2 ==0){
              b1 = (int) Math.pow(3,i);
               res +=b1;
              if(b1 > temp){
                break;
              }
              temp -= b1;
          }else if(i%2 == 1) {
              b2 = (int) Math.pow(4,i);
              res2 +=b2;
               if(b2 > temp){
                break;
              }
              temp -= b2;
          }
      }
      System.out.println(res + " " + res2);
    }
    
   
}

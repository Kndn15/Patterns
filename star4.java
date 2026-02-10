/* 

*****
 ****
  ***
   **
    *
    
Here the pattern is right angle on the left side and hypotenuse on the right side but it is upside down.
At each row the stars are increasing and spaces are decreasing.
Rows are increasing and at each row columns with stars are decreasing and columns with spaces are increasing.
So we use the condition j<i to print spaces and else print stars as the spaces are before the stars.
*/

public class star4 {
      public static void main(String[] args){
      for(int i=1;i<=5;i++){
          for(int j=1;j<=5;j++){
              if(j<i){
                  System.out.print(" ");
              }else{
                  System.out.print("*");
              }
          }
          System.out.println();
      }
  }
}

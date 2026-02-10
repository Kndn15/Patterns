/* 

    *
   **
  ***
 ****
*****

Here we have right angle on the right side and hypotenuse on the left side.
So at each row it starts with spaces and then stars. 
The number of stars are equal to the row number 
But the spaces are before the stars so we use the condition j<=i to print stars else print space.

*/
public class star3 {
     public static void main(String[] args){
       for(int i=1;i<=5;i++){
           for(int j=5;j>=1;j--){
               if(j<=i){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
}

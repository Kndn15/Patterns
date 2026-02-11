/*

********* 
 *******  
  *****   
   ***    
    *   

Here the pattern is inverted pyramid, I divided the pattern into two parts:
first part is left side of the pattern and second part is right side of the pattern.
    -> In first part the right angle is at the right side and in second part the right angle is at the left side.
    //left side of the pattern
    -> In first part the number of stars are decreasing by 1 in each row and the number of spaces are increasing by 1 in each row
    -> The row number starts from 5 and ends at 1.
     so i started when row number is greater than or equal to 1.
     and column number is decreasing from 5 to 1.
     and stars are printed when column number is less than or equal to row number.
     and spaces are printed when column number is greater than row number.

    //right side of the pattern
    -> In second part the number of starts are decreasing by 1 in each row and spaces are increasing by 1 in each row.
     so i started printing stars when column number is less than row number.
    -> here the row is same we are modifying the columns.
    -> The column number starts from 1 and ends at 5.
     so i started when column number is less than row number cause at the right side the columns are 4.
     based on this if column number is less than row number then print star else print space.

*/
public class star6 {
    public static void main(String[] args){
    for(int i=5;i>=1;i--){
        //left side of the pattern
        for(int j=5;j>=1;j--){
            if(j<=i){
            System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        //right side of the pattern
        for(int j=1;j<=5;j++){
            if(j<i){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
}

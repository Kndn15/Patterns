/*

    *
   ***   
  *****  
 ******* 
*********

Here the pattern is pyramid, I divided the pattern into two parts: 
first part is left side of the pattern and second part is right side of the pattern.

there are 5 rows and 9 columns in the pattern:
    -> In first part the right angle is at the right side and in second part the right angle is at the left side.
    //left side of the pattern
    -> In first part the number of stars are increasing by 1 in each row and the number of spaces are decreasing by 1 in each row
    //right side of the pattern
    -> In second part the number of stars are increasing by 1 in each row but the first row is empty and the number of spaces are decreasing by 1 in each row.
     so i started when row number is greater than or equal to 2.
 
*/

class star5{
        public static void main(String[] args) {
    for(int i=1;i<=5;i++){
        //left side of the pattern
        for(int j=5;j>=1;j--){
            if(j<=i){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        //right side of the pattern
        for(int j=1;j<=4;j++){
            if(i>=2){
                if(j<i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
    }
    }
}
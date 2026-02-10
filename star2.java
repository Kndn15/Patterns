/*

*****
****
***
**
*

*/

//Here we are going to print the star pattern of right-angled triangle but in reverse order.
//We have decreased the number of stars in each line by one and increased the number of lines by one
//So the rows will be increasing from 1 to 5 and columns will be decreasing from 5 to row number

public class star2 {
     public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

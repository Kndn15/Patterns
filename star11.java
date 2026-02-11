/*

**********
****  ****
***    ***
**      **
*        *
**      **
***    ***
****  ****
**********


*/
public class star11 {
        public static void main(String[] args){
        //top pattern
        for(int i=5;i>=1;i--){
            //top-left pattern
            for(int j=1;j<=5;j++){
                if(j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //top-right pattern
            for(int j=5;j>=1;j--){
                if(j<=i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        //bottom pattern
        for(int i=2;i<=5;i++){
            //bottom-left pattern
            for(int j=1;j<=5;j++){
                if(i>=j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //bottom-right pattern
            for(int j=5;j>=1;j--){
                if(i>=j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

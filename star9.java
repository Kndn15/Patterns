/*
    *
   * *   
  *   *  
 *     * 
*       *
 *     *
  *   * 
   * *  
    *
    

*/

public class star9 {
    public static void main(String[] args){
        //top side of pattern
        for(int i=1;i<=5;i++){
        //top-left pattern
            for(int j=5;j>=1;j--){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        //top-right pattern
        for(int j=2;j<=5;j++){
            if(i>=2){
            if(i==j){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            }
        }
            System.out.println();
        }
        
        //bottom side of pattern
        for(int i=2;i<=5;i++){
            //bottom-left pattern
            for(int j=1;j<=5;j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            //bottom-right pattern
           for(int j=4;j>=2;j--){
               if(i!=5){
                   if(i==j){
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

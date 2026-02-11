/*

*       *
 *     * 
  *   *  
   * *   
    *    

*/
public class star8 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            //left pattern 
            for(int j=1;j<=5;j++){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            //right pattern
            for(int j=4;j>=1;j--){
                if(i==j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

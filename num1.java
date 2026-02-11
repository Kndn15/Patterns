/*

12345
1234 
123  
12   
1   

*/
public class num1 {
    public static void main(String[] args) {
                for(int i=5;i>=1;i--){
            for(int j=1;j<=5;j++){
                if(i>=j){
                    System.out.print(j);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

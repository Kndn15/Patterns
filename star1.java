//This program prints a right-angled triangle pattern of stars.
//Each line has been printed with an increasing number of stars, starting from 1 star in the first line to 5 stars in the fifth line.
//so in row 1 we have 1 star, in row 2 we have 2 stars, in row 3 we have 3 stars, in row 4 we have 4 stars and in row 5 we have 5 stars.
//The columns follow the no. of stars based on the row number, so in row 1 we have 1 column, in row 2 we have 2 columns, in row 3 we have 3 columns, in row 4 we have 4 columns and in row 5 we have 5 columns.
class star1{
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
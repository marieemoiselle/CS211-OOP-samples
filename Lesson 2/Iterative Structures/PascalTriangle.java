import java.util.Scanner;
class PascalTriangle{
    public static void main(String[]args){
        int rows;
        Scanner row = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = row.nextInt();

        for(int i = 0; i < rows; i++){
            int coef = 1; 
            for(int j = 0; j <= i; j++){
                System.out.print(coef +" ");
                coef = coef * (i-j)/(j+1);
            }System.out.print("\n");
        } 
        row.close();
    } 
}
import java.util.Scanner;

class PyramidLoops{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        //outer loop = rows
        for(int ctr = 1; ctr <= rows; ctr++){
            //inner loop = number of asterisks in each row
            for(int ast = 1; ast <= ctr; ast++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
import java.util.Scanner;

class DoWhileLoop {
    public static void main(String[] args) {
        int up_bound = 0, sum = 0;
        Scanner value = new Scanner(System.in);
        
        do{
            System.out.print("Enter upper bound value: ");
            up_bound = value.nextInt();
        }while(up_bound < 1);
    
        for(int ctr = 1; ctr <= up_bound; ctr++){
            sum+=ctr;
        }

        System.out.println("Sum from 1 to " + up_bound + " = " + sum);
        value.close();
    }
}
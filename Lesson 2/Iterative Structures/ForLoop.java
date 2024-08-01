import java.util.Scanner;

class ForLoop {
    public static void main(String[] args) {
        int up_bound = 0, sum = 0;
        System.out.print("Enter upper bound value: ");
        Scanner value = new Scanner(System.in);
        up_bound = value.nextInt();
    
        for(int ctr = 1; ctr <= up_bound; ctr++){
            sum+=ctr;
        }

        System.out.println("Sum from 1 to " + up_bound + " = " + sum);
        value.close();
    }
}
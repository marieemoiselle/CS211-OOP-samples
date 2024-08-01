import java.util.Scanner;
class WhileLoopV2 {
    public static void main(String[] args) {
        System.out.print("Enter upper bound value: ");
        Scanner value = new Scanner(System.in);
        int up_bound = value.nextInt();
        int ctr = up_bound, sum = 0;

        while (ctr > 0){
            sum+=ctr;
            ctr--;
        }

        System.out.println("Sum from 1 to " + up_bound + " = " + sum);
        value.close();
    }

}
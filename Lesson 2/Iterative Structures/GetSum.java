import java.util.Scanner;
public class GetSum {

    public static void main(String[] args) {
        // Hey there, start typing your Java code here...
        
        System.out.print("Enter a number: ");
        Scanner value = new Scanner(System.in);
        int upbd = value.nextInt();
        int num = 0,  sum = 0;

        while(num <= upbd){
            sum+=num;
            num++;
        }
        
        System.out.print("Sum from 1 to " +upbd+ " is: " + sum);
        
    }
}
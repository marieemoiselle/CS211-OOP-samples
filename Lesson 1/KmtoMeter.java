import java.util.Scanner;
class KmtoMeter{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value in km: ");
        int km = input.nextInt();
        int m = km * 1000;
        System.out.println(km + " is equivalent to " + m + " meters.");
        input.close();
    }
}
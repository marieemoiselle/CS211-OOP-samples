import java.util.Scanner;

class KmtoMeterIf{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value in km: ");
        int km = input.nextInt();
        int m = 0;
        if(km > 0 ){
            m = km * 1000;
            System.out.println(km + "km = " +m+ "m.");
        }
        input.close();
    }
}
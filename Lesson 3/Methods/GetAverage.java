import java.util.Scanner;
class GetAverage{

    public static float average(int sum, int count){
        if(count == 0){
            return 0.0f;
        }
        return (float)sum/count;
    }
    
    public static void main(String[]args){
        System.out.println("Enter numbers:");
        int sum = 0, count = 0;
        int n;
        
        do{
            Scanner num = new Scanner(System.in);
            n = num.nextInt();
            sum+=n;
            count++;
        }while(n != 0);

        float average = average(sum, count-1);
        System.out.print("Average: " + String.format("%.2f", average));
    }
}
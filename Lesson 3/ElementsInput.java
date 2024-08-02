import java.util.Scanner;
class ElementsInput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[]scores = new double[5];
        double sum = 0.0, average = 0.0;

        //user input
        for (int idx = 0; idx < scores.length; idx++){
            System.out.print("[" + idx + "] Enter score: ");
            scores[idx] = input.nextDouble();
        }

        //get average
        for(int idx = 0; idx < scores.length; idx++){
            sum+=scores[idx];
            average = sum/scores.length;
        }

        System.out.println("Average: " + String.format("%.2f", average));

        input.close();
        
    }
}
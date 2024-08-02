class ForEachLoopSample {
    public static void main(String[]args){
        int[] num_arr = {9, 18, 27, 36, 45};
        int sum = 0;

        for(int number : num_arr){
            System.out.println("Number: " +number);
            sum += number;
        }
        System.out.println("Summation: " +sum);
    }
    
}

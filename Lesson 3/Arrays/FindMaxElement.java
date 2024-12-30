public class FindMaxElement {
    public static void main(String[]args){

        int [] arr = {12, 48, 36, 702, 104};

        int max = arr[0];

        for (int idx = 1; idx < arr.length; idx++){
            if(arr[idx] > max) {
                max = arr[idx];
            }
        }

        System.out.println("Maximum Value: " + max);
    }
}

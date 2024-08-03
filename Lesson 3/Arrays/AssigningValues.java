class AssigningValues {
    public static void main(String[] args) {
        int[] arr = new int[5];

        //assigning elements
        arr[0] = 16;
        arr[1] = 32;
        arr[2] = arr[0] + arr[1];
        arr[3] = arr[2] * 2;
        arr[4] = arr[0] * 5;
        System.out.println("Length of arr: " + arr.length);

        for(int idx = 0; idx < arr.length; idx++){
            System.out.println("arr[" + idx + "] = " + arr[idx]);
        }
    }
}

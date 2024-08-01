class BreakStatement{
    public static void main(String[] args) {
        for(int x = 1; x <= 10; x++){
            if(x == 5){
                break;
            }
            System.out.println("Value of x: " + x);
        }
    }
}
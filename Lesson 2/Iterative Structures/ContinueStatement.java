class ContinueStatement{
    public static void main(String[]args){
        for(int x = 1; x <= 10; x++){
            if(x > 4 && x < 9){
                continue;
            }
            System.out.print(x + " ");
        }
    }
}
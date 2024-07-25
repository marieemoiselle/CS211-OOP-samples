class Sample{
    public static void main(String[]args){
        for(int ctr = 1; ctr <= 5; ctr++){
            if(ctr % 2 != 0){
                System.out.println(ctr * 2);
            }
            else{
                System.out.println("\t" + ctr *2);
            }
        }
    }
}
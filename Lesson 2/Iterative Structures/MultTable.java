public class MultTable {
    public static void main(String[]args){
        int product;

        //System.out.println("product: " + product);

        for(int x = 1; x <= 10; x++){
            for(int y = 1; y <= 10; y++){
                product = x * y;
                System.out.println(x + " * " + y + " = " + product);
            }
            System.out.println("\n");
        }
    }
}

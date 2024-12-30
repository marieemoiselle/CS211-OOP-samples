class ArrayCopyMethod{
    public static void main(String[] args) {
        String[] source = {"Luna", "Kalix", 
                          "Yanna", "Hiro",
                          "Elyse", "Sevi", 
                          "Sam", "Clyden",
                          "Via", "Arkin",
                          "Kierra", "Shan"
                        };
        String[] destination = new String[2];
        System.arraycopy(source, 6, destination, 0, 2);

        boolean isFirst = true;
        for(String character : destination){
            if(!isFirst){
                System.out.print(", ");
            }
            System.out.print(character);
            isFirst = false;
        }
    }

    /*
        OUTPUT
        Sam
        Clyden
     */
}
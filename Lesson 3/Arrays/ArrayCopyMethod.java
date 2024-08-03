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

        for(String character : destination){
            System.out.println(character);
        }
    }

    /*
        OUTPUT
        Sam
        Clyden
     */
}
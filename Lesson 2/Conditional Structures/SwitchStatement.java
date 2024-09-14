class SwitchStatement{
    public static void main(String[]args){
        int season = 4;
        switch(season){
            case 1:
                System.out.println("Summer");
                break;
            case 2:
                System.out.println("Spring");
            case 3:
                System.out.println("Autumn");
            case 4:
                System.out.println("Winter");
            default:
                System.out.println("No defined season.");
        }
    }
}
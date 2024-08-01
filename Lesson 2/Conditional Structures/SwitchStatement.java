class SwitchStatement{
    public static void main(String[]args){
        int season = 4;
        switch(season){
            case 1:
                System.out.println("Summer");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Autumn");
                break;
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("No defined season.");
        }
    }
}
import java.util.Scanner;

class CheckLetterFixedd{
    public static void main(String[]args){
        System.out.print("Enter a letter: ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);

        if (ch >= 65){
            if (ch <= 90){
                System.out.println(ch + " is an uppercase letter.");
            }
            else if (ch >= 97){
                if(ch <= 122){
                    System.out.println(ch + " is a lowercase letter.");
                }
                else{
                    System.out.print(ch + " is not a lowercase letter.");
                }
            }
            else {
                System.out.println(ch +" is not a letter at all.");
            }
        }
        else {
            System.out.println(ch + " is not a letter at all.");
        }
    input.close();
    }
}
import java.util.Scanner;

class Lexcomparison{
    public static void main(String[] args) {
        Scanner txt = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = txt.nextLine();
        System.out.print("Enter second string: ");
        String str2 = txt.nextLine();

        int lxresult = str1.compareTo(str2);
        System.out.println("Lexicographic comparison: " + lxresult);
        txt.close();
    }
}


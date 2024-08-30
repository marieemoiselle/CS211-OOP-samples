import java.util.Scanner;
class Sample3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Welcome to CS 211: Object-oriented Programming!");
        System.out.print("Enter your name: ");
        name = input.nextLine();
        System.out.print("This course will be fun, " + name +"!");
        input.close();
    }
}
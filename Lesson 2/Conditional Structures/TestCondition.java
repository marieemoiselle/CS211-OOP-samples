public class TestCondition {
    public static void main(String[]args) {
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        /*  condition ? value if true : value if false */
        System.out.println(status);
    }
    
}
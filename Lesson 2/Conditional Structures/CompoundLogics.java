class CompoundLogics{
    public static void main(String[] args) {
        boolean testExpr1 = true;
        boolean testExpr2 = false;
        boolean negation = !testExpr1;
        boolean result_and = testExpr1 && testExpr2;
        boolean result_or = testExpr1 || testExpr2;

        System.out.println(testExpr1 + " && " + testExpr2 + " = " + result_and);
        System.out.println(testExpr1 + " || " + testExpr2 + " = " + result_or);
        System.out.println("!" + testExpr1 + " = " + negation);
    }
}
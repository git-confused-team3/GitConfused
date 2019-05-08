public class Addition {
    public static void main (String[] args) throws java.io.IOException {
        java.util.Scanner reader = new java.util.Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = reader.nextInt();
        System.out.println("Enter second number: ");
        int b = reader.nextInt();
        System.out.println(a + "+"+ b + " = " + (a+b));
    }
}

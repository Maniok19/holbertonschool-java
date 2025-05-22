public class PrintStringVariable {
    public static void main(String[] args) {
        String text = "Holberton School";
        System.out.printf("%1$s\n%1$s\n%1$s\n%1$.9s\n", text);
    }
}

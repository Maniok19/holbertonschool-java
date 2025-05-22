public class PrintStringVariable {
    public static void main(String[] args) {
        String text = "Holberton School";
        String holberton = text.substring(0, 9);
        System.out.printf("%1$s\n%1$s\n%1$s\n%2$s\n", text, text.substring(0, 9));
    }
}

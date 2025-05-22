public class PrintStringVariable {
    public static void main(String[] args) {
        String text = "Holberton School";
        String holberton = text.substring(0, 9);
        System.out.printf("%s\n%s\n%s", text, text, holberton)
    }
}

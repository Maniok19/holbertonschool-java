class TheNumber {
    public static int DoSum(int a, int b) {
        return a + b;
    }
}
public class Program {
    public static void main(String[] args) {
        System.out.printf("%d\n", TheNumber.DoSum(24, 32));
        System.out.printf("%d\n", TheNumber.DoSum(5, 0));
        System.out.printf("%d\n", TheNumber.DoSum(4, -2));
    }
}

public class EvenNumbers {
    public static void main(String[] args) {
        int num = 0;
        for (; num < 98; num++) {
            if (num % 2 == 0)
            System.out.printf("%d, ", num);
        }
        System.out.printf("%d\n", num);
    }
}

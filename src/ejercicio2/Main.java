public class Main {
    public static void main(String[] args) {
        int[] arrayIntegers = { 3, 5, 7, 9, 2 };
        int middle = arrayIntegers.length / 2 + 1;
        int left = 0;
        int right = arrayIntegers[middle- 1];

        for (int i = 0; i < middle; i++) {
            left += arrayIntegers[i];

        }
        System.out.println("Sum: " + left);

        for (int i = middle; i < arrayIntegers.length; i++) {
            right *= arrayIntegers[i];

        }
        System.out.println("multiplicacion " + right);
    }
}
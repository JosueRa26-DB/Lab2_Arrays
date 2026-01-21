package ejercicio3;

public class Main {
    public static void main(String[] args) {
        int[] arrayIntegers = {2,4,9,2,9,1,5,9};
        int maxValue = arrayIntegers[0];
        int count = 0;
        for (int i = 0; i < arrayIntegers.length; i++) {
            if (maxValue < arrayIntegers[i]) {
                maxValue =  arrayIntegers[i];
            }
        }
        for (int i = 0; i < arrayIntegers.length; i++) {
            if (arrayIntegers[i] == maxValue) {
                count++;
                
            }
        }
        System.out.println("The max value is " + maxValue);
        System.out.println("The max value is repeated: " + count + " times");
    }
}

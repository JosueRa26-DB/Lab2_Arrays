package ejercicio4;

public class Main {
    public static void main(String[] args) {
        int[] array = {3,6,9,1,4,8,2,5,7};
        int minPair = array[0];
        int maxInpair = array[0];
        bubbleSort(array);
        showArray(array);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] < minPair) {
                minPair = array[i];
            }
        }

        System.out.println("Lowest even number: " + minPair);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] > maxInpair) {
                maxInpair = array[i];
            }
        }

        System.out.println("Highest odd number: " + maxInpair);


    }

    public static void showArray(int[] array){
        for (int i : array) {
            System.out.print(i + ", ");
        }
    }

    public static void bubbleSort(int[] array){
        int size = array.length;
        
        for (int i = 0; i < size -1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] >  array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                
            }    
        }
    }
    
}

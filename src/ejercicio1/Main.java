public class Main {
    public static void main(String[] args) {
        int[] arrayA = { 2, 5, 7, 9 };
        int[] arrayB = { 4, 6, 8, 1 };
        int count = 0;
        int index = 0;
        
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 == 0) {
                count++;

            }
        }

        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] % 2 == 0) {
                count++;
            }
        }

        int[] arrayPair = new int[count];

         for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] % 2 == 0) {
                    arrayPair[index] = arrayA[i];
                    index++;
                

            }
        }

        for (int i = 0; i < arrayB.length; i++) {
            if (arrayB[i] % 2 == 0) {
                    arrayPair[index] = arrayB[i];
                    index++;
                

            }
        }  
        
        for (int i : arrayPair) {
            System.out.print(i + ", ");
            
        }

    }

}
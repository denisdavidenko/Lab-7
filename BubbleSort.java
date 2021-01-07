public class BubbleSort implements Sorter{
    public void sort(double[] arr) {

            System.out.println("Bubble Sort");
            int arraySize = arr.length;

            for(int i = 0; i < arraySize; ++i) {
                for(int j = 1; j < arraySize - i; ++j) {
                    if (arr[j] < arr[j - 1]) {
                        double changeNum = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = changeNum;
                    }
                }
            }

        }
    }


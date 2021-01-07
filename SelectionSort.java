public class SelectionSort implements Sorter {

    public void sort(double arr[]) {
        System.out.println("Selection sort");
        double inputLength = arr.length;
        for (int i = 0; i < inputLength - 1; i++) {
            int min = i;

            for (int j = i + 1; j < inputLength; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            double temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}

public class Main {
    public static void main(String args[]){
        double[] arr = {23, 4, 67, 45.554332434, 9, 78, 0, 4345, 94556.344};

        DataProcess dataProcess1 = new DataProcess(new SelectionSort(), new PrintArrayInRow());
        dataProcess1.process(arr);

        DataProcess dataProcess2 = new DataProcess(new InsertionSort(), new PrintArrayInRow());
        dataProcess2.process(arr);

        DataProcess dataProcess3 = new DataProcess(new BubbleSort(), new PrintArrayInRow());
        dataProcess3.process(arr);


    }
}

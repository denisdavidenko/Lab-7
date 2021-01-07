public class DataProcess {
    private final Sorter sorter;
    private final PrintArray printArray;

    public DataProcess(Sorter sorter, PrintArray printArray){
        this.sorter = sorter;
        this.printArray = printArray;
    }

    public void process(double array[]){
        sorter.sort(array);
        printArray.print(array);
    }
}

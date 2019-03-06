import containers.ProductContainerRecorder;

public class Main {

    public static void main(String[] args) {
        // write test code here
        double[] test = new double[]{12.0, 3.0, 9.0, -4.0, 13.0, 6.0, 7.0, 15.0, 9.0, -1.0, 4.0, 12.0};
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.takeFromTheContainer(11.3);
        juice.addToTheContainer(1.0);
        juice.printAnalysis();
    }

}

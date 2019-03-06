public class Calculator {
    private Reader reader;
//    private int val1;
//    private int val2;
    private int numberOfCaulculations;


    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = this.reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                this.numberOfCaulculations++;
            } else if (command.equals("difference")) {
                difference();
                this.numberOfCaulculations++;
            } else if (command.equals("product")) {
                product();
                this.numberOfCaulculations++;
            }
        }

        statistics();
    }

//    private void readVals() {
//        System.out.println("Value 1:");
//        this.val1 = this.reader.readInteger();
//
//        System.out.println("Value 2:");
//        this.val2 = this.reader.readInteger();
//    }

    private void sum() {
//        readVals();

        System.out.println("Value 1:");
        int val1 = this.reader.readInteger();

        System.out.println("Value 2:");
        int val2 = this.reader.readInteger();

        System.out.println("sum of the values is " + (val1 + val2));
    }

    private void difference() {
//        readVals();
        System.out.println("Value 1:");
        int val1 = this.reader.readInteger();

        System.out.println("Value 2:");
        int val2 = this.reader.readInteger();
        System.out.println("difference of the values is " + (val1 - val2));
    }

    private void product() {
//        readVals();
        System.out.println("Value 1:");
        int val1 = this.reader.readInteger();

        System.out.println("Value 2:");
        int val2 = this.reader.readInteger();
        System.out.println("product of the values is " + (val1 * val2));
    }

    private void statistics() {
        System.out.println("Calculations done: " + this.numberOfCaulculations);
    }
}

public class Main {
    public static void main(String[] args) {
        String binNum1 = "00000001";
        String binNum2 = "01111111";

        BinOps bins = new BinOps();
        System.out.println("Число 128 в двоичной системе: " + bins.sum(binNum1, binNum2));
        System.out.println("Число 127 в двоичной системе: " + bins.mult(binNum1, binNum2));
    }
}
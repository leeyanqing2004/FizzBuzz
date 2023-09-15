public class Multiples {
    public static void main(String[] args) {

        int finalNumOfMultiples = 0;

        for (int num = 1; num < 1000; num++) {
            boolean multipleOf3 = num % 3 == 0;
            boolean multipleOf5 = num % 5 == 0;

            if (multipleOf3) {
                finalNumOfMultiples += 1;
            } else if (multipleOf5) {
                finalNumOfMultiples += 1;
            }
        } System.out.println(finalNumOfMultiples);
    }
}

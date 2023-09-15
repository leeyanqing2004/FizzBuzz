public class Reduce {
    public static void main(String[] args) {
        int numOfSteps = 0;
        int num = 100;

        while (num > 0) {
            boolean isEven = num % 2 == 0;

            if (isEven) {
                num = num / 2;
            } else {
                num = num - 1;
            }

            numOfSteps += 1;
        }

        System.out.println(numOfSteps);
            }
}

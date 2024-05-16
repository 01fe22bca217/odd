public class SumOfOddAndEven {
    public static void main(String[] args) {
        int givenNumber = 10; // given number
        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int i = 1; i <= givenNumber; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;
            } else {
                sumOfOdd += i;
            }
        }

        System.out.println("Sum of odd numbers: " + sumOfOdd);
        System.out.println("Sum of even numbers: " + sumOfEven);
    }
}
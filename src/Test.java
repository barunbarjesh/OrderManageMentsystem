import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, -9,6, 7, 8, 9, 9};

        Integer secondHighestNo = Arrays.stream(numbers)
                .distinct()
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .get();

        int temp;
        int[] uniqueNumbers = Arrays.stream(numbers)
                .distinct()
                .toArray();
        for (int i = 0; i < uniqueNumbers.length; i++) {
            for (int j = i + 1; j < uniqueNumbers.length; j++) {
                if (uniqueNumbers[i] > uniqueNumbers[j]) {
                    temp = uniqueNumbers[i];
                    uniqueNumbers[i] = uniqueNumbers[j];
                    uniqueNumbers[j] = temp;
                }
            }
        }
        System.out.println("java7 output 2nd Highest No:"+uniqueNumbers[uniqueNumbers.length-2]);
        System.out.println("java8 output 2nd Highest No:"+secondHighestNo);
    }
}

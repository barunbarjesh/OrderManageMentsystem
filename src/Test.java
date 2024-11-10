import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer secondHighestNo = Arrays.stream(number)
                .boxed().sorted(Comparator.reverseOrder())
                .skip(1).findFirst().get();

        int temp;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] > number[j]) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }
        }
        System.out.println(number[number.length-2]);
        System.out.println(secondHighestNo);
    }
}

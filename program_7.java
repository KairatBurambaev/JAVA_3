import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class program_7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Введите длину списка: ");
        List<Integer> list = new ArrayList<Integer>();

        int count = inp.nextInt();
        for (int i = 0; i < count; i++) {
            int a = (int) (Math.random()*100);
            list.add(a);
        }
        System.out.println("Список из случайных целых чисел: " + list);

        Integer min = Integer.MAX_VALUE;
        for (Integer i: list) {
            if (min > i) {
                min = i;
            }
        }
        // finding the minimum value using iteration

        int sum = 0;
        for (Integer i: list) {
            sum+=i;
            }
        int average = sum/count;
        // summing the elements of a list by iterating

        System.out.println("Минимальный элемент: " + min);
        // System.out.println("Минимальный элемент: " + Collections.min(list));

        System.out.println("Максимальный элемент: " + Collections.max(list));
        // finding the maximum value using collections method

        System.out.println("Среднее арифметическое: " + average);
    }
}
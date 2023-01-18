import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int i = new Random().nextInt(2000);     // Task1
        System.out.println("Задача 1: " + i);

        int n = highBit(i);       //Task2
        System.out.println("Задача 2: " + n);

        int[] m1 = multiples(n);
        System.out.println("Задача 3: " + Arrays.toString(m1)); // Task3

        //Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        int[] m2 = notMultiples(n);
        System.out.println("Задача 4: " + Arrays.toString(m2)); // Task4
    }

    static int highBit(int n) {
        int result = 0;
        while (n != 1) {
            n >>= 1;
            result++;
        }
        return result;
    }

    static int[] multiples(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = n; i <= Short.MAX_VALUE; i++) {
            if (i % n == 0) {
                numbers.add(i);
            }
        }

        int[] m1 = new int[numbers.size()];
        for (int i = 0; i < m1.length; i++) {
            m1[i] = numbers.get(i);
        }
        return m1;
    }

    static int[] notMultiples(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = Short.MIN_VALUE; i <= 0; i++) {
            if (i % n != 0) {
                numbers.add(i);
            }
        }

        int[] m2 = new int[numbers.size()];
        for (int i = 0; i < m2.length; i++) {
            m2[i] = numbers.get(i);
        }
        return m2;
    }
}
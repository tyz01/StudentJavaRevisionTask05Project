package by.itstep.javatraining.revision.task;

/*	Task 05. The Average Number [среднее число]
 *
 *	Даны три различных числа. Определите среднее по величине число.
 *
 *	Примечание
 *	1) Не забудьте про "защиту от дурака": все три числа должны быть различными.
 *
 *	Формат входных данных [input]
 *	На вход даётся три различных целых числа в диапазоне типа int.
 *
 *	Формат выходных данных [output]
 *	Должно быть возвращено среднее по величине число или ноль, если среди чисел есть одинаковые.
 *
 *	[ input 1]: 1 2 3
 *	[output 1]: 2
 *
 *	[ input 2]: 17 23 11
 *	[output 2]: 11
 *
 *	[ input 3]: 7 7 7
 *	[output 3]: 0
 *
 *	[ input 4]: 5 7 7
 *	[output 4]: 0
 */

import java.util.Arrays;

public class Task05 {
    public static int task05(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            return 0;
        }
        // second variable
//         int [] array = {a , b, c};
//        Arrays.sort(array);
//        return array[1];
        int average = c;
        if ((a > b && a < c) || (a > c && a < b)) {
            average = a;
        }
        if ((b < c && b > a) || (b > c && a > b)) {
            average = b;
        }
        return average;
    }
}
package by.itstep.javatraining.revision.task;

/*  Task 06. Roulette Wheel Colors [цвета колеса рулетки]
 *
 *  На колесе рулетки карманы пронумерованы от 0 до 36. Ниже приведены цвета карманов:
 *  1) карман 0 зеленый (green);
 *  2) для карманов с 1 по 10 карманы с нечетным номером имеют красный (red) цвет,
 *  карманы с четным номером – черный (black);
 *  3) для карманов с 11 по 18 карманы с нечетным номером имеют черный цвет,
 *  карманы с четным номером – красный;
 *  4) для карманов с 19 по 28 карманы с нечетным номером имеют красный цвет,
 *  карманы с четным номером – черный;
 *  5) для карманов с 29 по 36 карманы с нечетным номером имеют черный цвет,
 *  карманы с четным номером – красный.
 *
 *  Определите цвет кармана, который задаётся целым числом в диапазоне от 0 до 36.
 *
 *	Формат входных данных [input]
 *	На вход подаётся целое число в диапазоне int.
 *
 *	Формат выходных данных [output]
 *	Должен быть возвращён соответствующий цвет кармана в виде строки: "black", "red", "green"
 *  или сообщение об ошибке "error", если число лежит вне диапазона от 0 до 36.
 *
 *	[ input 1]: 0
 *	[output 1]: green
 *
 *	[ input 2]: 1
 *	[output 2]: red
 *
 *	[ input 3]: 2
 *	[output 3]: black
 *
 *	[ input 4]: -1
 *	[output 4]: error
 *
 *	[ input 5]: 37
 *	[output 5]: error
 */

public class Task06 {
    public static String task06(int number) {
        if (number < 0 || number > 36) {
            return "error";
        }
        String color = "red";

        boolean noEvenNumber = number % 2 != 0;
        boolean evenNumber = number % 2 == 0;

        if (number == 0) {
            color = "green";
        }

        if (((number > 0 && number < 11 || number > 18 && number < 29) && evenNumber)
                || (number > 10 && number < 19 || number > 28 && number < 36) && noEvenNumber) {
            color = "black";
        }

        return color;
    }
}
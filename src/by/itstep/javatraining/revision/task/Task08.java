package by.itstep.javatraining.revision.task;

/*	Task 08. Next Date [дата следующего дня]
 *
 *  Заданы три целых числа d, m и y, которые задают некоторую дату по Грегорианскому календарю.
 *  Определите дату следующего дня.
 *
 *	Примечание
 *	1) Постарайтесь не использовать стандартную библиотеку работы со временем
 *  (задание закрепляет знания по использованию именно условных конструкций).
 *  2) Не забудьте про "защиту от дурака": все данные должны быть корректными.
 *  3) Отсчёт года идёт с нуля (наша эра), т.е. не должно быть отрицательного года.
 *
 *	Формат входных данных [input]
 *	На вход даются три целых числа в диапазоне int.
 *
 *	Формат выходных данных [output]
 *	Должна быть возвращена строка с соответствующей датой следующего дня в формате "DD.MM.YYYY"
 *  или "Error.", если данные введены некорректно.
 *
 *	[ input 1]: 3 5 2023
 *	[output 1]: 04.05.2023
 *
 *	[ input 2]: 28 2 2023
 *	[output 2]: 01.03.2023
 *
 *	[ input 3]: 28 2 2020
 *	[output 3]: 29.02.2020
 *
 *	[ input 4]: 30 2 2020
 *	[output 4]: Error.
 *
 *	[ input 5]: 1 13 2020
 *	[output 5]: Error.
 *
 *	[ input 6]: 1 1 -1
 *	[output 6]: Error.
 *
 *	[ input 7]: 1 1 1
 *	[output 7]: 02.01.0001
 */

public class Task08 {
    public static String task08(int day, int month, int year) {
        boolean februry29 = (month == 2 && year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        if ((days30 && day == 31) || day < 1 || day > 31 || month < 1 || month > 12 || year < 0 ||
                (month == 2 && day > 29) || (month == 2 && !februry29 && day == 29)) {
            return "Error.";
        }
        if ((februry29 && day == 29) || (!februry29 && day == 28) && month != 12) {
            month += 1;
            day = 1;
        }
        if (day != 1 && februry29 && day <= 28) {
            day += 1;
        }
        if ((days30 && day == 30) || (!days30 && day == 31) && month != 12 ) {
            month += 1;
            day = 1;
        }
        if (day == 31) {
            year += 1;
            day = 1;
            month = 1;
        }
        if (month != 2 && (!days30 && day != 1) || (days30 && day != 1)) {
            day += 1;
        }
        return String.format("%02d", day) + "."
                + String.format("%02d", month) + "."
                + String.format("%04d", year);
    }
}
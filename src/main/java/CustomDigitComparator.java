import java.util.Comparator;

/**
 * Реализует интерфейс Comparator<Integer>.
 * Определяет следующий порядок по возрастанию:
 * - Сначала четные числа, затем нечетные.
 * - На вход подаются числа, отличные от null.
 */
public class CustomDigitComparator implements Comparator <Integer> {
    /**
     * Производит сравнение двух чисел
     * возвращает положительное при o1 > o2,
     * отрицательное при o1 < o2,
     * или ноль при o1 == o2.
     */
    public int compare(Integer o1, Integer o2) {
        if (o1 % 2 == 0 && o2 % 2 == 0) {
            if (o1 == o2) {
                return 0;
            } else if (o1 > o2) {
                return 1;
            } else {
                return -1;
            }
        } else if (o1 % 2 == 0 && o2 % 2 != 0) {
            return -1;
        } else if (o1 % 2 != 0 && o2 % 2 == 0) {
            return 1;
        } else {
            if (o1 == o2) {
                return 0;
            } else if (o1 > o2) {
                return 1;
            } else {
                return -1;
            }
        }
    }
}

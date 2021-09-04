import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomDigitComparatorTest {

    CustomDigitComparator customDigitComparator;
    List<Integer> positive;
    List<Integer> negative;
    List<Integer> all;

    /**
     * Подготовка данных для тестов.
     */
    @BeforeEach
    public void init() {
        customDigitComparator = new CustomDigitComparator();
        positive = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            positive.add(i);
        }
        negative = new ArrayList<>();
        for (int i = -1; i > -5; i--) {
            negative.add(i);
        }
        all = new ArrayList<>();
        for (int i = -3; i < 4; i++) {
            all.add(i);
        }
    }

    /**
     * Очистка объектов после тестов.
     */
    @AfterEach
    public void clean() {
        customDigitComparator = null;
        positive = null;
        negative = null;
        all = null;
    }

    /**
     * Подается список целых положительных чисел.
     * Ожидается сортировка:
     * по возрастанию, сначала четные, затем нечетные
     */
    @Test
    public void compare_positive_Test() {
        positive.sort(customDigitComparator);
        Assert.assertEquals(Arrays.asList(0, 2, 1, 3), Arrays.asList(positive.toArray()));
    }

    /**
     * Подается список целых отрицательных чисел.
     * Ожидается сортировка:
     * по возрастанию, сначала четные, затем нечетные
     */
    @Test
    public void compare_negative_Test() {
        negative.sort(customDigitComparator);
        Assert.assertEquals(Arrays.asList(-4, -2, -3, -1), Arrays.asList(negative.toArray()));
    }

    /**
     * Подается список целых чисел.
     * Ожидается сортировка:
     * по возрастанию, сначала четные, затем нечетные
     */
    @Test
    public void compare_all_Test() {
        all.sort(customDigitComparator);
        Assert.assertEquals(Arrays.asList(-2, 0, 2, -3, -1, 1, 3), Arrays.asList(all.toArray()));
    }

}
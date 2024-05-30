import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateNextDateOkTest {

    @ParameterizedTest(name = "{index} => input=({0}, {1}, {2}), expected=({3}, {4}, {5})")
    @MethodSource("provideDatesForNextDate")
    @DisplayName("Parameterized Test for nextDate Method")
    void testNextDate(int year, int month, int day, int expectedYear, int expectedMonth, int expectedDay) {
        Date date = new Date(year, month, day);
        Date expectedDate = new Date(expectedYear, expectedMonth, expectedDay);
        assertEquals(expectedDate, date.nextDate());
    }

    private static List<Arguments> provideDatesForNextDate() {
        return Arrays.asList(
                Arguments.of(1700, 6, 20, 1700, 6, 21),
                Arguments.of(2005, 4, 15, 2005, 4, 16),
                Arguments.of(1901, 7, 20, 1901, 7, 21),
                Arguments.of(3456, 3, 27, 3456, 3, 28),
                Arguments.of(1500, 2, 17, 1500, 2, 18),
                Arguments.of(1700, 6, 29, 1700, 6, 30),
                Arguments.of(1800, 11, 29, 1800, 11, 30),
                Arguments.of(3453, 1, 29, 3453, 1, 30),
                Arguments.of(444, 2, 29, 444, 3, 1),
                Arguments.of(2005, 4, 30, 2005, 5, 1),
                Arguments.of(3453, 1, 30, 3453, 1, 31),
                Arguments.of(3456, 3, 30, 3456, 3, 31),
                Arguments.of(1901, 7, 31, 1901, 8, 1),
                Arguments.of(3453, 1, 31, 3453, 2, 1),
                Arguments.of(3456, 12, 31, 3457, 1, 1)
        );
    }
}
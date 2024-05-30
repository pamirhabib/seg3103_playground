import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DateNextDateExceptionTest {

    @ParameterizedTest(name = "{index} => input=({0}, {1}, {2})")
    @MethodSource("provideInvalidDatesForNextDate")
    @DisplayName("Parameterized Test for nextDate Method with Invalid Dates")
    void testNextDateException(int year, int month, int day) {
        assertThrows(IllegalArgumentException.class, () -> new Date(year, month, day).nextDate());
    }

    private static List<Arguments> provideInvalidDatesForNextDate() { // Proide invalid dates
        return Arrays.asList(
                Arguments.of(1500, 2, 31),
                Arguments.of(1500, 2, 29),
                Arguments.of(-1, 10, 20),
                Arguments.of(1458, 15, 12),
                Arguments.of(1975, 6, -50)
        );
    }
}

package question10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Question10Test {
    
    @ParameterizedTest
    @MethodSource("provideDataForEvaluateLengthString")
    public void testEvaluateLengthString(String input, int expected) {
        // Add a null character to the end of the string
        input += '\0';
        assertEquals(expected, Question10.evaluateLengthString(input));
    }

    public static Stream<Arguments> provideDataForEvaluateLengthString() {
        return Stream.of(
            Arguments.of("hello", 5),
            Arguments.of("HelloWorld", 10),
            Arguments.of("Mateus", 6)
        );
    }
}

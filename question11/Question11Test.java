package question11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Question11Test {

    @ParameterizedTest
    @MethodSource("provideDataForReverseString")
    public void testReverseString(String input, String expected) {
        assertEquals(expected, Question11.reverseString(input));
    }

    public static Stream<Arguments> provideDataForReverseString() {
        return Stream.of(
                Arguments.of("arara", "arara"),
                Arguments.of("HelloWorld", "dlroWolleH"),
                Arguments.of("socorram me subi no onibus em marrocos", "socorram me subino on ibus em marrocos"));
    }
}

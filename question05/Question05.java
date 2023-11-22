import static org.junit.Assert.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import question04.Question04;

public class Question05 {

    @ParameterizedTest
    @MethodSource("provideDataForConcatRemove")
    public void testConcatRemove(String s, String t, int k, boolean expected) {
        assertEquals(expected, Question04.concatRemove(s, t, k));
    }

    public static Stream<Arguments> provideDataForConcatRemove() {
        return Stream.of(
            Arguments.of("abc", "abcd", 1, true),
            Arguments.of("abc", "abcd", 0, false),
            Arguments.of("abc", "xyz", 6, true),
            Arguments.of("abc", "xyz", 5, false),
            Arguments.of("blablablabla", "blablabcde", 8, true),
            Arguments.of("tab", "tab", 7, true)
        );
    }

}

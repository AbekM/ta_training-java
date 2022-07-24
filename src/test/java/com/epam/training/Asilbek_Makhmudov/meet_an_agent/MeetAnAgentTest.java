package com.epam.training.Asilbek_Makhmudov.meet_an_agent;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.epam.training.Asilbek_Makhmudov.meet_an_agent.MeetAnAgent.PASSWORD;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static com.github.stefanbirkner.systemlambda.SystemLambda.withTextFromSystemIn;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeetAnAgentTest {

    @ParameterizedTest
    @MethodSource("getParameters")
    public void correctPasswordTest(int userInput, String expected) throws Exception {

        String actual = tapSystemOut(
                () -> withTextFromSystemIn(Integer.toString(userInput))
                        .execute(() -> MeetAnAgent.main(new String[]{}))
        );

        assertEquals(expected, actual.strip());
    }

    private static Stream<Arguments> getParameters() {
        return Stream.of(
                Arguments.of(PASSWORD, "Hello, Agent"),
                Arguments.of(PASSWORD + 1, "Access denied"),
                Arguments.of(PASSWORD + PASSWORD, "Access denied"),
                Arguments.of(100 + PASSWORD, "Access denied")
        );
    }
}

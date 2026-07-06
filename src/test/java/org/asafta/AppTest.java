package org.asafta;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void shouldReturnHelloWorld() {
        assertEquals("Hello World!", App.getMessage());
    }
}
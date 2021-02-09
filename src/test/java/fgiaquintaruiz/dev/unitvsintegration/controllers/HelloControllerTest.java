package fgiaquintaruiz.dev.unitvsintegration.controllers;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {
        HelloController helloController = new HelloController(); // Arrange
        String response = helloController.hello("World");// Act
        assertEquals("Hello, World", response);// Assert
    }
}
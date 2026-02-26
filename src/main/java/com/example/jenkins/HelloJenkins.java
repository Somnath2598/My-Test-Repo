package com.example.jenkins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloJenkinsTest {

    @Test
    public void testGetMessage() {
        String expected = "Hello Jenkins! Your Maven project is running successfully.";
        assertEquals(expected, HelloJenkins.getMessage());
    }
}

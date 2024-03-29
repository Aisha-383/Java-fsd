package com.ecommerce.test;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import org.junit.runner.RunWith;
 
@DisplayName("JUnit 5 Conditional Tests Example")

public class ConditionalTests {

        @Test
        @EnabledOnOs({OS.WINDOWS})
        public void runOnWindows() {
                System.out.println("This runs on Windows");
        }

        @Test
        @EnabledOnOs({OS.LINUX})
        public void runOnLinux() {
                System.out.println("This runs on Linux");
        }

        
        @Test
        @DisabledIf("Math.random() < 0.314159")
        void mightNotBeExecuted() {
                System.out.println("This may or not execute ");
        }
}


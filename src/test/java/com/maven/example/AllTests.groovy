package com.maven.example
import junit.framework.Test

class AllTests {
    static Test suite() {
        def allTests = new GroovyTestSuite()
        allTests.addTestSuite(PersonaTest.class)
        allTests.addTestSuite(EmpleadoTest.class)
        return allTests
    }
}
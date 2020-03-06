package com.maven.example
import junit.framework.Test

class AllTests {
    static Test suite() {
        def allTests = new GroovyTestSuite()
        allTests.addTestSuite(StudentTest.class)
        allTests.addTestSuite(EmployeeTest.class)
        return allTests
    }
}

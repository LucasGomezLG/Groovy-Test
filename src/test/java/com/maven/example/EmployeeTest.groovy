package com.maven.example


import groovy.mock.interceptor.MockFor
import groovy.test.GroovyTestCase

class EmployeeTest extends GroovyTestCase{

    void testDisplay() {

        def mock = new MockFor(Student)

        mock.demand.getName { 'Luc' }
        mock.demand.getApellido { 'gom' }

        mock.use {
            def luc = new Student (name: 'Luc', apellido: 'gom')
            def employee = new Employee ( lucas: luc )

            assert employee.Display() == 'Luc gom'
        }

        mock.expect.verify()

    }
}

package com.maven.example


import groovy.mock.interceptor.MockFor
import groovy.test.GroovyTestCase

class EmpleadoTest extends GroovyTestCase{

    void testDisplay() {

        def mock = new MockFor(Persona)

        mock.demand.getName { 'Luc' }
        mock.demand.getApellido { 'gom' }

        mock.use {
            def luc = new Persona (name: 'Luc', apellido: 'gom')
            def employee = new Empleado ( lucas: luc )

            assert employee.Display() == 'Luc gom'
        }

        mock.expect.verify()

    }
}

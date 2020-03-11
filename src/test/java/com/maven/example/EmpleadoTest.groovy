package com.maven.example
import groovy.mock.interceptor.MockFor
import groovy.test.GroovyTestCase
import org.junit.jupiter.api.Test

class EmpleadoTest extends GroovyTestCase{

    @Test
    void testDisplay() {

        def mock = new MockFor(Persona)

        mock.demand.getName { 'Luc' }
        mock.demand.getApellido { 'gom' }

        mock.use {

            def luc = new Persona (name: 'Luc', apellido: 'gom')
            def empleado = new Empleado ( lucas: luc )

            assert empleado.Display() == 'Luc gom'

        }

        mock.expect.verify()

    }
}

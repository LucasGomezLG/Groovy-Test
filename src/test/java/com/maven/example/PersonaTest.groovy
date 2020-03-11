package com.maven.example

import groovy.test.GroovyTestCase
import org.junit.jupiter.api.Test

class PersonaTest extends GroovyTestCase{

    @Test
        void testDisplay() {
            def stud = new Persona(name: 'Luc', apellido: 'gom')
            def expected = 'Luc gom'
            assertToString(stud.Display(), expected)
        }

}

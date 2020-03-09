package com.maven.example

import groovy.test.GroovyTestCase

class PersonaTest extends GroovyTestCase{

        void testDisplay() {
            def stud = new Persona(name: 'Luc', apellido: 'gom')
            def expected = 'Luc gom'
            assertToString(stud.Display(), expected)
        }

}

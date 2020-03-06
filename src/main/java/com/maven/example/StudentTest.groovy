package com.maven.example

import groovy.test.GroovyTestCase

class StudentTest extends GroovyTestCase{

        void testDisplay() {
            def stud = new Student(name: 'Luc', apellido: 'gom')
            def expected = 'Luc gom'
            assertToString(stud.Display(), expected)
        }

}

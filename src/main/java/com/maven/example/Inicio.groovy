package com.maven.example

class Inicio {
    static void main(String[] args) {
        Persona stu = new Persona();
        stu.name = "Luc";
        stu.apellido = "gom";

        Empleado emp = new Empleado()
        emp.lucas = stu
        println emp.Display()
    }
}







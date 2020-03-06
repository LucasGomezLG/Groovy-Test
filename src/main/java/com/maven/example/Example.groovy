package com.maven.example

class Example {
    static void main(String[] args) {
        Student stu = new Student();
        stu.name = "Luc";
        stu.apellido = "gom";
        println stu.Display()

        Employee emp = new Employee()
        emp.lucas = stu
        println emp.Display()
    }
}







package com.basednihilus.kotlincourse.lesson17.homework

import javax.naming.Name

open class EducationalInstitutions(
    val name: String,
    val address: String,
    val studentCount: Int
) {
    open fun getInfo(): String {
        return "Данное учебное заведение называется $name, количество обучающихся $studentCount, находится по адресу $address"
    }
}

open class School(name: String, address: String, studentCount: Int, val type: String): EducationalInstitutions(name,
    address,
    studentCount) {
}

open class University(name: String, address: String, studentCount: Int, val program: String): EducationalInstitutions(name,
    address, studentCount) {
}

class SpecializedSchool(name: String, address: String, studentCount: Int, type: String, val specialization: String):
    School(name, address, studentCount, type) {

}
class Faculty(name: String, address: String, studentCount: Int, program: String, val facultyName: String): University
    (name, address, studentCount, program) {

}
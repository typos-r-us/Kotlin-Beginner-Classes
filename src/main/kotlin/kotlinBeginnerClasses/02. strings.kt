package kotlinBeginnerClasses

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// There are many ways to declare strings in Kt.
// There are two types of strings; mutable (var) and immutable (val)

fun main() {
    // Date
    val today = LocalDateTime.now()
    println(today);
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd ")
    val todayFormatted = today.format(formatter);
    println(todayFormatted);
    // immutable: Cannot be changed/reassigned.
    val school ="emobilis";
    val manySchools="UoN, FreeCodeCamp, Pentester Academy ";
    // mutable
    var student = "Brian";
    var manyStudents = "Selina, Samuel, Kilonzi, Marcus";

    var allStudents = student+", "+manyStudents; // This is concatenation (kienyeji appending of strings to each other)
    var allSchools = "$school, $manySchools"; // This is a template. Very clean as compared to concatenation

    student = "Amos"; // reassign value of student.
    val mergedStudentNames = student+", "+manyStudents;

    println("All students: $allStudents");
    println("All schools: $allSchools");
    println("Merged student names: $mergedStudentNames"); // prints Amos in place of Brian

}
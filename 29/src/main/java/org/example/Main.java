package org.example;

import java.util.Arrays;
import java.util.Comparator;

class StudentService {


    public Student bestStudent(Student[] students) {
        Student best = students[0];
        for (Student student : students) {
            if (student.getAverageGrade() > best.getAverageGrade()) {
                best = student;
            }
        }
        return best;
    }


    public void sortBySurname(Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::getSurname)); // Сортируем по фамилии
    }

    public static void main(String[] args) {

        Student student1 = new Student("Алиса", "Шпак");
        student1.addGrade(9);
        student1.addGrade(10);

        Student student2 = new Student("Кирил", "");
        student2.addGrade(7);
        student2.addGrade(8);

        Student[] students = {student1, student2};


        StudentService service = new StudentService();

        Student best = service.bestStudent(students);
        System.out.println("Лудший студент: " + best.getName() + " " + best.getSurname());


        service.sortBySurname(students);
        System.out.println("Сортированно по фамиилии:");
        for (Student student : students) {
            System.out.println(student.getSurname() + ", " + student.getName());
        }
    }
}

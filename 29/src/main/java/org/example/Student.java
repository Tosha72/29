package org.example;

import java.util.Arrays;
import java.util.Comparator;

class Student {
    private String name;
    private String surname;
    private int[] grades = new int[10];
    private int gradeCount = 0;


    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) {
        if (gradeCount < 10) {
            grades[gradeCount++] = grade;
        } else {

            System.arraycopy(grades, 1, grades, 0, 9);
            grades[9] = grade;
        }
    }


    public double getAverageGrade() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / gradeCount; // Возвращаем среднее значение
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', surname='" + surname + "', averageGrade=" + getAverageGrade() + '}';
    }
}

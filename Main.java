package com.edu;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

class Classroom {
    public String registerStudent(Student student) {
        // Validate name
        if (!student.name.equals(student.name.toUpperCase())) {
            return "Block letters needed";
        }

        // Validate score
        if (student.score < 0 || student.score > 100) {
            return "Invalid score";
        }

        return "Registered";
    }

    public String studentCard(String card) {
        // Validate card
        if (!card.matches("\\d+")) {
            return "Invalid card";
        }

        return "Valid card";
    } 
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("A", 6);
        Classroom cn = new Classroom();

        String registrationResult = cn.registerStudent(s1);
        System.out.println(registrationResult);
        
        String cardResult = cn.studentCard("123456");
        System.out.println(cardResult);
    }
}


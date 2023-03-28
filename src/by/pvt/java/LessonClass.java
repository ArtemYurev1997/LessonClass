package by.pvt.java;

import java.util.Arrays;



public class LessonClass {

    public static void main(String[] args) {
        Student[] students = initialize();

        System.out.println(Arrays.toString(getStudentsByFaculty(students, "Телекоммуникаций")));
        System.out.println();
        System.out.println(Arrays.toString(getStudentsByGroup(students, "202")));
        System.out.println();
        System.out.println(Arrays.toString(getStudentsByFacultyandCours(students, "Телекоммуникаций", 2)));
        System.out.println();
        System.out.println(Arrays.toString(getStudentsByData(students, 1998)));
        System.out.println();
        System.out.println(Arrays.toString(getStudentsByFacultySet(students, "Телекоммуникаций")));
        System.out.println();
    }

    static Student[] initialize() {
        Student[] students = new Student[6];
        Student student1 = new Student(1, "Адрей", "Андреев",  1999,   "Строительный", 1, "101");
        Student student2 = new Student(2, "Иван", "Иванов",  1999,  "Строительный", 1, "101");
        Student student3 = new Student(3, "Алексей", "Алексеев",  2000,  "Телекоммуникаций", 2, "202");
        Student student4 = new Student(4, "Степан", "Степанов", 1998, "Телекоммуникаций", 2, "202");
        Student student5 = new Student(5, "Ольга", "Тиханович", 1997, "Телекоммуникаций", 2, "202");
        Student student6 = new Student(6, "Екатерина", "Смоляк", 1998, "Телекоммуникаций", 2, "2");
            students[0] = student1;
            students[1] = student2;
            students[2] = student3;
            students[3] = student4;
            students[4] = student5;
            students[5] = student6;

                return students;
    }

    public static Student[] getStudentsByFaculty(Student[] students, String faculty) {
        Student[] newStudents = new Student[students.length];
        int j = 0;
        for (Student student : students) {
            if (student.getFacultate().equals(faculty)) {
                System.out.println(student.information());
                newStudents[j] = student;
                j++;
            }
        }
        return newStudents;
    }


    public static Student[] getStudentsByGroup(Student[] students, String group) {
        Student[] newStudents = new Student[students.length];
        int j = 0;
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                System.out.println(student.information());
                newStudents[j] = student;
                j++;
            }
        }

        return newStudents;
    }

    public static Student[] getStudentsByFacultyandCours(Student[] students, String faculty, int course) {
        Student[] newStudents = new Student[students.length];
        int j = 0;
        for (Student student : students) {
            if (student.getFacultate().equals(faculty) && student.getCourse() == course) {
                System.out.println(student.information());
                newStudents[j] = student;
                j++;
            }
        }
        return newStudents;
    }


    public static Student[] getStudentsByData(Student[] students, int data) {
        Student[] newStudents = new Student[students.length];
        int j = 0;
        for (Student student : students) {
            if (student.getData() > data) {
                System.out.println(student.information());
                newStudents[j] = student;
                j++;
            }
        }

        return newStudents;
    }


    public static Student[] getStudentsByFacultySet(Student[] students, String faculty) {
        Student[] newStudents = new Student[students.length];
        int j = 0;
        for (Student student : students) {
            if (student.getFacultate().equals(faculty)) {
                student.setFacultate("KSIS");
                System.out.println(student.information());
                newStudents[j] = student;
                j++;
            }
        }
        return newStudents;
    }

}


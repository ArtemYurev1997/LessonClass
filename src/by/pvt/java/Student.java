package by.pvt.java;

public class Student {
     private int id;
     private String name;
     private  String surname;
     private int data;
     private  String facultate;
     private int course;
     private String group;

     public Student() {

     }

     public Student(int id, String name, String surname1, int data, String facultate, int course, String group) {
         this.id = id;
         this.name = name;
         surname = surname1;
         this.data = data;
         this.facultate = facultate;
         this.course = course;
         this.group = group;
     }

     public String getName() {
         return name;
     }
     public void setName(String name1) {
        name = name1;
     }

     public int getId() {
         return id;
     }
     public void setId(int id) {
         this.id = id;
     }

     public String getSurname() {
         return surname;
     }
     public void setSurname(String surname) {
         this.surname = surname;
     }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    public String getFacultate() {
        return facultate;
    }
    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    public String information() {
         return "id: " + id + ", " + "name: " + name + ", " +
                 "surname: " + surname + ", " + "faculty: " + facultate;

    }
}


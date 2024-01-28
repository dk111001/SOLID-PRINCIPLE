package prototype;

import prototype.Student;

public class client {
    public static void main(String[] args){
        Student firstStudent = new Student();
        firstStudent.setAge(22);
        firstStudent.setName("Deepak Kamboj");
        firstStudent.setEnrollYear(2021);
        firstStudent.setPsp(95.2);
        firstStudent.setInstructor("Bharat");
        firstStudent.setId(10);
        firstStudent.setBatchName("Morning");

        Student secondStudent = firstStudent.clone();
        System.out.println(secondStudent.getBatchName());
    }
}

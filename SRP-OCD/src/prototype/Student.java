package prototype;

public class Student implements Prototype<Student> {

    private int id;
    private int age;
    private String name;
    private String batchName;
    private String instructor;
    private double psp;
    private int enrollYear;

    public Student(){

    }

    public Student(Student student){
        this.batchName = student.batchName;
        this.instructor = student.instructor;
        this.psp = student.psp;
        this.enrollYear = student.enrollYear;
    }

    @Override
    public Student clone() {
        Student studentClone = new Student(this);
        return studentClone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getEnrollYear() {
        return enrollYear;
    }

    public void setEnrollYear(int enrollYear) {
        this.enrollYear = enrollYear;
    }


}

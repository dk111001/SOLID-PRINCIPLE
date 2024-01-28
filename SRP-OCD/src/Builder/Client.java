package Builder;

public class Client {
    public static void main(String[] args){
        Student s = Student.builder()
                .setId(101)
                .setName("Deepak Kamboj")
                .setGradYear(2021)
                .setYoe(2)
                .setPsp(89.1)
                .setBatchName("Morning")
                .build();

        System.out.println(s);
    }
}

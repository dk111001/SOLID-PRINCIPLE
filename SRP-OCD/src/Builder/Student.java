package Builder;

import Builder.exceptions.InvalidGradYearException;
import Builder.exceptions.InvalidNameException;

public class Student {
    private int id;
    private String name;
    private int yoe;
    private int gradYear;
    private double psp;
    private String batchName;

    private Student(Builder b){
        id = b.id;
        name = b.name;
        yoe = b.yoe;
        gradYear = b.gradYear;
        psp = b.psp;
        batchName = b.batchName;
    }

    public static Builder builder(){
        Builder b = new Builder();
        return b;
    }

    static class Builder {
        private int id;
        private String name;
        private int yoe;
        private int gradYear;
        private double psp;
        private String batchName;

        public Builder setId(int id){
            this.id = id;
            return this;
        }

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setYoe(int yoe){
            this.yoe = yoe;
            return this;
        }

        public Builder setGradYear(int gradYear){
            this.gradYear = gradYear;
            return this;
        }

        public Builder setPsp(double psp){
            this.psp = psp;
            return this;
        }

        public Builder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        private void validate(){
            if(name == null){
                throw new InvalidNameException("Invalid student name");
            }
            if(gradYear > 2023)
                throw new InvalidGradYearException("Invalid graduation year");
        }

        public Student build(){
            this.validate();
            Student s = new Student(this);
            return s;
        }

    }
}

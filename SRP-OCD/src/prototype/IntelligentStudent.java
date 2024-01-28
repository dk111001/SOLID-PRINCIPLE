package prototype;

public class IntelligentStudent extends Student {
    private int IQ;

    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.IQ = intelligentStudent.IQ;
    }

    public IntelligentStudent(){

    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}

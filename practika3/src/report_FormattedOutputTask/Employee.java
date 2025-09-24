package report_FormattedOutputTask;

public class Employee {
    private String fullName;
    private float sallary;

    public Employee(String fullName, float sallary){
        this.fullName = fullName;
        this.sallary = sallary;
    }

    public String getFullName(){
        return this.fullName;
    }
    public float getSallary(){
        return this.sallary;
    }

    public void setSallary(float sallary){
        this.sallary = sallary;
    }
}

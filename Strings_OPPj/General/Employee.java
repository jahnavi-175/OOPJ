package General;

public class Employee {
    protected int empid;
    private String ename;
    double basic;
    public Employee(int id, String name, double b){
        empid = id;
        ename = name;
        basic = b;
    }

    public double earnings(){
        double earn = basic + basic*0.80 + basic*0.15;
        return earn;
    }

    public String getEName(){
        return ename;
    }

}

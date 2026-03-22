package Marketing;
import General.Employee;
public class Sales extends Employee{
    public Sales(int id, String name, double b) {
        super(id, name, b);
    }
    public double tallowance(){
        double ta = 0.05*earnings();
        return ta;
    }
    
}

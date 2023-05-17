package staff;

public abstract class Employee {
    protected String name;
    protected String NINO;
    protected Double salary;

    public Employee(String name, String NINO, Double salary){
        this.name = name;
        this.NINO = NINO;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getNINO() {
        return NINO;
    }

    public void raiseSalary(Double raiseAmount){
        if (raiseAmount > 0.0) {
            this.salary += raiseAmount;
        }
    }

    public Double payBonus(){
        return this.salary * 0.01;
    }
}

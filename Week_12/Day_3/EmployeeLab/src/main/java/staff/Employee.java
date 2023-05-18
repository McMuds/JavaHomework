package staff;

public abstract class Employee {
    private String name;
    private String NINO;
    private Double salary;

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

    public void setName(String name) {
        if (name != null){
            this.name = name;
        }
    }
}

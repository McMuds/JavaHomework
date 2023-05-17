package staff.management;

public class Director extends Manager {

    Double budget;

    public Director(String name, String NINO, Double salary, String deptName, Double budget) {
        super(name, NINO, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

}

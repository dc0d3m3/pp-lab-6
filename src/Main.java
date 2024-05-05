import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan Nowak", 3000.00, 1, "2023-01-01", "Technik");
        Worker worker2 = new Worker("Wiesław Paleta", 3000.00, 2, "2023-01-02", "Mechanik");
        Worker worker3 = new Worker("Ewa Zielona", 3000.00, 3, "2023-01-03", "Księgowa");
        Worker worker4 = new Worker("Ola Kowalska", 3000.00, 4, "2023-01-04", "HR");
        Manager manager = new Manager("Donald Trump", 5000.00, 5, "2023-01-05", "Dyrektor");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.getId() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
        }
    }
}
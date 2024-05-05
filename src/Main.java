import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan Nowak", 3000.00, 1, "2023-01-01", "Technik");
        Worker worker2 = new Worker("Wiesław Paleta", 3000.00, 1, "2023-01-02", "Mechanik"); // ten sam ID co worker1
        Worker worker3 = new Worker("Ewa Zielona", 3000.00, 3, "2023-01-03", "Księgowa");
        Worker worker4 = new Worker("Robert Czerwiak", 3200.00, 4, "2023-02-01", "Programista");
        Worker worker5 = new Worker("Marcin Nowak", 2800.00, 3, "2023-02-02", "HR"); // to samo ID co worker3
        Manager manager1 = new Manager("Donald Trump", 5000.00, 5, "2023-01-05", "Dyrektor"); // wiem wiem, znowu trump :) Make America Great Again :)
        Manager manager2 = new Manager("Iwona Kwiatkowska", 5100.00, 6, "2023-03-01", "Dyrektor Finansowy");
        Manager manager3 = new Manager("Anna Zawisza", 5000.00, 5, "2023-03-02", "Dyrektor HR"); // to samo ID co manager1



        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(worker5);
        employees.add(manager1);
        employees.add(manager2);
        employees.add(manager3);

        for (Employee employee : employees) {
            employee.work();
            System.out.println("- " + employee.getName() + " (ID: " + employee.getId() +
                    ", Position: " + employee.getPosition() +
                    ", Hire date: " + employee.getHireDate() +
                    ", Salary: " + employee.getSalary() + ")");
        }

        double totalSalary = 0.0;
        double totalManagerSalary = 0.0;
        double totalWorkerSalary = 0.0;

        for (Employee emp : employees) {
            totalSalary += emp.getSalary();
            if (emp instanceof Manager) {
                totalManagerSalary += emp.getSalary();
            } else if (emp instanceof Worker) {
                totalWorkerSalary += emp.getSalary();
            }
        }

        System.out.println("Całkowita suma pensji: " + totalSalary);
        System.out.println("Suma pensji Managerów: " + totalManagerSalary);
        System.out.println("Suma pensji Pracowników: " + totalWorkerSalary);

        // Wyszukiwanie duplikatów
        HashMap<Integer, HashSet<String>> duplicates = new HashMap<>();
        for (Employee emp : employees) {
            duplicates.putIfAbsent(emp.getId(), new HashSet<>());
            duplicates.get(emp.getId()).add(emp.getName());
        }

        System.out.println("Duplikaty (te same ID):");
        duplicates.forEach((id, names) -> {
            if (names.size() > 1) {
                System.out.println("ID: " + id + ", Imiona: " + names);
            }
        });
    }
}
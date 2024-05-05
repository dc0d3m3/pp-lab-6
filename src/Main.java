import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan Nowak", 3000.00, 1, "2023-01-01", "Technik");
        Worker worker2 = new Worker("Wiesław Paleta", 3000.00, 1, "2023-01-02", "Mechanik"); // ten sam ID co worker1
        Worker worker3 = new Worker("Ewa Zielona", 3000.00, 3, "2023-01-03", "Księgowa");
        Manager manager = new Manager("Donald Trump", 5000.00, 5, "2023-01-05", "Dyrektor");

        // Wyświetlenie kodów hashCode
        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        // Porównanie za pomocą equals
        System.out.println("Comparing " + worker2.getName() + " with " + worker1.getName() + ": " + worker2.equals(worker1));
        System.out.println("Comparing " + worker2.getName() + " with " + worker3.getName() + ": " + worker2.equals(worker3));
        System.out.println("Comparing " + worker2.getName() + " with " + manager.getName() + ": " + worker2.equals(manager));
    }
}
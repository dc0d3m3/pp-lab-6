import company.models.Manager;
import company.models.Worker;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan Nowak", 3000.00, 1);
        Worker worker2 = new Worker("Wiesław Paleta", 3000.00, 2);
        Worker worker3 = new Worker("Ewa Zielona", 3000.00, 3);
        Worker worker4 = new Worker("Ola Kowalska", 3000.00, 4);
        Manager manager = new Manager("Donald Trump", 5000.00, 5);

        System.out.println("Pensja: " + worker1.getSalary());
        worker1.work();
        System.out.println("Pensja: " + worker2.getSalary());
        worker2.work();
        System.out.println("Pensja: " + worker3.getSalary());
        worker3.work();
        System.out.println("Pensja: " + worker4.getSalary());
        worker4.work();
        System.out.println("Pensja: " + manager.getSalary());
        manager.work();
    }
}
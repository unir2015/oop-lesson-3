package homeWork003;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Program {

    public static void main(String[] args) {

        Worker[] workers = EmployeeFabric.generateEmployeesWorkers(15);
        for (Worker worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

         Arrays.sort(workers);


         for (Worker worker : workers) {
            worker.calculateSickLeave(worker,0);
             System.out.println(worker);
         }


        System.out.println();
        System.out.println("***");
        System.out.println("***");
        System.out.println("***");
        System.out.println();



         Freelancer[] freelancers = EmployeeFabric.generateEmployeesFreelancers(11);
         for (Freelancer freelancer : freelancers) {
             System.out.println(freelancer);
         }

        System.out.println();
        System.out.println("***");
        System.out.println();

        Arrays.sort(freelancers);

        for (Freelancer freelancer : freelancers) {
            System.out.println(freelancer);
        }


        System.out.println();
        System.out.println("***");
        System.out.println("***");
        System.out.println("***");
        System.out.println();


        Employee[] employees = EmployeeFabric.generateEmployees(20);
        for (Employee employee:employees){
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

        Arrays.sort(employees);

        for (Employee employee:employees){
            System.out.println(employee);
        }


        System.out.println();
        System.out.println("***");
        System.out.println("***");
        System.out.println("***");
        System.out.println("***");
        System.out.println("Выше сортировка которая вы показали на уроке");
        System.out.println("***");
        System.out.println("Ниже которую сам делал");
        System.out.println("***");
        System.out.println("***");
        System.out.println("***");
        System.out.println();



        Arrays.sort(workers, new AgeComparator());
        for (Worker worker : workers) {
            System.out.println(worker);
        }


        System.out.println();
        System.out.println("***");
        System.out.println("***");
        System.out.println("***");
        System.out.println();


        Arrays.sort(freelancers, new AgeComparator());

        for (Freelancer freelancer : freelancers) {
            System.out.println(freelancer);
        }


        System.out.println();
        System.out.println("***");
        System.out.println("***");
        System.out.println("***");
        System.out.println();


        Arrays.sort(employees, new AgeComparator());

        for (Employee employee:employees){
            System.out.println(employee);
        }

        System.out.println();
        System.out.println("Сколько раз хотел как есть отправит но я его победил");
    }

}

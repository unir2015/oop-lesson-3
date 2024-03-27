package homeWork003;

import java.util.Random;

public class EmployeeFabric{

    private static Random random = new Random();
//    private static Random random2 = new Random();
//    private static Random random3 = new Random();

    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int age = random.nextInt(18, 70);

        int salary = random.nextInt(60000, 120001);

        int sickLeave = random.nextInt(0, 30);

        return Worker.createFull(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                age, salary, sickLeave);
    }


    public static Worker[] generateEmployeesWorkers(int count){
        Worker[] workers = new Worker[count];
        for (int i = 0; i < count; i++){
            workers[i] = generateWorker();
        }
        return workers;
    }
 /**
      * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
      *  разных типов (Worker, Freelancer) в рамках домашней работы
      * @param count
      * @return
      */
  public static Freelancer generateFreelancer(){
    String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
    String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
    int age = random.nextInt(18, 70);

   int hour = random.nextInt(1, 7);

   int salaryHour = random.nextInt(1000, 6001);

   return Freelancer.createFreelancer(
           surnames[random.nextInt(surnames.length)],
            names[random.nextInt(names.length)],
           age, hour, salaryHour);
    }

 public static Freelancer[] generateEmployeesFreelancers(int count){
    Freelancer[] freelancers = new Freelancer[count];
     for (int i = 0; i < count; i++){
         freelancers[i] = generateFreelancer();
     }
     return freelancers;
 }

//     //ДАЛЕЕ СОЗДАНИЕ СЛУЧАЙНЫХ ФРИЛАНСЕРОВ И РАБОТНКОВ
    public static Employee[] generateEmployees(int count){
        Employee[] employees = new Employee[count];

        for (int i = 0; i < count; i++){
            int workAndFreelans = random.nextInt(2);
            if(workAndFreelans == 0){
                employees[i] = generateWorker();
            }
            else if(workAndFreelans == 1){
                employees[i] = generateFreelancer();
            }
        }
        return employees;
    }


}


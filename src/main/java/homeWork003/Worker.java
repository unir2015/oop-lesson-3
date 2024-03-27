package homeWork003;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную заработную плату)
 */
public class Worker extends Employee {

    private int sickLeave;

    private Worker(String surName, String name, int age, double salary, int sickLeave) {
        super(surName, name, age, salary);
        this.sickLeave = sickLeave;

    }

//    public static Worker create(String surName, String name, int age, double salary) {
//        if (surName == null || surName.length() < 3) {
//            throw new RuntimeException("Фамилия работника  указано некорректно.");
//        }
//        if (name == null || name.length() < 3) {
//            throw new RuntimeException("Имя работника указано некорректно.");
//        }
//        if (age < 18 || age > 70){
//            throw new RuntimeException("Возраст  работника указано не верно.");
//
//        }
//        if (salary < 0) {
//            throw new RuntimeException("Зароботная плата работника указано не верно.");
//        }
//
//
//        Worker worker = new Worker(surName, name, age, salary);
//        return worker;
//
//    }

    public static Worker createFull(String surName, String name, int age, double salary, int sickLeave) {
        if (surName == null || surName.length() < 3) {
            throw new RuntimeException("Фамилия работника  указано некорректно.");
        }
        if (name == null || name.length() < 3) {
            throw new RuntimeException("Имя работника указано некорректно.");
        }
        if (age < 18 || age > 70) {
            throw new RuntimeException("Возраст  работника указано не верно.");

        }
        if (salary < 0) {
            throw new RuntimeException("Зароботная плата работника указано не верно.");
        }
        if (sickLeave < 0) {
            throw new RuntimeException("Больничный работника указано не верно.");
        }


        return new Worker(surName, name,age, salary,sickLeave);
    }


    public double getSickLeave() {
        return sickLeave;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }


    public double getSalary() {
        return salary;
    }


    private void setSalary(double salary) {
        this.salary = salary;
    }

    public void calculateSickLeave(Worker worker, int sickLeave) {// для подсчета и записьи больничных
        if (worker.getSickLeave() == 0 & sickLeave == 0) {
            System.out.println("работник не болел ");
        } else {
            if (this.sickLeave != 0) {
                double daySalary = worker.getSalary() / 30;
                double daySickLeave = daySalary / 2;
                double res = daySickLeave * worker.getSickLeave();
                worker.setSalary(worker.getSalary() - res);
                System.out.println("Запись Больничного произведена успешно");
            } else {
                double daySalary = worker.getSalary() / 30;
                double daySickLeave = daySalary / 2;
                double res = daySickLeave * sickLeave;
                worker.setSalary(worker.getSalary() - res);
                System.out.println("Запись Больничного произведена успешно");


            }
        }
    }
    @Override
    public double calculateSalary() {
        return salary;
    }

        @Override
        public String toString () {
            return String.format("%s %s; возраст: %d; заработная плата: %.2f руб; больничные дни: %d.",
                    surName, name, age, salary, sickLeave);


        }

}
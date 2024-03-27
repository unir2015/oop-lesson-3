package homeWork003;

/**
 * Фрилансер (работник с почасовой оплатой)
 * TODO: Доработать в рамках домашней работы
 */
public class Freelancer extends Employee {
    double hour;
    double salaryHour;


    private Freelancer(String surName, String name, int age, double hour, double salaryHour){
        super(surName, name, age);
        this.hour = hour;
        this.salaryHour = salaryHour;
    }

    public static Freelancer createFreelancer(String surName, String name, int age, double hour, double salaryHour) {

        if (surName == null || surName.length() < 3) {
            throw new RuntimeException("Фамилия фрилансера  указано некорректно.");
        }
        if (name == null || name.length() < 3) {
            throw new RuntimeException("Имя фрилансера  указано некорректно.");
        }
        if (age < 18 || age > 70){
            throw new RuntimeException("Возраст фрилансера указано не верно.");

        }
        if (hour < 0){
            throw new RuntimeException("Количество часов фрилансера указано не верно.");
        }
        if (salaryHour < 0){
            throw new RuntimeException("Ставка в час фрилансера указано не верно.");
        }

        return new Freelancer(surName, name, age, hour, salaryHour);

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

    @Override
    public double calculateSalary() {
        return salaryHour;
    }

    public double getSalary() {
        return salary;
    }
    public double getSalaryHour() {
        return salaryHour;
    }
    public double getHour() {
        return hour;
    }




    public double calculateSalaryFreelancer(){
        double res = salaryHour * hour;

        return res;


    }
    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d; отработано часов: %.2f; ставка: %.2f руб.час.;  заработная плата: %.2f руб.",
                surName, name, age,  hour, salaryHour, calculateSalaryFreelancer());
    }



}

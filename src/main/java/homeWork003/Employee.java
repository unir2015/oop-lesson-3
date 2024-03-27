package homeWork003;

public abstract class Employee implements Comparable<Employee> {

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }




    /**
     * Имя
     */
    protected String name;



    /**
     * Фамилия
     */
    protected String surName;


    /**
     * Ставка заработной платы
     */
    protected double salary;

    // Возраст работника
    protected int age;




    private void processName(String name){
        this.name = name;
    }
    private void processSurName(String surName){
        this.surName = surName;
    }
    private void processSalary(double salary){
        this.salary = salary;
    }
    private void processAge(int age){
        this.age = age;
    }




    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }
    public double getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }



    /**
     * Расчет среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract double calculateSalary();

    protected Employee(String surName, String name, int age, double salary) {

        processSurName(surName);
        processName(name);
        processAge(age);
        processSalary(salary);

    }
    protected Employee(String surName, String name, int age) {

        processSurName(surName);
        processName(name);
        processAge(age);
    }
    public String toString() {
        return String.format("%s %s; возраст: %d; заработная плата: %.2f руб. %.2f",
                surName, name, age, salary, calculateSalary());
    }



}

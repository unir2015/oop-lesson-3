package homeWork003;

import java.util.Comparator;

public class AgeComparator implements Comparator<Employee> {

    public AgeComparator(){

    }
        @Override
        public int compare (Employee o1, Employee o2){
            return Double.compare(o2.getAge(), o1.getAge());
        }

}

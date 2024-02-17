import com.hm1.inheritance.DriverForInheritance;
import com.hm1.polymorphism.DriverForPolymorphism;
import com.hm1.aggregation.DriverForAggregation;
import com.hm1.composition.DriverForComposition;


public class Main {
    public static void main(String[] args) {

        DriverForInheritance driver = new DriverForInheritance();
        driver.print();

        DriverForPolymorphism.run();
        DriverForAggregation.run();
        DriverForComposition.run();

    }
}
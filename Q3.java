import java.util.Comparator;
import java.util.Arrays;
public class Q3 {
    public static void main(String[] args) {
        Comparator<Car> sortCar = Comparator
            .comparing(Car::getManufacturer)
            .thenComparingInt(Car::getAge);

        Car car1 = new Car();
        car1.setManufacturer("Audi");
        car1.setAge(5);

        
        Car car2 = new Car();
        car2.setManufacturer("BMW");
        car2.setAge(2);

        Car car3 = new Car();
        car3.setManufacturer("Audi");
        car3.setAge(3);
        Car[] carList = new Car[] {car1, car2, car3};
        Arrays.sort(carList, sortCar);

        for (Car car : carList) {
            System.out.println(car.getManufacturer() + " " + car.getAge());
        }
    }
}


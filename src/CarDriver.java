/**
 * @Author:SheaSalloum
 * @Date:December
 * purpose: Use Static and equals
 */
public class CarDriver {
    public static void main(String[] args) {

        System.out.println("Number of cars" + NewCar.getCount());
        NewCar myCar = new NewCar();
        NewCar hisCar = new NewCar("Black, ", 400 ,3.5 ," Honda ");
        NewCar herCar = new NewCar("Pink ",  300 ,2.5 ," Volks ");

        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);

        myCar.setColor("Blue");myCar.setHorsePower(650);myCar.setEngineSize(6.5);myCar.setMake("Ferrari");
        myCar.setColor("Blue");hisCar.setHorsePower(650);hisCar.setEngineSize(6.5);hisCar.setMake("Ferrari");
        myCar.setColor("Blue");herCar.setHorsePower(650);herCar.setEngineSize(6.5);herCar.setMake("Ferrari");

        System.out.println("My Car " + myCar.getColor()+ " " + myCar.getHorsePower()+" "+myCar.getEngineSize()+" "+myCar.getMake());
        System.out.println("His Car" + hisCar.getColor()+" "+ hisCar.getHorsePower()+ " "+hisCar.getEngineSize()+" "+ hisCar.getMake());
        System.out.println("Her Car" + herCar.getColor()+" "+herCar.getHorsePower()+" "+herCar.getEngineSize()+" "+ herCar.getMake());
        System.out.println("Number of Cars: "+ NewCar.getCount());


    }
}
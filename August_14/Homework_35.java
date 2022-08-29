package August_14;
public class Homework_35 {

//Write a Car Class where it has following attributes:
//1) Model
//2) Year
//3) Speed
//and following method:
//1) SetAttributes()-  Where it takes String Model, int Year and double speed to set all the instance attribute.
//2) PrintCar() - Where it prints each objects attributes
//3) IncreaseSpeed() - Where it takes double values and it increase the Speed attribute by input amount
//4) DecreaseSpeed() - Where it takes double values and it decrease the Speed attribute by input amount
//
//Create 4 instance of Car Class, after Setting the Attribute values, Apply increaseSpeed and DecreaseSpeed
// Multiple times for different values. For those which has speed of 80 or more,
// Print warning such as "Car "Model" and"Speed" is danger of getting ticket"

    String Model;
    int Year;
    double Speed;

    public void SetAttributes(String mdl,int yr,double spd){
        Model=mdl;
        Year=yr;
        Speed=spd;
    }
    public void Printcar(){
        System.out.println("Model of the car is: "+Model);
        System.out.println("Year of the car is: "+Year);
        System.out.println("Speed of the car is: "+Speed);
    }
    public double InceraseSpeed(double addspeed){
        Speed=Speed+addspeed;
        return Speed;
    }
    public double DecreaseSpeed(double minspeed) {
        Speed = Speed - minspeed;
        return Speed;
    }

    public static void main(String[] args) {
        Car Car0=new Car();
        Car0.SetAttributes("BMW",2022,60.6);

        Car Car1=new Car();
        Car1.SetAttributes("Mercedes",2003,90.3);

        Car Car2=new Car();
        Car2.SetAttributes("Audi",2020,70.6);

        Car Car3=new Car();
        Car3.SetAttributes("Passat",2019,50.9);

        Car0.DecreaseSpeed(10);
        Car1.InceraseSpeed(21.5);
        Car2.InceraseSpeed(24.4);
        Car3.DecreaseSpeed(3.5);
        Car0.InceraseSpeed(35.78);
        Car1.DecreaseSpeed(1.78);
        Car1.InceraseSpeed(24.5);
        Car2.DecreaseSpeed(40.5);
        Car3.InceraseSpeed(70.1);

        ArrayList<Car> cars=new ArrayList();
        cars.addAll(Arrays.asList(Car0,Car1,Car2,Car3));
        for (int i = 0; i <cars.size() ; i++) {
            if (cars.get(i).Speed>=80){
                System.out.println("\nThis car is danger of getting ticket.Vehicle information is writtem below:");
                cars.get(i).Printcar();
            }
        }
    }
}
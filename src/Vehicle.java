public class Vehicle {
    protected int speed;
    protected String model;
    public Vehicle(int speed, String model){
        this.speed= speed;
        this.model= model;
    }
    public void desplayInfo(){
        System.out.println("The car speed is " + speed);
        System.out.println("Model :" + model + ",Speed :" + speed + "Houre km");
    }
}

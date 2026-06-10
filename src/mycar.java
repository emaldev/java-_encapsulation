public class mycar extends Vehicle{

        public mycar(int speed, String model) {


            super(speed, model);
        }
        public static void main(String[] args){
            mycar car = new mycar(120, "Toyota");
            car.desplayInfo();
        }

}

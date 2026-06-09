public class product {
    private String name;
    private double price;

    public product(String name ){
        this.name = name;
        this.price = 0.0;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
              this.price = price;
    }
    public void displayInfo(){
        System.out.println("Product:" + name + ",Price :" + price);
    }

}

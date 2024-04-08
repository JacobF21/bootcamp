public class Car {

    // Attributes
    private String color; //"Red", "Yellow"
    private double speed; 
    private int capacity;
    private boolean overSpeed; // useless,we should use speed to derive isOverSpeed()

    // ...

    // Behavior or instance method
    //Setter
    public void setColor(String x){
        this.color=x;
    }

    public void setSpeed(double speed){
        this.speed = speed;
        if(speed >90){
            this.overSpeed = true;
        }
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    //Getter
    public String getColor(){
        return this.color;
    }

    public double getSpeed(){
        return this.speed;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public boolean isOverSpeed(){
        return this.overSpeed;
    }

    public String toString(){
        return "Car("//
            +"color="+this.color//
            +", speed="+this.speed//
            +", capacity"+this.capacity//
            +")";
    }



    public static void main(String[] args) {
        Car c = new Car();// c-> object reference
        c.setColor("RED");
        c.setSpeed(99);
        c.setCapacity(2);
        System.out.println("color="+c.getColor());
        System.out.println("speed="+c.getSpeed());
        System.out.println("capacity="+c.getCapacity());
        System.out.println(c.isOverSpeed());

        Car c2 = new Car();
        c2.setColor("SILVER");
        c2.setSpeed(35.5);
        c2.setCapacity(4);
        System.out.println("color="+c2.getColor());
        System.out.println("speed"+c2.getSpeed());
        System.out.println("capacity"+c2.getCapacity());
    }

}

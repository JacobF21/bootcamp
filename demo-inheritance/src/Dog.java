public class Dog extends Animal {
    private Color color;

    public void setColor(Color color){
      this.color = color;
    }

    public Color getColor(){
      return this.color;
    }

    public static void main(String[] args) {
      Dog dog =new Dog();
      dog.setColor(Color.BLACK);
      dog.setName("Sally");
      System.out.println(dog.getName());
      System.out.println(dog.getColor());
    }
}
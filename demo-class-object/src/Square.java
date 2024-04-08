public class Square {
    private int length;

    //setter
    public void setLength(int length){
      this.length= length;
    }

    //getter
    public int getLength(){
      return this.length;
    }

    public int area(){
      return this.length*this.length;//Math.pow(this.length,2);
    }

    public String toString(){
      return "Square(length="+length+")" ;
    }

    public static void main(String[] args) {
      Square square = new Square();
      square.setLength(13);
      System.out.println(square.toString());
      System.out.println(square.area());
    }
}

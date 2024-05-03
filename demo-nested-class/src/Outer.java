public class Outer {
    private int x=10;
    private static int y =100;

    public static int getY(){
        return y;
    }

    public int getX(){
        return x;
    }

    public void print(){
        class LocalInner{ // 2b. Local Inner Class
            int x;
            LocalInner(int x){
                this.x=x;
            }
            void print(){
                System.out.println("hello3" +this.x);
            }
        }
        LocalInner li = new LocalInner(20);
        li.print();
    }

    private static class StaticNested { // static
        void print(){
            System.out.println("hello");
        }
    }

    private class Inner {
        private int x=20;
        void print(){
            System.out.println("hello2");
            System.out.println("hello2" + x);
            System.out.println("hello2" + y);
            System.out.println("hello2" + this.x);

        }
    }

    public static void main(String[] args){
        Outer outer =new Outer();
        //System.out.println(outer.x);
        //System.out.println(Outer.y);
        //System.out.println(getY());
        Outer.StaticNested o2 = new Outer.StaticNested();
        //o2.print();

        //Outer o3 = new Outer();
        Outer.Inner o4 =new Outer().new Inner();
        o4.print();
        //o4.getX();

        Outer o6 = new Outer();
        //o6.print(); 

        //before Java 8(before lambda)
        Drivable vincent = new Drivable() {
            @Override
            public void drive(){
                System.out.println("driving");
            }
            public void abc(){
                System.out.println("abc");
            }
        };

        vincent.drive();
        vincent.abc();
    }
}

/**
 * Implement one more Interface Cooker
 */
/**
 * Expected Output:
 * I can drive.
 * I can cook.
 */
interface Driver {
    public void drive(); // interface method
}

// Program an interface Cooker with cook method
interface Cooker {
    public void drive(); // interface method
}

class Father implements Driver, Cooker {
    @Override
    public void drive() {
        System.out.println("I can drive.");
    }

    public void cook() {
        System.out.println("I can cook.");
    }

}

class Exercise20 {
    public static void main(String[] args) throws Exception {
        Father father = new Father();
        father.drive();
        father.cook();
    }
}

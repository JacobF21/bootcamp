enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    int value;

    Level(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public static void showValues(){
        for(Level myVar:Level.values()){
            System.out.println(myVar.name());
        }
    }

}

/**
 * Expected Output:
 * This is Medium level
 * enum is MEDIUM, and its value is 2
 */
public class Exercise17 {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
        //Level.showValues();
        // Write a switch statement to print the expected output.
        
        switch (myVar) {
            case LOW:
                System.out.println("This is "+ Level.LOW+ " Level");
                System.out.println("enum is "+ Level.LOW+ ", and its value is "+Level.LOW.getValue());
                break;
            case MEDIUM:
                System.out.println("This is "+ Level.MEDIUM+ " Level");
                System.out.println("enum is "+ Level.MEDIUM+ ", and its value is "+Level.MEDIUM.getValue());
                break;
            case HIGH:
                System.out.println("This is "+ Level.HIGH+ " Level");
                System.out.println("enum is "+ Level.HIGH+ ", and its value is "+Level.HIGH.getValue());
                break;
            default:
                System.out.println("-1");
                break;
        }
        

    }
}
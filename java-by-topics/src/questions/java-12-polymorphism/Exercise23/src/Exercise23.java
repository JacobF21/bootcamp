/**
 * Start Machine: MachineA
 * Stop Machine: MachineA
 * Start Computer: ComputerB
 * Start Computer: ComputerB
 */
class Machine {
    String name;

    public Machine(String name) {
        this.name = name;
    }

    public void start() {
        System.out.println("Start Machine: " + this.name);
    }

    public void stop() {
        System.out.println("Stop Machine: " + this.name);
    }
}

class Computer extends Machine {

    // Implement Constructor
    public Computer(String name){
        super(name);
    }

    // Implement start() method
    public void start() {
        System.out.println("Start Computer: " + this.name);
    }

    // Implement stop() method
    public void stop() {
        System.out.println("Stop Computer: " + this.name);
    }

    // Implement restart()
    public void restart() {
        System.out.println("Restart Computer: " + this.name);
    }
}

class Exercise23 {
    public static void main(String[] args) {
        Machine myMachine = new Machine("MachineA");
        myMachine.start();
        myMachine.stop();

        // During the runtime, JVM know which start() method will be called
        // Why it takes advantages using Machine for type declaration
        Machine computer = new Computer("ComputerB");
        computer.start();
        computer.stop();
        //computer.restart(); // why this method call will cause compile error?
        
        //Ans:
        /*Coz computer declared with the type Machine and 
        /*the Class Machine did not include the restart method
        */

        Computer computer2 = new Computer("ComputerC");
        computer2.restart(); // this is fine, why?
        
        //Ans:
        /*Coz computer2 declared with the type Computer and 
        /*the Class Computer did include the restart method
        */
    }
}
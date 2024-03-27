public class App {
    public static void main(String[] args) throws Exception {
        int x = -1;
        int y;
        if (x > 3) {
            y = 10;
            System.out.println("Hello, World!" + y);
        } else {
            y = 100;
            System.out.println("Jacob" + y);
        }

        boolean result = x > 2;
        System.out.println(result);

        if (x > 2) {
            System.out.println("x > 2");
        } else if (x >= 0 && x <= 2) {
            System.out.println("x >= 0 && x <= 2");
        } else {
            System.out.println("x < 0");
        }

        int a = 12;
        int b = 19;
        int max = 0;
        if (a > b) {
            max = b;
            System.out.println("The max number is" + max + ".");
        } else {
            max = b;
            System.out.println("The max number is" + max + ".");
        }

        int c = 12;
        int d = 20;
        int max2 = c;
        if (d > c) {
            max2 = d;
            System.out.println("The max number is" + max2 + ".");
        }

        // Example 2
        String day = "Monday";// Monday, Tuesday
        String target = "weekend";
        // Print out: It is a weekday
        if ("Sunday".equals(day) || "Saturday".equals(day)) {
            System.out.println(day + " is a weekend");
        } else {
            System.out.println(day + " is a weekday");
        }

        if ("Monday".equals(day) || "Tuesday".equals(day)
                || "Wednesday".equals(day) || "Thursday".equals(day)
                || "Friday".equals(day)) {
            target = "weekday";
        }
        System.out.println(day + " is a " + target);

        // Compare String
        // 1. String value compare with String Variable ("Monday".equals(day))
        // 2. Sting variable comapare with String Variable

        // Example3
        int score = 61;
        char grade = 'B';
        String passOrNot = "passed";
        // score > 90 ->A
        // 80 - 90 -> B
        // 70-79 -> C
        // <70 -> F
        // Print out: "The grade is B and passed"
        // && score <=90 is not necessary, coz the program need to check 2 condition to peform the task
        if (score > 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else {
            grade = 'F';
            passOrNot = "failed";
        }
        System.out.println("The grade is " + grade + " " + passOrNot + ".");

    }
}

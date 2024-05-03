public class App {
    public static void main(String[] args){
        Weekday day = Weekday.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("TUESDAY");
                break;
            case WEDNESDAY:
                System.out.println("WEDNESDAY");
                break;
            case THURSDAY:
                System.out.println("THURSDAY");
                break;
            case FRIDAY:
                System.out.println("FRIDAY");
                break;
            //Missing Saturday handling (Syntax ok)
            default:
                break;
        }

        //After Java14
        //- Compile-time -> cross checking (missing enum value or duplicated enum value)
        int value = switch(day){
            case MONDAY, TUESDAY, THURSDAY -> 3;
            case WEDNESDAY, FRIDAY ->2;
            case SUNDAY ->1;
            default -> 5;
        };
        System.out.println(value);

    }
}

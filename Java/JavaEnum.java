package Java;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class JavaEnum {
    public static void main(String[] args) {
        // Accessing enum values
        Day today = Day.MONDAY;
        
        // Using enum in a switch statement
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("End of the week!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Midweek!");
                break;
        }
    }
}

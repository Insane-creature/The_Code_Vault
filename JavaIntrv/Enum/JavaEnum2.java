enum Day {
    MONDAY("Start of work week"),
    TUESDAY("Second day of the week"),
    WEDNESDAY("Midweek"),
    THURSDAY("Almost weekend"),
    FRIDAY("End of work week"),
    SATURDAY("Weekend! Relax!"),
    SUNDAY("Weekend! Prepare for next week");

    private final String description; // Field for additional info
    
    // Constructor to set the description
    Day(String description) {
        this.description = description;
    }
    // Getter method for the description
    public String getDescription() {
        return this.description;
    }
        

}

public class JavaEnum2 {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is " + today + ": " + today.getDescription());
        
    }
}

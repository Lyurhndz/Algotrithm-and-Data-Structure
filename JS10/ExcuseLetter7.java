public class ExcuseLetter7 {
    String id;
    String name;
    String className;
    char typeOfExcuse;  // 'S' for Sick, 'I' for Other reasons
    int duration;       // Duration in days

    // Default constructor
    public ExcuseLetter7() {
        this.id = "";
        this.name = "";
        this.className = "";
        this.typeOfExcuse = ' ';
        this.duration = 0;
    }

    // Parameterized constructor
    public ExcuseLetter7(String id, String name, String className, char type, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = type;
        this.duration = duration;
    }
}

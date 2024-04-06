public class Class {
    private int id;
    private String name;
    private int numberOfStudent;

    public Class(int id, String name) {
        this.id = id;
        this.name = name;
        this.numberOfStudent = 0;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }
    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    public void setNumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public void increaseNumberOfStudent() {
        this.numberOfStudent++;
    }

    public void decreaseNumberOfStudent() {
        this.numberOfStudent--;
    }

    // CRUD operations for Classs
    // You can implement CRUD operations as needed
}

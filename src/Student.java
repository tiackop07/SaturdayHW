public class Student {
    private int id;
    private String name;
    private double score;
    private Class classId; // Class ID instead of reference to Classs object

    public Student(int id, String name, double score, Class classId) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.classId = classId;
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

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Class getClassId() {
        return classId;
    }

    public void setClassId(Class classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", classId=" + classId +
                '}';
    }
}

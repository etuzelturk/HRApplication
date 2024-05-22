public class Employee {

    private String name;
    private Integer id;
    private String position;

    public Employee(Integer id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return ("Id: " + id + ", Name: " + name + ", Position: " + position);
    }
}

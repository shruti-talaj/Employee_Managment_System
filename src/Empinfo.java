public class studentinfo {
    private final int id;
    private final String name;
    private final String add;
    private final int phone;
    private final String email;
    private final int salary;
    private final int dept;


    public studentinfo(int id, String name, String add, int phone, String email, int salary, int dept) {
        this.id =id;
        this.name=name;
        this.add =add;
        this.phone =phone;
        this.email =email;
        this.salary =salary;
        this.dept =dept;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public int getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getSalary() {
        return salary;
    }

    public int getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", dept=" + dept +
                '}';
    }
}

package advancesortingdemo;
/**
 *
 * @author SHAMIM
 */
public class Student {
    private String name;
    private double cgpa;
    private String email;

    public Student(String name, double cgpa, String email) {
        this.name = name;
        this.cgpa = cgpa;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", cgpa=" + cgpa + ", email=" + email + '}';
    }
    
}

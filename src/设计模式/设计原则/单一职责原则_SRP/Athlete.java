package 设计模式.设计原则.单一职责原则_SRP;

// Athlete类（运动员）的代码如下：
public class Athlete {
    private String name;
    private int age;
    private String nationality;

    public Athlete(String name, int age, String nationally) {
        this.name = name;
        this.age = age;
        this.nationality = nationally;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
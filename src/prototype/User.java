package prototype;

public class User implements Prototype {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor (important)
    private User(User other) {
        this.name = other.name;
        this.age = other.age;
    }

    @Override
    public Prototype clone() {
        return new User(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " - " + age;
    }
}
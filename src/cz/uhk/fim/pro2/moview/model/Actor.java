package cz.uhk.fim.pro2.moview.model;

public class Actor {

    private String fullName;

    public Actor(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "fullName='" + fullName + '\'' +
                '}';
    }
}

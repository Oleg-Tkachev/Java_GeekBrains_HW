package src;
public class Human {
    private String name;
    private String gender;
    private boolean liveStatus;


    public Human(String name, String gender, boolean liveStatus) {
        this.name = name;
        this.gender = gender;
        this.liveStatus = liveStatus;

    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return gender;
    }

    public boolean isLiveStatus() {
        return liveStatus;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", liveStatus=" + liveStatus +
                '}';
    }
}
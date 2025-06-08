package utils;

public class UserRequest {

    private final String name;
    private final String job;

    public UserRequest(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }
}

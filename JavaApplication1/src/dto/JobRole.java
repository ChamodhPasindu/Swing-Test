package dto;

public class JobRole {
    private int jobID;
    private String role;

    public JobRole(int jobID, String role) {
        this.jobID = jobID;
        this.role = role;
    }

    public JobRole() {
    }

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

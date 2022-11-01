package dto;

public class Employee {
    String nic;
    String name;
    String phone;
    String email;
    String address;
    String jobRole;

    public Employee() {
    }

    public Employee(String name, String phone, String email, String address, String jobRole) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.jobRole = jobRole;
    }

    public Employee(String nic, String name, String phone, String email, String address, String jobRole) {
        this.nic = nic;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.jobRole = jobRole;
    }


    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nic='" + nic + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", jobRole='" + jobRole + '\'' +
                '}';
    }
}

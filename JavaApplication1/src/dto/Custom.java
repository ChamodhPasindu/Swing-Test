package dto;

public class Custom {
    private String empId;
    private String nic;
    private String name;
    private int otHours;
    private int otRate;
    private String date;
    private double total;
    private double basic;

    public Custom(String empId, String nic, String name, int otHours, int otRate, String date, double total, double basic) {
        this.empId = empId;
        this.nic = nic;
        this.name = name;
        this.otHours = otHours;
        this.otRate = otRate;
        this.date = date;
        this.total = total;
        this.basic = basic;
    }

    public Custom(String nic, String name, int otHours, int otRate, String date, double total) {
        this.nic = nic;
        this.name = name;
        this.otHours = otHours;
        this.otRate = otRate;
        this.date = date;
        this.total = total;
    }

    public Custom() {
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
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

    public int getOtHours() {
        return otHours;
    }

    public void setOtHours(int otHours) {
        this.otHours = otHours;
    }

    public int getOtRate() {
        return otRate;
    }

    public void setOtRate(int otRate) {
        this.otRate = otRate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}

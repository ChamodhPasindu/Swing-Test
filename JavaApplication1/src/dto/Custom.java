package dto;

public class Custom {
    private String nic;
    private String name;
    private int otHours;
    private int otRate;
    private String date;
    private double total;

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

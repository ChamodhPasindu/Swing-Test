package dto;

public class Salary {
    private int otHours;
    private int otRate;
    private String date;
    private double basic;
    private double total;

    public Salary(int otHours, int otRate, String date, double basic, double total) {
        this.otHours = otHours;
        this.otRate = otRate;
        this.date = date;
        this.basic = basic;
        this.total = total;
    }

    public Salary() {
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getBasic() {
        return basic;
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

    @Override
    public String toString() {
        return "Salary{" +
                "otHours=" + otHours +
                ", otRate=" + otRate +
                ", date='" + date + '\'' +
                ", basic=" + basic +
                ", total=" + total +
                '}';
    }
}

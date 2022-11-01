package repo;

import db.DbConnection;
import dto.Custom;
import dto.Employee;
import dto.Salary;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo {

    public boolean addEmployee(Employee employee) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String query="INSERT INTO employee (nic,name,phone,email,address,jobRole) VALUES (?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(query);
        stm.setObject(1,employee.getNic());
        stm.setObject(2,employee.getName());
        stm.setObject(3,employee.getPhone());
        stm.setObject(4,employee.getEmail());
        stm.setObject(5,employee.getAddress());
        stm.setObject(6,employee.getJobRole());
        return stm.executeUpdate()>0;
    }

    public List<Employee> searchEmployeeById(int id) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String query="SELECT e.name,j.basic FROM employee e JOIN jobRole j ON e.jobRole=j.jobRole WHERE e.empId=?";
        PreparedStatement stm = connection.prepareStatement(query);
        stm.setObject(1,id);
        ResultSet resultSet = stm.executeQuery();
        List<Employee>employees = new ArrayList();
        while (resultSet.next()){
            employees.add(new Employee(
                    resultSet.getString(1),
                    resultSet.getDouble(2)
                    )
            );
        }
        return employees;
    }

    public List<Employee> searchEmployeeDetailsById(int id) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String query="SELECT * FROM employee WHERE empID=?";
        PreparedStatement stm = connection.prepareStatement(query);
        stm.setObject(1,id);
        ResultSet resultSet = stm.executeQuery();
        List<Employee>employees = new ArrayList();
        while (resultSet.next()){
            employees.add(new Employee(
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getString(5),
                            resultSet.getString(6),
                            resultSet.getString(7)
                    )
            );
        }
        return employees;
    }

    public boolean addEmployeeSalary(Salary salary,int id) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String query="INSERT INTO salary (empID,otHours,otRate,date,total) VALUES (?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(query);
        stm.setObject(1,id);
        stm.setObject(2,salary.getOtHours());
        stm.setObject(3,salary.getOtRate());
        stm.setObject(4,salary.getDate());
        stm.setObject(5,salary.getTotal());
        return stm.executeUpdate()>0;
    }

    public boolean deleteEmployee(int id) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String query="DELETE FROM employee WHERE empID=?";
        PreparedStatement stm = connection.prepareStatement(query);
        stm.setObject(1,id);
        return stm.executeUpdate()>0;
    }

    public boolean updateEmployeeRecord(Employee employee,int id) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String query="UPDATE employee SET name=?,phone=?,email=?,address=?,jobRole=? WHERE empID=?";
        PreparedStatement stm = connection.prepareStatement(query);
        stm.setObject(1,employee.getName());
        stm.setObject(2,employee.getPhone());
        stm.setObject(3,employee.getEmail());
        stm.setObject(4,employee.getAddress());
        stm.setObject(5,employee.getJobRole());
        stm.setObject(6,id);
        return stm.executeUpdate()>0;
    }

    public List<Employee> getAllEmployee() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String query="SELECT * FROM employee";
        PreparedStatement stm = connection.prepareStatement(query);
        ResultSet resultSet = stm.executeQuery();
        ArrayList<Employee> employees = new ArrayList<>();
        while (resultSet.next()){
            employees.add(new Employee(
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5),
                    resultSet.getString(6),
                    resultSet.getString(7)
            ));
        }
        return employees;
    }

    public List<Custom> getAllSalaryDetail() throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String sql="SELECT e.nic,e.name,s.otHours,s.otRate,s.date,s.total FROM employee e INNER JOIN salary s ON e.empID=s.empId ";
        PreparedStatement stm = connection.prepareStatement(sql);
        ResultSet resultSet = stm.executeQuery();
        ArrayList<Custom> customs = new ArrayList<>();
        while (resultSet.next()){
            customs.add(new Custom(
                    resultSet.getString(1),
                    resultSet.getString(2),
                    resultSet.getInt(3),
                    resultSet.getInt(4),
                    resultSet.getString(5),
                    resultSet.getDouble(6)
            ));
        }
        return customs;
    }

    public Salary getSalaryById(int id) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String sql="SELECT * FROM salary WHERE empID=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1,id);
        ResultSet resultSet = stm.executeQuery();
        while (resultSet.next()){
            return new Salary(
                   resultSet.getInt(3),
                   resultSet.getInt(4),
                   resultSet.getString(5),
                   resultSet.getDouble(6)
            );
        }
        return null;
    }

    public boolean updateSalary(Salary salary,int id) throws SQLException {
        Connection connection = DbConnection.getInstance().getConnection();
        String sql="UPDATE salary SET otHours=?,otRate=?,date=?,total=? WHERE empID=?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setObject(1,salary.getOtHours());
        stm.setObject(2,salary.getOtRate());
        stm.setObject(3,salary.getDate());
        stm.setObject(4,salary.getTotal());
        stm.setObject(5,id);
        return stm.executeUpdate()>0;
    }

}

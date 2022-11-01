package utill;

import dto.Employee;
import dto.Salary;

import java.util.regex.Pattern;

public class Validation {

    public static String checkEmployeeInputs(Employee employee){
        String email="^[a-z0-9]{4,20}[@][a-z]{3,6}(.com|.lk)$";
        String mobile="^(07)(1|2|5|6|7|8)(-?)[0-9]{7}$";
        String nic="^[0-9]{12}\\b|[0-9]{10}[V]$";
        String name="^[A-z\\.\\s]{3,50}$";
        String address="^[A-z0-9\\,\\/\\-\\s\\.]{5,}$";

        if (Pattern.matches(name,employee.getName())){
            if (Pattern.matches(nic,employee.getNic())){
                if (Pattern.matches(mobile,employee.getPhone())){
                    if (Pattern.matches(email,employee.getEmail())){
                        if (Pattern.matches(address,employee.getAddress())){
                            return "Done";
                        }else {
                            return "Address";
                        }
                    }else {
                        return "Email";
                    }
                }else {
                    return "Number";
                }
            }else {
                return "NIC";
            }
        }else {
            return "Name";
        }
    }

    public static String checkSalaryInputs(Salary salary){
        String basic="[0-9][0-9]*([.][0-9]{1,2})?$";
        String otHours="^[0-9]{1,2}$";
        String otRate="[0-9][0-9]*([.][0-9]{1,2})?$";
        String total="[0-9][0-9]*([.][0-9]{1,2})?$";

        if (!salary.getDate().isEmpty()){
                if (Pattern.matches(otHours,String.valueOf(salary.getOtHours()))){
                    if (Pattern.matches(otRate,String.valueOf(salary.getOtRate()))){
                        if (Pattern.matches(total,String.valueOf(salary.getTotal()))){
                            return "Done";
                        }else {
                            return "Total Salary";
                        }
                    }else {
                        return "OT Rate";
                    }
                }else {
                    return "OT Hours";
                }
        }else {
            return "Date";
        }

    }


}

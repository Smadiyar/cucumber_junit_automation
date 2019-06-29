package Test;

import utilities.jdbcUtils;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class jdbcTest {

    public static void main(String[] args) throws SQLException {

        jdbcUtils.establishConnection();
       String salaryFirtsYmployee=jdbcUtils.runSQLQuery("Select * from employees").get(0).get("SALARY").toString();
        System.out.println(salaryFirtsYmployee);


        String employeeFirstName=jdbcUtils.runSQLQuery("select first_name from employees").get(0).get("FIRST_NAME").toString();
        System.out.println(employeeFirstName);

        System.out.println(jdbcUtils.rowCount("select * from employees"));

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //print all names from employees table

        List<Map<String,Object>> tableWithFirstNames=jdbcUtils.runSQLQuery("select * from employees");

        for(int i=0; i<tableWithFirstNames.size(); i++){
            System.out.print(tableWithFirstNames.get(i).get("FIRST_NAME"));
            System.out.println("  "+ tableWithFirstNames.get(i).get("LAST_NAME"));

        }


        jdbcUtils.closeConnections();

    }

}

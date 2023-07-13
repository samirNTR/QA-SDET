package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnection {

    // JDBC driver and database URL
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/employeesdb1";

    // Database credentials
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "12welcome";

    public static void main(String[] args)
    {
        Connection connection = null;
        Statement statement = null;
        try {
            // Step 1: Register JDBC Driver //instruct the Java runtime to load and initialize the driver class
            Class.forName(JDBC_DRIVER);

            // Step 2: Open a connection
            System.out.println("Connecting to database...");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // Step 3: Execute a query
            System.out.println("Creating statement...");
            statement = connection.createStatement();
            String sql = "SELECT e.first_name, e.last_name, e.salary\r\n"
            		+ "FROM employees e\r\n"
            		+ "INNER JOIN employees m ON e.manager_id = m.employee_id\r\n"
            		+ "INNER JOIN departments d ON e.department = d.department_name\r\n"
            		+ "WHERE e.salary > m.salary;";
            ResultSet resultSet = statement.executeQuery(sql);

            while(resultSet.next())
            {
            	String firstname=resultSet.getString("first_name");
            	String lastname=resultSet.getString("last_name");
            	Double salary=resultSet.getDouble("salary");

            	System.out.print(firstname);

            	System.out.print(" "+lastname);
            	System.out.println(" "+salary);

            }

            //Step 4:-close the connection
            connection.close();

        }
catch(Exception e)
        {
	 e.printStackTrace();

        }
    }}

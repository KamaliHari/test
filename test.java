import java.sql.*;
public class test {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3307/jdbcdemo";
        String username="root";
        String password="";
    

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection= DriverManager.getConnection(url,username,password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from student");

            while(resultSet.next()){
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
      
    } 
    System.out.println("hi");
}
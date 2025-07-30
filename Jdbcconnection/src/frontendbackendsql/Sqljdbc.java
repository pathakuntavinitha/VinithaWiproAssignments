package frontendbackendsql;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;


public class Sqljdbc {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wipro","root","Vinitha@123");
			Statement sta=con.createStatement();
			ResultSet rs=sta.executeQuery("select * from employees");
			)
		{
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3)+" "+rs.getString(4));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Done");
		}
		
	}

}

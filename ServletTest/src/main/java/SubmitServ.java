import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class SubmitServ
 */
@WebServlet("/SubmitServ") // Ensure this matches the URL pattern in web.xml
public class SubmitServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SubmitServ() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		try {
			// Debug: Print received data
			System.out.println("Received Data:");
			System.out.println("Name: " + request.getParameter("name"));
			System.out.println("Roll No: " + request.getParameter("rollNo"));
			System.out.println("Email: " + request.getParameter("email"));
			System.out.println("Address: " + request.getParameter("address"));
			System.out.println("Gender: " + request.getParameter("gender"));
			System.out.println("Qualification: " + request.getParameter("qualification"));
			System.out.println("Post Applied: " + request.getParameter("postApplied"));
			System.out.println("Preferred Location: " + request.getParameter("preferredLocation"));

			// Database connection details
			String jdbcURL = "jdbc:mysql://localhost:3306/mydatabase"; // Ensure this database exists
			String dbUser = "root";
			String dbPassword = "Surya#589";

			// Debug: Test DB Connection
			System.out.println("Connecting to database...");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
			System.out.println("Database Connection Successful!");

			// Prepare SQL statement
			String sql = "INSERT INTO applicants (name, roll_no, email, address, gender, qualification, post_applied, preferred_location) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
			System.out.println("Executing SQL: " + sql);

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, request.getParameter("name"));
			statement.setString(2, request.getParameter("rollNo"));
			statement.setString(3, request.getParameter("email"));
			statement.setString(4, request.getParameter("address"));
			statement.setString(5, request.getParameter("gender"));
			statement.setString(6, request.getParameter("qualification"));
			statement.setString(7, request.getParameter("postApplied"));
			statement.setString(8, request.getParameter("preferredLocation"));

			// Execute query
			int rowsInserted = statement.executeUpdate();
			if (rowsInserted > 0) {
				out.println("<h1>Submission Successful!</h1>");
				out.println("<p>Thank you for your application, " + request.getParameter("name") + ".</p>");
			} else {
				out.println("<h1>Failed to insert data.</h1>");
			}

			// Close connections
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			out.println("<h1>Error occurred while submitting the form.</h1>");
			out.println("<p>" + e.getMessage() + "</p>"); // Print the actual error
		}
	}
}
package Countries;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class University {
	    private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	    private static final String USER = "Master";
	    private static final String PASSWORD = "nature";
	    private static Connection con; 
	    private String name;
	    private String country;
	    private String courses;
	    private String tuitionFees;
	    private String admissionRequirements;
	    private String accommodation;
	    private String applicationDeadline;
static {
	        try {
	            Class.forName("oracle.jdbc.driver.OracleDriver");
	            con = DriverManager.getConnection(URL, USER, PASSWORD);
	            System.out.println("Connected to Oracle Database.");
	        } catch (Exception e) {
	            e.printStackTrace();
	            }
	    }
        static Scanner sc = new Scanner(System.in);
	    public University(String name, String country, String courses, String tuitionFees, String admissionRequirements,String accommodation,String applicationDeadline) {
	        this.name = name;
	        this.country = country;
	        this.courses = courses;
	        this.tuitionFees = tuitionFees;
	        this.admissionRequirements = admissionRequirements;
	        this.accommodation = accommodation;
	        this.applicationDeadline = applicationDeadline;
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getCourses() {
			return courses;
		}

		public void setCourses(String courses) {
			this.courses = courses;
		}

		public String getTuitionFees() {
			return tuitionFees;
		}

		public void setTuitionFees(String tuitionFees) {
			this.tuitionFees = tuitionFees;
		}

		public String getAdmissionRequirements() {
			return admissionRequirements;
		}

		public void setAdmissionRequirements(String admissionRequirements) {
			this.admissionRequirements = admissionRequirements;
		}

		public String getAccommodation() {
			return accommodation;
		}

		public void setAccommodation(String accommodation) {
			this.accommodation = accommodation;
		}

		public String getApplicationDeadline() {
			return applicationDeadline;
		}

		public void setApplicationDeadline(String applicationDeadline) {
			this.applicationDeadline = applicationDeadline;
		}
		public static void main(String[] args){
	        Master.pro();
			 while (true) {
		            System.out.println("\n1. View Available Countries");
		            System.out.println("2. View Universities in a Country");
		            System.out.println("3. View Courses");
		            System.out.println("4. Exit");
		            System.out.print("Select an option: ");
		            int choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    getCountries();
		                    break;
		                case 2:
		                    getUniversities();
		                    break;
		                case 3:
		                    getCourse();
		                    break;
		                case 4:
		                    System.out.println("Exiting...");
		                    return;
		                default:
		                    System.out.println("Invalid choice. Try again.");
		            }
		        }
		    }

		    private static void getCountries() {
		        String query = "SELECT DISTINCT country FROM universities";
		        try (PreparedStatement stmt = con.prepareStatement(query);
		             ResultSet rs = stmt.executeQuery()) {
		            System.out.println("\nAvailable Countries:");
		            while (rs.next()) {
		                System.out.println("- " + rs.getString("country"));
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    private static void getUniversities() {
		        System.out.print("Enter country name: ");
		        String country = sc.next().toUpperCase();
		        String query = "SELECT name FROM universities WHERE country = ?";
		        try (PreparedStatement stmt = con.prepareStatement(query)) {
		            stmt.setString(1, country);
		            ResultSet rs = stmt.executeQuery();
		            System.out.println("\nUniversities in " + country + ":");
		            while (rs.next()) {
		                System.out.println("- " + rs.getString("name"));
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    private static void getCourse() {
		        System.out.print("Enter university name: ");
		        sc.nextLine();  
		        String university = sc.nextLine();
		        String query = "SELECT courses FROM universities WHERE name = ?";
		        try (PreparedStatement stmt = con.prepareStatement(query)) {
		            stmt.setString(1, university);
		            ResultSet rs = stmt.executeQuery();
		            if (rs.next()) {
		                System.out.println("\nCourses offered by " + university + ":");
		                System.out.println(rs.getString("courses"));
		            } else {
		                System.out.println("No courses found for this university.");
		            }
		        } 
		       catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }  
	        }


	


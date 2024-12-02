package Countries;

import java.util.HashMap;
import java.util.Scanner;

public class Master{
		  static Scanner sc = new Scanner(System.in);
		  static String Country_Name;
		  static {
		    System.out.println();
		    System.out.println("                                            -------------------------------------------");
		    System.out.println("                                            |            DREAM TO MASTERS             |");
		    System.out.println("                                            -------------------------------------------");
		  }
		  public static void pro(){
		    while (true) {
		      System.out.println("\n1. Details Of Country Names For The Masters.");
		      System.out.println("\n2. For Detailed Info Of The Universities In The Country.");
		      System.out.println("\n3. To Know Available Courses For Masters Offer By The Universities.");
		      System.out.println("\n4. For Applying Application Purpose.");
		      System.out.println("\n5. Exiting From Project.");
		      System.out.print("\nSelect Your Option From Above: ");
		      int Serial_Number = sc.nextInt();
		      switch (Serial_Number) {
		        case 1:
		          Countries();
		          boolean validCountry = false;
		          while (!validCountry) {
		            System.out.print("Enter The Country Name From Above: ");
		            Country_Name = sc.next().toUpperCase();
		            switch (Country_Name) {
		              case "USA":
		              case "UK":
		              case "CANADA":
		              case "AUSTRAILA":
		              case "GERMANY":
		              case "FRANCE":
		              case "IRELAND":
		              case "ITALY":
		              case "SPAIN":
		              case "LONDAN":
		                System.out.println("Are You Looking TO Do Masters At " + Country_Name);
		                validCountry = true;
		              break;
		              default:
		                System.out.println("Country Not Found In The List\n");
		            }
		          }
		          break;
  		        
	              
	              case 2:
	               Countries();
	               System.out.print("\nChoose The Country Of The Institute From Above: ");
		            Country_Name = sc.next().toUpperCase();
		            switch (Country_Name) {
		              case "USA":
		                System.out.println("\n1. Massachusetts Institute of Technology (MIT)\r\n"
		                    + "2. Stanford University\r\n"
		                    + "3. University of California - Berkeley\r\n"
		                    + "4. Georgia Institute of Technology\r\n"
		                    + "5. Carnegie Mellon University (CMU)\r\n"
		                    + "6. California State University\r\n"
		                    + "7. Harvard University\r\n"
		                    + "8. Southern Illinois University\r\n"
		                    + "9. Washington State University\r\n"
		                    + "10. Northeastern University");
		                break;
		              case "UK":
			                System.out.println("\n1. University of Oxford\r\n"
			                    + "2. University of Edinburgh\r\n"
			                    + "3. Imperial College London\r\n"
			                    + "4. University of Cambridge\r\n"
			                    + "5. University of Glasgow\r\n"
			                    + "6. University of Nottingham\r\n"
			                    + "7. University of Salford");
			                break;
		              case "CANADA":
			                System.out.println("\n1. University of Toronto\r\n"
			                    + "2. University of Waterloo\r\n"
			                    + "3. Western University\r\n"
			                    + "4. The University of British Columbia, Vancouver\r\n"
			                    + "5. University of Ottawa\r\n"
			                    + "6. University of Alberta\r\n"
			                    + "7. University of Windsor");
			                break;
		              case "AUSTRAILA":
			                System.out.println("\n1. University of Melbourne\r\n"
			                    + "2. Australian National University\r\n"
			                    + "3. University of Sydney\r\n"
			                    + "4. University of New South Wales, Sydney\r\n"
			                    + " 5. University of Queensland, Brisbane\r\n"
			                    + "6. University of Western Australia, Perth\r\n"
			                    + "7. Monash University");
			                break;
		              case "GERMANY":
			                System.out.println("\n1. Technical University of Munich\r\n"
			                    + "2. Ludwig Maximilian University of Munich\r\n"
			                    + "3. University of Berlin\r\n"
			                    + "4. University of Hamburg\r\n"
			                    + "5. University of Stuttgart\r\n"
			                    + "6. University of Frankfurt\r\n"
			                    + "7. University of Cologne");
			                break;
		              case "FRANCE":
			                System.out.println("\n1. University of Paris\r\n"
			                    + "2. University of Lyon\r\n"
			                    + "3. University of Bordeaux\r\n"
			                    + "4. University of Toulouse\r\n"
			                    + "5. University of Nice\r\n"
			                    + "6. University of Grenoble\r\n"
			                    + "7. University of Rennes");
			                break;
		              case "IRELAND":
			                System.out.println("\n1. University College Dublin\r\n"
			                    + "2. Trinity College Dublin\r\n"
			                    + "3. University of Limerick\r\n"
			                    + "4. University of Cork\r\n"
			                    + "5. Dublin City University\r\n"
			                    + "6. University of Galway\r\n"
			                    + "7. Maynooth University");
			                break;
		              case "ITALY":
		                     System.out.println("\n1. University of Bologna\r\n"
		                         + "2. University of Rome\r\n"
		                         + "3. University of Milan\r\n"
		                         + "4. University of Turin\r\n"
		                         + "5. University of Florence\r\n"
		                         + "6. University of Venice\r\n"
		                         + "7. University of Naples");
		                     break;
		              case "SPAIN":
		                     System.out.println("\n1. University of Barcelona\r\n"
		                         + "2. University of Madrid\r\n"
		                         + "3. University of Valencia\r\n"
		                         + "4. University of Seville\r\n"
		                         + "5. University of Granada\r\n"
		                         + "6. University of Zaragoza\r\n"
		                         + "7. University of Bilbao");
		                     break;
		              case "LONDAN":
		                     System.out.println("\n1. University College London\r\n"
		                         + "2. Imperial College London\r\n"
		                         + "3. University of London\r\n"
		                         + "4. King's College London\r\n"
		                         + "5. Queen Mary University of London\r\n"
		                         + "6. University of Westminster\r\n"
		                         + "7. City University London");
		                     break;
		                }
	               break;
	              case 3:
		               System.out.println("Some Of Courses Offered By The Universities!!\n");
		               System.out.println("1. MSc In Computer Science.\r\n"
		               		+ "2. MSc In Data Science.\r\n"
		               		+ "3. MSc In Artificial Intelligence.\r\n"
		               		+ "4. MSc In Theoretical Physics.\r\n"
		               		+ "5. MSc Carbon Management.\r\n"
		               		+ "6. MSc Computation Mathematics Finance. \r\n"
		               		+ "7. MSc Operational Research.\r\n"
		               		+ "8. MSc Mathematical Physics.\r\n"
		               		+ "9. MSc Animal Breeding And Genetics.\r\n"
		               		+ "10. Medical And Biological Chemistry.\r\n"
		               		+ "11. MSc Performance Psychology.\r\n"
		               	    + "12. MSc Biotechnology\r\n"
		               		+ "13. MSc Computational Applied Mathematics\r\n"
		               		+ "16. MSc Material Chemistry\r\n"
		               		+ "17. MSC Advanced Sustainable Design\r\n"
		               		+ "18. MSc in Applied Environmental Hydrogeology\r\n"
		               		+ "19. MSc Earth Observation and Geoinformation Management\r\n"
		               		+ "20. MSc Environmental Protection and Management\r\n"
		               		);
		               break;
	             case 4:
	            	 Countries();
			          validCountry = false;
			          while (!validCountry) {
			            System.out.print("Choose The Country Name Of The Institute From Above: ");
			            Country_Name = sc.next().toUpperCase();
			            switch (Country_Name) {
			              case "USA":
			                System.out.println("1. Massachusetts Institute of Technology (MIT)\r\n"
			                    + "2. Stanford University\r\n"
			                    + "3. University of California - Berkeley\r\n"
			                    + "4. Georgia Institute of Technology\r\n"
			                    + "5. Carnegie Mellon University (CMU)\r\n"
			                    + "6. California State University\r\n"
			                    + "7. Harvard University\r\n"
			                    + "8. Southern Illinois University\r\n"
			                    + "9. Washington State University\r\n"
			                    + "10. Northeastern University");
			                System.out.print("\nSelect University From Above Option: ");
			                int universityChoice = sc.nextInt();
			                switch (universityChoice) {
			                  case 1:
			                    displayUniversityInfo("Massachusetts Institute of Technology (MIT)", Country_Name);
			                    break;
			                  case 2:
			                    displayUniversityInfo("Stanford University", Country_Name);
			                    break;
			                  case 3:
			                    displayUniversityInfo("University of California - Berkeley", Country_Name);
			                    break;
			                  case 4:
			                    displayUniversityInfo("Georgia Institute of Technology", Country_Name);
			                    break;
			                  case 5:
			                    displayUniversityInfo("Carnegie Mellon University (CMU)", Country_Name);
			                    break;
		                	  case 6:
			                    displayUniversityInfo("California State University", Country_Name);
			                    break;
			                  case 7:
			                    displayUniversityInfo("Harvard University", Country_Name);
			                    break;
			                  case 8:
			                    displayUniversityInfo("Southern Illinois University", Country_Name);
			                    break;
			                  case 9:
			                    displayUniversityInfo("Washington State University", Country_Name);
			                    break;
			                  case 10:
			                    displayUniversityInfo("Northeastern University", Country_Name);
			                    break; 
			                }
			                validCountry = true;
			                break;
			              case "UK":
			                System.out.println("1. University of Oxford\r\n"
			                    + "2. University of Edinburgh\r\n"
			                    + "3. Imperial College London\r\n"
			                    + "4. University of Cambridge\r\n"
			                    + "5. University of Glasgow\r\n"
			                    + "6. University of Nottingham\r\n"
			                    + "7. University of Salford");
			                System.out.print("\nSelect University From Above Option: ");
			                universityChoice = sc.nextInt();
			                switch (universityChoice) {
			                  case 1:
			                    displayUniversityInfo("University of Oxford", Country_Name);
			                    break;
			                  case 2:
			                    displayUniversityInfo("University of Edinburgh", Country_Name);
			                    break;
			                  case 3:
			                    displayUniversityInfo("Imperial College London", Country_Name);
			                    break;
			                  case 4:
			                    displayUniversityInfo("University of Cambridge", Country_Name);
			                    break;
			                  case 5:
			                    displayUniversityInfo("University of Glasgow", Country_Name);
			                    break;
			                  case 6:
			                    displayUniversityInfo("University of Nottingham", Country_Name);
			                    break;
			                  case 7:
			                    displayUniversityInfo("University of Salford", Country_Name);
			                    break;
			                }
			                validCountry = true;
			                break;
			              case "CANADA":
			                System.out.println("1. University of Toronto\r\n"
			                    + "2. University of Waterloo\r\n"
			                    + "3. Western University\r\n"
			                    + "4. The University of British Columbia, Vancouver\r\n"
			                    + "5. University of Ottawa\r\n"
			                    + "6. University of Alberta\r\n"
			                    + "7. University of Windsor");
			                System.out.print("\nSelect University From Above Option: ");
			                universityChoice = sc.nextInt();
			                switch (universityChoice) {
			                  case 1:
			                    displayUniversityInfo("University of Toronto", Country_Name);
			                    break;
			                  case 2:
			                    displayUniversityInfo("University of Waterloo", Country_Name);
			                    break;
			                  case 3:
			                    displayUniversityInfo("Western University", Country_Name);
			                    break;
			                  case 4:
			                    displayUniversityInfo("The University of British Columbia, Vancouver", Country_Name);
			                    break;
			                  case 5:
			                    displayUniversityInfo("University of Ottawa", Country_Name);
			                    break;
			                  case 6:
			                    displayUniversityInfo("University of Alberta", Country_Name);
			                    break;
			                  case 7:
			                    displayUniversityInfo("University of Windsor", Country_Name);
			                    break;
			                }
			                validCountry = true;
			                break;
			              case "AUSTRAILA":
			                System.out.println("1. University of Melbourne\r\n"
			                    + "2. Australian National University\r\n"
			                    + "3. University of Sydney\r\n"
			                    + "4. University of New South Wales, Sydney\r\n"
			                    + " 5. University of Queensland, Brisbane\r\n"
			                    + "6. University of Western Australia, Perth\r\n"
			                    + "7. Monash University");
			                System.out.print("\nSelect University From Above Option: ");
			                universityChoice = sc.nextInt();
			                switch (universityChoice) {
			                  case 1:
			                    displayUniversityInfo("University of Melbourne", Country_Name);
			                    break;
			                  case 2:
			                    displayUniversityInfo("Australian National University", Country_Name);
			                    break;
			                  case 3:
			                    displayUniversityInfo("University of Sydney", Country_Name);
			                    break;
			                  case 4:
			                    displayUniversityInfo("University of New South Wales, Sydney", Country_Name);
			                    break;
			                  case 5:
			                    displayUniversityInfo("University of Queensland, Brisbane", Country_Name);
			                    break;
			                  case 6:
			                    displayUniversityInfo("University of Western Australia, Perth", Country_Name);
			                    break;
			                  case 7:
			                    displayUniversityInfo("Monash University", Country_Name);
			                    break;
			                }
			                validCountry = true;
			                break;
			              case "GERMANY":
			                System.out.println("1. Technical University of Munich\r\n"
			                    + "2. Ludwig Maximilian University of Munich\r\n"
			                    + "3. University of Berlin\r\n"
			                    + "4. University of Hamburg\r\n"
			                    + "5. University of Stuttgart\r\n"
			                    + "6. University of Frankfurt\r\n"
			                    + "7. University of Cologne");
			                System.out.print("\nSelect University From Above Option: ");
			                universityChoice = sc.nextInt();
			                switch (universityChoice) {
			                  case 1:
			                    displayUniversityInfo("Technical University of Munich", Country_Name);
			                    break;
			                  case 2:
			                    displayUniversityInfo("Ludwig Maximilian University of Munich", Country_Name);
			                    break;
			                  case 3:
			                    displayUniversityInfo("University of Berlin", Country_Name);
			                    break;
			                  case 4:
			                    displayUniversityInfo("University of Hamburg", Country_Name);
			                    break;
			                  case 5:
			                    displayUniversityInfo("University of Stuttgart", Country_Name);
			                    break;
			                  case 6:
			                    displayUniversityInfo("University of Frankfurt", Country_Name);
			                    break;
			                  case 7:
			                    displayUniversityInfo("University of Cologne", Country_Name);
			                    break;
			                }
			                validCountry = true;
			                break;
			              case "FRANCE":
			                System.out.println("1. University of Paris\r\n"
			                    + "2. University of Lyon\r\n"
			                    + "3. University of Bordeaux\r\n"
			                    + "4. University of Toulouse\r\n"
			                    + "5. University of Nice\r\n"
			                    + "6. University of Grenoble\r\n"
			                    + "7. University of Rennes");
			                System.out.print("\nSelect University From Above Option: ");
			                universityChoice = sc.nextInt();
			                switch (universityChoice) {
			                  case 1:
			                    displayUniversityInfo("University of Paris", Country_Name);
			                    break;
			                  case 2:
			                    displayUniversityInfo("University of Lyon", Country_Name);
			                    break;
			                  case 3:
			                    displayUniversityInfo("University of Bordeaux", Country_Name);
			                    break;
			                  case 4:
			                    displayUniversityInfo("University of Toulouse", Country_Name);
			                    break;
			                  case 5:
			                    displayUniversityInfo("University of Nice", Country_Name);
			                    break;
			                  case 6:
			                    displayUniversityInfo("University of Grenoble", Country_Name);
			                    break;
			                  case 7:
			                    displayUniversityInfo("University of Rennes", Country_Name);
			                    break;
			                }
			                validCountry = true;
			                break;
			              case "IRELAND":
			                System.out.println("1. University College Dublin\r\n"
			                    + "2. Trinity College Dublin\r\n"
			                    + "3. University of Limerick\r\n"
			                    + "4. University of Cork\r\n"
			                    + "5. Dublin City University\r\n"
			                    + "6. University of Galway\r\n"
			                    + "7. Maynooth University");
			                System.out.print("\nSelect University From Above Option: ");
			                universityChoice = sc.nextInt();
			                switch (universityChoice) {
			                  case 1:
			                    displayUniversityInfo("University College Dublin", Country_Name);
			                    break;
			                  case 2:
			                    displayUniversityInfo("Trinity College Dublin", Country_Name);
			                    break;
			                  case 3:
			                    displayUniversityInfo("University of Limerick", Country_Name);
			                    break;
			                  case 4:
			                    displayUniversityInfo("University of Cork", Country_Name);
			                    break;
			                  case 5:
			                    displayUniversityInfo("Dublin City University", Country_Name);
			                    break;
			                  case 6:
			                    displayUniversityInfo("University of Galway", Country_Name);
			                    break;
		                       case 7:
		                         displayUniversityInfo("Maynooth University", Country_Name);
		                         break;
		                       }
		                     validCountry = true;
		                     break;
		                      case "ITALY":
		                     System.out.println("1. University of Bologna\r\n"
		                         + "2. University of Rome\r\n"
		                         + "3. University of Milan\r\n"
		                         + "4. University of Turin\r\n"
		                         + "5. University of Florence\r\n"
		                         + "6. University of Venice\r\n"
		                         + "7. University of Naples");
				                System.out.print("\nSelect University From Above Option: ");
		                     universityChoice = sc.nextInt();
		                     switch (universityChoice){
		                       case 1:
		                         displayUniversityInfo("University of Bologna", Country_Name);
		                         break;
		                       case 2:
		                         displayUniversityInfo("University of Rome", Country_Name);
		                         break;
		                       case 3:
		                         displayUniversityInfo("University of Milan", Country_Name);
		                         break;
		                       case 4:
		                         displayUniversityInfo("University of Turin", Country_Name);
		                         break;
		                       case 5:
		                         displayUniversityInfo("University of Florence", Country_Name);
		                         break;
		                       case 6:
		                         displayUniversityInfo("University of Venice", Country_Name);
		                         break;
		                       case 7:
		                         displayUniversityInfo("University of Naples", Country_Name);
		                         break;
		                     }
		                     validCountry = true;
		                     break;
		                   case "SPAIN":
		                     System.out.println("1. University of Barcelona\r\n"
		                         + "2. University of Madrid\r\n"
		                         + "3. University of Valencia\r\n"
		                         + "4. University of Seville\r\n"
		                         + "5. University of Granada\r\n"
		                         + "6. University of Zaragoza\r\n"
		                         + "7. University of Bilbao");
				                System.out.print("\nSelect University From Above Option: ");
		                     universityChoice = sc.nextInt();
		                     switch (universityChoice) {
		                       case 1:
		                         displayUniversityInfo("University of Barcelona", Country_Name);
		                         break;
		                       case 2:
		                         displayUniversityInfo("University of Madrid", Country_Name);
		                         break;
		                       case 3:
		                         displayUniversityInfo("University of Valencia", Country_Name);
		                         break;
		                       case 4:
		                         displayUniversityInfo("University of Seville", Country_Name);
		                         break;
		                       case 5:
		                         displayUniversityInfo("University of Granada", Country_Name);
		                         break;
		                       case 6:
		                         displayUniversityInfo("University of Zaragoza", Country_Name);
		                         break;
		                       case 7:
		                         displayUniversityInfo("University of Bilbao ", Country_Name);
		                         break;
		                     }
		                     validCountry = true;
		                     break;
		                   case "LONDAN":
		                     System.out.println("1. University College London\r\n"
		                         + "2. Imperial College London\r\n"
		                         + "3. University of London\r\n"
		                         + "4. King's College London\r\n"
		                         + "5. Queen Mary University of London\r\n"
		                         + "6. University of Westminster\r\n"
		                         + "7. City University London");
				                System.out.print("\nSelect University From Above Option: ");
		                     universityChoice = sc.nextInt();
		                     switch (universityChoice) {
		                       case 1:
		                         displayUniversityInfo("University College London", Country_Name);
		                         break;
		                       case 2:
		                         displayUniversityInfo("Imperial College London", Country_Name);
		                         break;
		                       case 3:
		                         displayUniversityInfo("University of London", Country_Name);
		                         break;
		                       case 4:
		                         displayUniversityInfo("King's College London", Country_Name);
		                         break;
		                       case 5:
		                         displayUniversityInfo("Queen Mary University of London", Country_Name);
		                         break;
		                       case 6:
		                         displayUniversityInfo("University of Westminster", Country_Name);
		                         break;
		                       case 7:
		                         displayUniversityInfo("City University London", Country_Name);
		                         break;
		                     }
		                     validCountry = true;
		                     break;
		                   default:
		                     System.out.println("Country Not Available \n");
		                 }
			          }
			          System.out.println("If You Want to Choose Another Countries");
			          
			          break;
	             case 5:
	            	 System.out.println("\n******## See You Later ##*******");
	            	 return;
		        default:
	               System.out.println("Invalid Option Not Found!!");
	           }
	         }
	       }
	
		  static void Countries() {
			  System.out.println("\nThe Best Countries To Do Masters Abroad");
	          System.out.println("!! USA");
	          System.out.println("!! UK");
	          System.out.println("!! CANADA");
	          System.out.println("!! AUSTRAILA");
	          System.out.println("!! GERMANY");
	          System.out.println("!! FRANCE");
	          System.out.println("!! IRELAND");
	          System.out.println("!! ITALY");
	          System.out.println("!! SPAIN");
	          System.out.println("!! LONDAN\n");
		  }
	       static void displayUniversityInfo(String universityName, String country) {
	         HashMap<String, University> universities = new HashMap<>();
	         universities.put("Massachusetts Institute of Technology (MIT)", new University("Massachusetts Institute of Technology (MIT)", country,
	             "Courses: Computer Science, Engineering, Physics\n" ,
	                 "Tuition Fees: $50,000\n",
	                 "Admission Requirements: GPA 3.5, TOEFL 100, GRE 320",
	             "Accommodation: On-campus housing available, $10,000 per year",
	             "Application Deadline: December 15th"));
	         universities.put("Stanford University", new University("Stanford University", country,
	             "Courses: Computer Science, Engineering, Business\n" ,
	                 "Tuition Fees: $55,000\n" ,
	                 "Admission Requirements: GPA 3.7, TOEFL 110, GRE 330",
	             "Accommodation: On-campus housing available, $12,000 per year",
	             "Application Deadline: January 1st"));
	         universities.put("University of California - Berkeley", new University("University of California - Berkeley", country,
	             "Courses: Computer Science, Engineering, Physics\n" ,
	                 "Tuition Fees: $45,000\n" ,
	                 "Admission Requirements: GPA 3.4, TOEFL 95, GRE 310",
	             "Accommodation: On-campus housing available, $9,000 per year",
	             "Application Deadline: November 30th"));
	         universities.put("Georgia Institute of Technology", new University("Georgia Institute of Technology", country,
	             "Courses: Computer Science, Engineering, Physics\n" ,
	                 "Tuition Fees: $40,000\n" ,
	                 "Admission Requirements: GPA 3.3, TOEFL 90, GRE 300",
	             "Accommodation: On-campus housing available, $8,000 per year",
	             "Application Deadline: October 15th"));
	         universities.put("Carnegie Mellon University (CMU)", new University("Carnegie Mellon University (CMU)", country,
	             "Courses: Computer Science, Engineering, Physics\n" ,
	                 "Tuition Fees: $55,000\n" ,
	                 "Admission Requirements: GPA 3.7, TOEFL 110, GRE 330",
	             "Accommodation: On-campus housing available, $12,000 per year",
	             "Application Deadline: January 1st"));
	         universities.put("California State University", new University("California State University", country,
	             "Courses: Computer Science, Engineering, Physics\n" ,
	                 "Tuition Fees: $35,000\n" ,
	                 "Admission Requirements: GPA 3.2, TOEFL 85, GRE 290",
	             "Accommodation: On-campus housing available, $7,000 per year",
	             "Application Deadline: September 15th"));
	         universities.put("Harvard University", new University("Harvard University", country,
	             "Courses: Computer Science, Engineering, Physics\n" ,
	                 "Tuition Fees: $60,000\n" ,
	                 "Admission Requirements: GPA 3.8, TOEFL 115, GRE 340",
	             "Accommodation: On-campus housing available, $15,000 per year",
	             "Application Deadline: February 1st"));
	         universities.put("Southern Illinois University", new University("Southern Illinois University", country,
	             "Courses: Computer Science, Engineering, Physics\n" ,
	                 "Tuition Fees: $30,000\n" ,
	                 "Admission Requirements: GPA 3.1, TOEFL 80, GRE 280",
	                 "Accommodation: On-campus housing available, $6,000 per year",
	                      "Application Deadline: August 15th"));
	                  universities.put("Washington State University", new University("Washington State University", country,
	                      "Courses: Computer Science, Engineering, Physics\n" ,
	                          "Tuition Fees: $35,000\n" ,
	                          "Admission Requirements: GPA 3.2, TOEFL 85, GRE 290",
	                      "Accommodation: On-campus housing available, $7,000 per year",
	                      "Application Deadline: September 15th"));
	                  universities.put("Northeastern University", new University("Northeastern University", country,
	                      "Courses: Computer Science, Engineering, Physics\n" ,
	                          "Tuition Fees: $50,000\n" ,
	                          "Admission Requirements: GPA 3.5, TOEFL 100, GRE 320",
	                      "Accommodation: On-campus housing available, $10,000 per year",
	                      "Application Deadline: December 15th"));
	                  universities.put("University of Oxford", new University("University of Oxford", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: £30,000\n" ,
	                          "Admission Requirements: A-levels AAA, IELTS 7.0",
	                      "Accommodation: On-campus housing available, £8,000 per year",
	                      "Application Deadline: October 15th"));
	                  universities.put("University of Edinburgh", new University("University of Edinburgh", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: £25,000\n" ,
	                          "Admission Requirements: A-levels AAB, IELTS 6.5",
	                      "Accommodation: On-campus housing available, £7,000 per year",
	                      "Application Deadline: January 15th"));
	                  universities.put("Imperial College London", new University("Imperial College London", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: £35,000\n" ,
	                          "Admission Requirements: A-levels AAA, IELTS 7.5",
	                      "Accommodation: On-campus housing available, £9,000 per year",
	                      "Application Deadline: December 1st"));
	                  universities.put("University of Cambridge", new University("University of Cambridge", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: £32,000\n" ,
	                          "Admission Requirements: A-levels AAA, IELTS 7.0",
	                      "Accommodation: On-campus housing available, £8,500 per year",
	                      "Application Deadline: October 15th"));
	                  universities.put("University of Glasgow", new University("University of Glasgow", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: £20,000\n" ,
	                          "Admission Requirements: A-levels ABB, IELTS 6.0",
	                      "Accommodation: On-campus housing available, £6,000 per year",
	                      "Application Deadline: January 31st"));
	                  universities.put("University of Nottingham", new University("University of Nottingham", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: £28,000\n" ,
	                          "Admission Requirements: A-levels ABB, IELTS 6.5",
	                      "Accommodation: On-campus housing available, £7,500 per year",
	                      "Application Deadline: December 15th"));
	                  universities.put("University of Salford", new University("University of Salford", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: £18,000\n" ,
	                          "Admission Requirements: A-levels BBB, IELTS 6.0",
	                      "Accommodation: On-campus housing available, £5,000 per year",
	                      "Application Deadline: January 31st"));
	                  universities.put("University of Toronto", new University("University of Toronto", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: CAD$50,000\n" ,
	                          "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                      "Accommodation: On-campus housing available, CAD$10,000 per year",
	                      "Application Deadline: February 1st"));
	                  universities.put("University of Waterloo", new University("University of Waterloo", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: CAD$45,000\n" ,
	                          "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                      "Accommodation: On-campus housing available, CAD$9,000 per year",
	                      "Application Deadline: December 1st"));
	                  universities.put("Western University", new University("Western University", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: CAD$40,000\n" ,
	                          "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                      "Accommodation: On-campus housing available, CAD$8,000 per year",
	                      "Application Deadline: January 15th"));
	                  universities.put("The University of British Columbia, Vancouver", new University("The University of British Columbia, Vancouver", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: CAD$55,000\n" ,
	                          "Admission Requirements: GPA 3.7, TOEFL 110, IELTS 7.5",
	                      "Accommodation: On-campus housing available, CAD$12,000 per year",
	                      "Application Deadline: December 15th"));
	                  universities.put("University of Ottawa", new University("University of Ottawa", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: CAD$45,000\n" ,
	                          "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                      "Accommodation: On-campus housing available, CAD$9,000 per year",
	                      "Application Deadline: January 15th"));
	                  universities.put("University of Alberta", new University("University of Alberta", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: CAD$40,000\n" ,
	                          "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                      "Accommodation: On-campus housing available, CAD$8,000 per year",
	                      "Application Deadline: January 31st"));
	                  universities.put("University of Windsor", new University("University of Windsor", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: CAD$35,000\n" ,
	                          "Admission Requirements: GPA 3.2, TOEFL 85, IELTS 6.0",
	                      "Accommodation: On-campus housing available, CAD$7,000 per year",
	                      "Application Deadline: January 15th"));
	                  universities.put("University of Melbourne", new University("University of Melbourne", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: AUD$45,000\n" ,
	                          "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                      "Accommodation: On-campus housing available, AUD$10,000 per year",
	                      "Application Deadline: December 1st"));
	                  universities.put("Australian National University", new University("Australian National University", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: AUD$50,000\n" ,
	                          "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                      "Accommodation: On-campus housing available, AUD$12,000 per year",
	                      "Application Deadline: January 31st"));
	                  universities.put("University of Sydney", new University("University of Sydney", country,
	                      "Courses: Computer Science, Engineering, Business\n" ,
	                          "Tuition Fees: AUD$40,000\n" ,
	                          "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                          "Accommodation: On-campus housing available, AUD$8,000 per year",
	                               "Application Deadline: January 15th"));
	                           universities.put("University of New South Wales, Sydney", new University("University of New South Wales, Sydney", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: AUD$55,000\n" ,
	                                   "Admission Requirements: GPA 3.7, TOEFL 110, IELTS 7.5",
	                               "Accommodation: On-campus housing available, AUD$15,000 per year",
	                               "Application Deadline: December 15th"));
	                           universities.put("University of Queensland, Brisbane", new University("University of Queensland, Brisbane", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: AUD$45,000\n" ,
	                                   "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                               "Accommodation: On-campus housing available, AUD$10,000 per year",
	                               "Application Deadline: January 31st"));
	                           universities.put("University of Western Australia, Perth", new University("University of Western Australia, Perth", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: AUD$40,000\n" ,
	                                   "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                               "Accommodation: On-campus housing available, AUD$8,000 per year",
	                               "Application Deadline: January 15th"));
	                           universities.put("Monash University", new University("Monash University", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: AUD$50,000\n" ,
	                                   "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                               "Accommodation: On-campus housing available, AUD$12,000 per year",
	                               "Application Deadline: December 1st"));
	                           universities.put("Technical University of Munich", new University("Technical University of Munich", country,
	                               "Courses: Computer Science, Engineering, Physics\n" ,
	                                   "Tuition Fees: €30,000\n" ,
	                                   "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                               "Accommodation: On-campus housing available, €8,000 per year",
	                               "Application Deadline: January 15th"));
	                           universities.put("Ludwig Maximilian University of Munich", new University("Ludwig Maximilian University of Munich", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €25,000\n" ,
	                                   "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                               "Accommodation: On-campus housing available, €7,000 per year",
	                               "Application Deadline: December 1st"));
	                           universities.put("University of Berlin", new University("University of Berlin", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €35,000\n" ,
	                                   "Admission Requirements: GPA 3.7, TOEFL 110, IELTS 7.5",
	                               "Accommodation: On-campus housing available, €9,000 per year",
	                               "Application Deadline: October 15th"));
	                           universities.put("University of Hamburg", new University("University of Hamburg", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €30,000\n" ,
	                                   "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                               "Accommodation: On-campus housing available, €8,500 per year",
	                               "Application Deadline: January 31st"));
	                           universities.put("University of Stuttgart", new University("University of Stuttgart", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €20,000\n" ,
	                                   "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                               "Accommodation: On-campus housing available, €6,000 per year",
	                               "Application Deadline: January 15th"));
	                           universities.put("University of Frankfurt", new University("University of Frankfurt", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €28,000\n" ,
	                                   "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                               "Accommodation: On-campus housing available, €7,500 per year",
	                               "Application Deadline: December 15th"));
	                           universities.put("University of Cologne", new University("University of Cologne", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €18,000\n" ,
	                                   "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                               "Accommodation: On-campus housing available, €5,000 per year",
	                               "Application Deadline: January 31st"));
	                           universities.put("University of Paris", new University("University of Paris", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €30,000\n" ,
	                                   "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                               "Accommodation: On-campus housing available, €8,000 per year",
	                               "Application Deadline: January 15th"));
	                           universities.put("University of Lyon", new University("University of Lyon", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €25,000\n" ,
	                                   "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                               "Accommodation: On-campus housing available, €7,000 per year",
	                               "Application Deadline: December 1st"));
	                           universities.put("University of Bordeaux", new University("University of Bordeaux", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €35,000\n" ,
	                                   "Admission Requirements: GPA 3.7, TOEFL 110, IELTS 7.5",
	                               "Accommodation: On-campus housing available, €9,000 per year",
	                               "Application Deadline: October 15th"));
	                           universities.put("University of Toulouse", new University("University of Toulouse", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €30,000\n" ,
	                                   "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                               "Accommodation: On-campus housing available, €8,500 per year",
	                               "Application Deadline: January 31st"));
	                           universities.put("University of Nice", new University("University of Nice", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €20,000\n" ,
	                                   "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                               "Accommodation: On-campus housing available, €6,000 per year",
	                               "Application Deadline: January 15th"));
	                           universities.put("University of Grenoble", new University("University of Grenoble", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €28,000\n" ,
	                                   "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                               "Accommodation: On-campus housing available, €7,500 per year",
	                               "Application Deadline: December 15th"));
	                           universities.put("University of Rennes", new University("University of Rennes", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                                   "Tuition Fees: €18,000\n" ,
	                                   "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                               "Accommodation: On-campus housing available, €5,000 per year",
	                               "Application Deadline: January 31st"));
	                           universities.put("University College Dublin", new University("University College Dublin", country,
	                               "Courses: Computer Science, Engineering, Business\n" ,
	                               "Tuition Fees: €30,000\n" ,
	                            		            "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                            		        "Accommodation: On-campus housing available, €8,000 per year",
	                            		        "Application Deadline: January 15th"));
	                            		    universities.put("Trinity College Dublin", new University("Trinity College Dublin", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €25,000\n" ,
	                            		            "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                            		        "Accommodation: On-campus housing available, €7,000 per year",
	                            		        "Application Deadline: December 1st"));
	                            		    universities.put("University of Limerick", new University("University of Limerick", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €35,000\n" ,
	                            		            "Admission Requirements: GPA 3.7, TOEFL 110, IELTS 7.5",
	                            		        "Accommodation: On-campus housing available, €9,000 per year",
	                            		        "Application Deadline: October 15th"));
	                            		    universities.put("University of Cork", new University("University of Cork", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €30,000\n" ,
	                            		            "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                            		        "Accommodation: On-campus housing available, €8,500 per year",
	                            		        "Application Deadline: January 31st"));
	                            		    universities.put("Dublin City University", new University("Dublin City University", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €20,000\n" ,
	                            		            "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                            		        "Accommodation: On-campus housing available, €6,000 per year",
	                            		        "Application Deadline: January 15th"));
	                            		    universities.put("University of Galway", new University("University of Galway", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €28,000\n" ,
	                            		            "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                            		        "Accommodation: On-campus housing available, €7,500 per year",
	                            		        "Application Deadline: December 15th"));
	                            		    universities.put("Maynooth University", new University("Maynooth University", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €18,000\n" ,
	                            		            "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                            		        "Accommodation: On-campus housing available, €5,000 per year",
	                            		        "Application Deadline: January 31st"));
	                            		    universities.put("University of Bologna", new University("University of Bologna", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €30,000\n" ,
	                            		            "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                            		        "Accommodation: On-campus housing available, €8,000 per year",
	                            		        "Application Deadline: January 15th"));
	                            		    universities.put("University of Rome", new University("University of Rome", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €25,000\n" ,
	                            		            "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                            		        "Accommodation: On-campus housing available, €7,000 per year",
	                            		        "Application Deadline: December 1st"));
	                            		    universities.put("University of Milan", new University("University of Milan", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €35,000\n" ,
	                            		            "Admission Requirements: GPA 3.7, TOEFL 110, IELTS 7.5",
	                            		        "Accommodation: On-campus housing available, €9,000 per year",
	                            		        "Application Deadline: October 15th"));
	                            		    universities.put("University of Turin", new University("University of Turin", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €30,000\n" ,
	                            		            "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                            		        "Accommodation: On-campus housing available, €8,500 per year",
	                            		        "Application Deadline: January 31st"));
	                            		    universities.put("University of Florence", new University("University of Florence", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €20,000\n" ,
	                            		            "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                            		        "Accommodation: On-campus housing available, €6,000 per year",
	                            		        "Application Deadline: January 15th"));
	                            		    universities.put("University of Venice", new University("University of Venice", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €28,000\n" ,
	                            		            "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                            		        "Accommodation: On-campus housing available, €7,500 per year",
	                            		        "Application Deadline: December 15th"));
	                            		    universities.put("University of Naples", new University("University of Naples", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €18,000\n" ,
	                            		            "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                            		        "Accommodation: On-campus housing available, €5,000 per year",
	                            		        "Application Deadline: January 31st"));
	                            		    universities.put("University of Barcelona", new University("University of Barcelona", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €30,000\n" ,
	                            		            "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                            		        "Accommodation: On-campus housing available, €8,000 per year",
	                            		        "Application Deadline: January 15th"));
	                            		    universities.put("University of Madrid", new University("University of Madrid", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €25,000\n" ,
	                            		            "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                            		        "Accommodation: On-campus housing available, €7,000 per year",
	                            		        "Application Deadline: December 1st"));
	                            		    universities.put("University of Valencia", new University("University of Valencia", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €35,000\n" ,
	                            		            "Admission Requirements: GPA 3.7, TOEFL 110, IELTS 7.5",
	                            		        "Accommodation: On-campus housing available, €9,000 per year",
	                            		        "Application Deadline: October 15th"));
	                            		    universities.put("University of Seville", new University("University of Seville", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €30,000\n" ,
	                            		            "Admission Requirements: GPA 3.5, TOEFL 100, IELTS 7.0",
	                            		        "Accommodation: On-campus housing available, €8,500 per year",
	                            		        "Application Deadline: January 31st"));
	                            		    universities.put("University of Granada", new University("University of Granada", country,
	                            		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		            "Tuition Fees: €20,000\n" ,
	                            		            "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                            		        "Accommodation: On-campus housing available, €6,000 per year",
	                            		        "Application Deadline: January 15th"));
	                            		    universities.put("University of Zaragoza", new University("University of Zaragoza", country,
	                            		        "Courses: Computer Science, Engineering, Business\n",
	                            		                     "Tuition Fees: €28,000\n" ,
	                            		        		            "Admission Requirements: GPA 3.4, TOEFL 95, IELTS 6.5",
	                            		        		        "Accommodation: On-campus housing available, €7,500 per year",
	                            		        		        "Application Deadline: December 15th"));
	                            		        		    universities.put("University of Bilbao", new University("University of Bilbao ", country,
	                            		        		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		        		            "Tuition Fees: €18,000\n" ,
	                            		        		            "Admission Requirements: GPA 3.3, TOEFL 90, IELTS 6.0",
	                            		        		        "Accommodation: On-campus housing available, €5,000 per year",
	                            		        		        "Application Deadline: January 31st"));
	                            		        		    universities.put("University College London", new University("University College London", country,
	                            		        		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		        		            "Tuition Fees: £30,000\n" ,
	                            		        		            "Admission Requirements: A-levels AAA, IELTS 7.0",
	                            		        		        "Accommodation: On-campus housing available, £8,000 per year",
	                            		        		        "Application Deadline: January 15th"));
	                            		        		    universities.put("Imperial College London", new University("Imperial College London", country,
	                            		        		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		        		            "Tuition Fees: £35,000\n" ,
	                            		        		            "Admission Requirements: A-levels AAA, IELTS 7.5",
	                            		        		        "Accommodation: On-campus housing available, £9,000 per year",
	                            		        		        "Application Deadline: December 1st"));
	                            		        		    universities.put("University of London", new University("University of London", country,
	                            		        		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		        		            "Tuition Fees: £32,000\n" ,
	                            		        		            "Admission Requirements: A-levels AAA, IELTS 7.0",
	                            		        		        "Accommodation: On-campus housing available, £8,500 per year",
	                            		        		        "Application Deadline: October 15th"));
	                            		        		    universities.put("King's College London", new University("King's College London", country,
	                            		        		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		        		            "Tuition Fees: £30,000\n" ,
	                            		        		            "Admission Requirements: A-levels AAA, IELTS 7.0",
	                            		        		        "Accommodation: On-campus housing available, £8,000 per year",
	                            		        		        "Application Deadline: January 15th"));
	                            		        		    universities.put("Queen Mary University of London", new University("Queen Mary University of London", country,
	                            		        		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		        		            "Tuition Fees: £25,000\n" ,
	                            		        		            "Admission Requirements: A-levels ABB, IELTS 6.5",
	                            		        		        "Accommodation: On-campus housing available, £7,000 per year",
	                            		        		        "Application Deadline: December 1st"));
	                            		        		    universities.put("University of Westminster", new University("University of Westminster", country,
	                            		        		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		        		            "Tuition Fees: £28,000\n" ,
	                            		        		            "Admission Requirements: A-levels ABB, IELTS 6.5",
	                            		        		        "Accommodation: On-campus housing available, £7,500 per year",
	                            		        		        "Application Deadline: October 15th"));
	                            		        		    universities.put("City University London", new University("City University London", country,
	                            		        		        "Courses: Computer Science, Engineering, Business\n" ,
	                            		        		            "Tuition Fees: £18,000\n" ,
	                            		        		            "Admission Requirements: A-levels BBB, IELTS 6.0",
	                            		        		        "Accommodation: On-campus housing available, £5,000 per year",
	                            		        		        "Application Deadline: January 31st"));
	                            		        		    if (universities.containsKey(universityName)) {
	                            		        		      University university = universities.get(universityName);
	                            		        		      System.out.println("\nUniversity Details In The Country Of "+university.getCountry()+" !!\n");
	                            		        		      System.out.println(university.getCourses());
	                            		        		      System.out.println( university.getTuitionFees());
	                            		        		      System.out.println( university.getAdmissionRequirements()+"\n");
	                            		        		      System.out.println( university.getAccommodation()+"\n");
	                            		        		      System.out.println( university.getApplicationDeadline()+"\n");
	                            		        		    } else {
	                            		        		      System.out.println("\nUniversity not found.");
	                            		        		    }
	                            		        		  }
														}

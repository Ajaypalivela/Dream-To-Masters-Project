package Countries;


public class University {
	
	    private String name;
	    private String country;
	    private String courses;
	    private String tuitionFees;
	    private String admissionRequirements;
	    private String accommodation;
	    private String applicationDeadline;

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
	        }
}

	


package prob2A;

public class Student {
    private String Name;
    public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public GradeReport getGradeReport() {
		return gradeReport;
	}
	public void setGradeReport(GradeReport gradeReport) {
		this.gradeReport = gradeReport;
	}
	private GradeReport gradeReport;
    Student(String name)
    {
    	
    	this.Name=name;
    	this.gradeReport=new GradeReport(100);
    }
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", gradeReport=" + this.gradeReport.getGrade() + "]";
	}
	public static void main(String[] args) {
		
		
		Student newStudent=new Student("Mohamed Serageldin");
		System.out.println(newStudent.toString());
		
	}

}

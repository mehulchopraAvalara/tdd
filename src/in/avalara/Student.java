package in.avalara;

public class Student {

	private String name;
	
	private int roll;
	
	private char gender;
	
	private Float marks;
	
	private CalcServiceIntf calcService;

	public Student(String name, int roll, char gender) {
		super();
		this.name = name;
		this.roll = roll;
		this.gender = gender;
	}
	
	public Student(String name, int roll, char gender, float marks, CalcServiceIntf calcServiceIntf) {
		super();
		this.name = name;
		this.roll = roll;
		this.gender = gender;
		this.marks = marks;
		this.calcService = calcServiceIntf;
	}
	
	public String getDetails() {
		String part1 = String.format("Name : %s\nRoll : %d\nGender : %s", this.name,
				this.roll, this.gender);
		String part2 = null;
		if (this.marks != null) {
			part2 = String.format("Marks : %.2f", this.marks);
		}
		
		if (part2 != null) {
			return part1 + "\n" + part2;
		}
		
		return part1;
	}
	
	public String getGradeDetails() {
		if (this.marks == null) {
			throw new IllegalStateException();
		}
		
		String grade = calcService.calcGrade(this.marks);
		
		return String.format("Name : %s\nGrade : %s", this.name, grade);
	}
	
	
	
	
	
}

//create student class
class Student{
	private String studentId;
	private String studentName;
	private int marks;
	
	//Add student input functionality
	public Student(String studentId,String studentName,int marks){
		this.studentId=studentId;
		this.studentName=studentName;
		this.marks=marks;
	
	}
	public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getMarks() {
        return marks;
    }
	
	public void displayStudentDetails(){
		System.out.println("StdentId "+studentId+" Student Name "+studentName+" Marks "+marks);
	}
}

-
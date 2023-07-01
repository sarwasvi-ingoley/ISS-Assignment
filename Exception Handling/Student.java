
// User defined Exception Class for incorrect rno
class InvalidRnoException extends Exception { 
	public InvalidRnoException(String str) {
		super(str);
	}
}

//User defined Exception Class for incorrect percentage
class InvalidPercentageException extends Exception {
	public InvalidPercentageException(String str) {
		super(str);
	}
}

public class Student{
	int rno;
	String name;
	double percentage;
	Student(int rno, String name, double percentage){
		this.rno = rno;
		this.name = name;
		this.percentage = percentage;
	}
	public void validateRno() throws InvalidRnoException{ //validates rno
		if(this.rno <= 0) {	
			throw new InvalidRnoException("Invalid Rno");
		} 
	}
	public void validatePercentage() throws InvalidPercentageException{ //validates perc
		if(this.percentage > 100 || this.percentage < 0) {
			throw new InvalidPercentageException("Invalid Percentage");
		}
	}
	public static void main(String[] args) {
		Student s1 = new Student(1, "Sarwasvi", -23.4);
		try {
			s1.validateRno();
		} catch (InvalidRnoException ipe) {
			System.out.println("Enter valid Rno");
		}
		try {
			s1.validatePercentage();
		} catch (InvalidPercentageException ipe) {
			System.out.println("Enter valid Percentage");
		}
	}
}

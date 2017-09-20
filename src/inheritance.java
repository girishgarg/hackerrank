
import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;
	//private int id;
	int s=0;
	/*String firstName;
	String lastName
	int id;*/
	
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
	Student(String firstName,String lastName,int id,int[] testScores){
		
		/*this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;*/
		super(firstName, lastName,id);
		this.testScores = testScores;
		
	}
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
	char calculate(){
		for(int i = 0; i < testScores.length; i++){
		s=s+testScores[i];
		}
		int num = testScores.length;
		int a = s/num;
		char g;
		if(a<40){
			g = 'T';
		}else if(a<55){
			g = 'D';
		}else if(a<70){
			g = 'P';
		}else if(a<80){
			g = 'A';
		}else if(a<90){
			g = 'E';
		}else{
			g = 'O';
		}
		return g;
		
	}
}

public class inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}

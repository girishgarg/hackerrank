import java.io.*;
import java.util.*;

public class ClassvsInstance {
	private int age;	
	  
	public ClassvsInstance(int initialAge) {
        if(initialAge>=0){
            age = initialAge;
        }else{
            age=0;
            System.out.println("Age is not valid, setting age to 0.");
        }
  		// Add some more code to run some checks on initialAge
	}

	public void amIOld() {
        if(age<13){
            System.out.println("You are young.");
        }else if(age<18){
  		// Write code determining if this person's age is old and print the correct statement:
        System.out.println("You are a teenager.");
    }else{
        System.out.println("You are old.");
    }
    }
	
	
	public void yearPasses() {
  		// Increment this person's age.
        age=age+1;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			ClassvsInstance p = new ClassvsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
				System.out.println(p.age);
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
	
	

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] courses = new String[3];
		courses[0] = "C# - Angular";
		courses[1] = "Java - React";
		courses[2] = "JavaScript";
		
		
		Student student1 = new Student();	
		Instructor instructor1 = new Instructor();
		
		
		student1.setId(3);
		student1.setFullName("Burak Güler");
		student1.setEmail("burakguler@mail.com");
		student1.setPassword("burakguler12");
		student1.setEnrolledCourses(courses);
		
		instructor1.setId(4);
		instructor1.setFullName("Deniz Taş");
		instructor1.setEmail("deniztas@mail.com");
		instructor1.setPassword("3223245");
		instructor1.setHavingCourses(courses);
		
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		userManager.add(student1);
		userManager.add(instructor1);	
		studentManager.ListCourses(student1);
		instructorManager.ListCourses(instructor1);

	}

}

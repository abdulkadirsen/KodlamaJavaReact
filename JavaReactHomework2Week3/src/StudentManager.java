
public class StudentManager extends UserManager{

	public void ListCourses(Student student)
	{
		System.out.println(student.fullName + " ald��� kurslar:");
		for(String courses : student.getEnrolledCourses())
		{
			System.out.println(courses);
		}
	}

}

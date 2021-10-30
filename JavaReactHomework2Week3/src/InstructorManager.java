
public class InstructorManager extends UserManager{
	
	public void ListCourses(Instructor instructor)
	{
		System.out.println(instructor.fullName + " ait kurslar:");
		for(String courses : instructor.getHavingCourses())
		{
			System.out.println(courses);
		}
	}

}

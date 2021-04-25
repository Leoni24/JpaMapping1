package edu.deadshot.JpaMapping1;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.deadshot.JpaMapping1.models.Student;
import edu.deadshot.JpaMapping1.models.StudentContact;
import edu.deadshot.JpaMapping1.models.StudentCourses;
import edu.deadshot.JpaMapping1.repositories.StudentRepo;

@SpringBootApplication
public class JpaMapping1Application {

	public static void main(String[] args) {
		SpringApplication.run(JpaMapping1Application.class, args);
	}

	@Autowired
	StudentRepo studentRepo;

	@PostConstruct
    private void init() {
		Student student1 = new Student();
		student1.setFirstName("s1");
		student1.setLastName("test");

		StudentContact contact1 = new StudentContact();
		contact1.setAddress("vellore");
		contact1.setEmail("s1@mail.com");
		contact1.setMobile("111");
		
		StudentCourses course1 = new StudentCourses();
		course1.setCourseName("english");
		StudentCourses course2 = new StudentCourses();
		course2.setCourseName("tamil");

		student1.setContact(contact1);
		student1.setCourses(Arrays.asList(course1, course2));
		
		studentRepo.save(student1);
		System.out.println("student 1 created thru init");

	}

}

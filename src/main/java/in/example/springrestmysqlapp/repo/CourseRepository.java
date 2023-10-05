package in.example.springrestmysqlapp.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.example.springrestmysqlapp.binding.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course,Serializable> {

	
	
}

package practise.rediscachepractise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import practise.rediscachepractise.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}

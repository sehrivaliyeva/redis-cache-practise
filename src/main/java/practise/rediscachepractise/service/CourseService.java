package practise.rediscachepractise.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practise.rediscachepractise.entity.Course;
import practise.rediscachepractise.repository.CourseRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }
}

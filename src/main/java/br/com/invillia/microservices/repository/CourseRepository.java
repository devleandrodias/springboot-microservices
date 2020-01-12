package br.com.invillia.microservices.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.invillia.microservices.model.Course;

/**
 * CourseRepository
 */
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {

}
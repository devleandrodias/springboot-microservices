package br.com.invillia.microservices.endpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import br.com.invillia.microservices.model.Course;
import br.com.invillia.microservices.repository.CourseRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * CourseService
 */
@Service
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseService {

  private final CourseRepository courseRepository;

  public Iterable<Course> list(Pageable pageable) {
    log.info("Listing all courses");
    return courseRepository.findAll(pageable);
  }
}
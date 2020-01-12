package br.com.invillia.microservices.endpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.invillia.microservices.endpoint.service.CourseService;
import br.com.invillia.microservices.model.Course;
import lombok.RequiredArgsConstructor;

/**
 * CourseController
 */
@RestController
@RequestMapping("v1/admin/course")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CourseController {
  private final CourseService courseService;

  @GetMapping()
  public ResponseEntity<Iterable<Course>> list(Pageable pageable) {
    return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
  }
}
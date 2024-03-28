package br.com.gabriel.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.gabriel.mongo.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

    @Query("")
    void test();
}

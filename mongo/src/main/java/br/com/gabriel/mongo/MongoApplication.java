package br.com.gabriel.mongo;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import br.com.gabriel.mongo.entity.Address;
import br.com.gabriel.mongo.entity.Gender;
import br.com.gabriel.mongo.entity.Student;
import br.com.gabriel.mongo.repository.StudentRepository;
@SpringBootApplication
public class MongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoApplication.class, args);
	}
	

	@Bean
	CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate) {
		return args -> {
			// Student student = Student.builder()
			// 	.firstName("Gabriel Cardoso")
			// 	.lastName("Ahmed")
			// 	.email("Gabriel Cardoso")
			// 	.gender(Gender.FAMALE)
			// 	.created(LocalDateTime.now())
			// 	.address(new Address("Brasil", "2936000", "Castelo-ES"))
			// 	.favouriteSubjects(List.of("Computer Science", "System Information"))
			// 	.build();

			// 	repository.save(student);

			Query query = new Query();

			query.addCriteria(Criteria.where("favouriteSubjects").in("System Information"));

	
			var students = mongoTemplate.find(query, Student.class);

			for (var student: Optional.ofNullable(students).orElse(List.of())) {
				System.out.println(student);
			}
		};
	}

}

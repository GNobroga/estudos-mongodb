package br.com.gabriel.mongo.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
@Builder
public class Student {

    @Id
    private String id;
    
    private String firstName;

    private String lastName;

    private String email;

    private Gender gender;

    private Address address;

    private List<String> favouriteSubjects;

    private BigDecimal totalSpentInBooks;

    private LocalDateTime created;
}

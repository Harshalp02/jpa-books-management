package com.harshalproject.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@AllArgsConstructor
@Builder
//@Table(
//        name = "AUTHOR_TBL"
//)
public class Author {
    @Id
    @GeneratedValue
            /*(
            strategy = GenerationType.SEQUENCE,
            generator = "author-sequence"
    )
    @SequenceGenerator(
            name = "author-sequence",
            sequenceName = "author-sequence",
            allocationSize = 1
    )*/
    private Integer id;
    @Column(
            name = "f_name",
            length = 35
    )
    private String firstName;
    private String lastName;
    @Column(
            unique = true,
            nullable = false
    )
    private String email;
    private int age;
//    @Column(
//            updatable = false
////            nullable = false
//    )
//    private LocalDateTime createdAt;
//
//    @Column(
//            insertable = false
//    )
//    private LocalDateTime lastModified;
    @ManyToMany(
            mappedBy = "authors"
    )
    private List<Course> course;
}

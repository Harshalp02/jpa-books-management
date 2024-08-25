package com.harshalproject.jpa.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@Entity
@AllArgsConstructor
@Builder
public class Course {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String description;
    @ManyToMany
    @JoinTable(
            name = "authors_course",
            joinColumns = {
                    @JoinColumn(
                            name = "course_id"
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "author_id"
                    )
            }
    )
    private List<Author> authors;
}

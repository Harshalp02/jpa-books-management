package com.harshalproject.jpa;

import com.harshalproject.jpa.models.Author;
import com.harshalproject.jpa.models.Video;
import com.harshalproject.jpa.repositories.AuthorRepository;
import com.harshalproject.jpa.repositories.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//10.43
@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}
//	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository repository, VideoRepository videoRepository){
		return args -> {
//			var author= Author.builder()
//					.firstName("harshal")
//					.lastName("patil")
//					.age(22)
//					.email("hkpatil2002@gmail.com")
//					.build();
//			repository.save(author);
			var video= Video.builder()
					.name("abc")
					.length(5)
					.build();
			videoRepository.save(video);
		};
	}

}

package com.example.mamechishiki.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Mamechishiki {
	@Id
	private Integer id;
	private String post;
	private String author;
}

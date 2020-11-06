package local.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import local.beans.Song;

@Configuration
public class BeanConfiguration {

	@Bean
	public Song song() {
		Song bean = new Song();
		return bean;
	}
	
}

package local.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import local.beans.Song;
import local.repository.SongRepository;

@Controller
public class WebController {
	@Autowired
	SongRepository repo;
	
	@GetMapping("/viewAll")
	public String viewAllSongs(Model model) {
		model.addAttribute("songs", repo.findAll());
		return "results";
	}
	
	@GetMapping("/inputSong")
	public String addNewSong(Model model) {
		Song newSong = new Song();
		model.addAttribute("newSong", newSong);
		return "input";
	}
	@PostMapping("/inputSong")
	public String addNewSong(@ModelAttribute Song song, Model model) {
		repo.save(song);
		return viewAllSongs(model);
	}
	@GetMapping("/edit/{id}")
	public String showUpdateSong(@PathVariable("id") long id, Model model) {
		Song song = repo.findById(id).orElse(null);
		model.addAttribute("newSong", song);
		return "input";
	}
	@PostMapping("/update/{id}")
	public String updateSong(Song song, Model model) {
		repo.save(song);
		return viewAllSongs(model);
	}
	@GetMapping("/delete/{id}")
	public String deleteSong(@PathVariable("id") long id,Model model) {
		Song song = repo.findById(id).orElse(null);
		repo.delete(song);
		return viewAllSongs(model);
	}
}

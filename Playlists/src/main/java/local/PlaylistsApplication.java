package local;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaylistsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaylistsApplication.class, args);
	}
//	@Autowired
//	SongRepository repo;
//
//	@Override
//	public void run(String... args) throws Exception {
//
////		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
////		
////		Song a = appContext.getBean("song", Song.class);
////		repo.save(a);
//		
//		Song b = new Song();
//		b.setArtist("The National");
//		b.setAlbum("Boxer");
//		b.setTitle("Fake Empire");
//		repo.save(b);
//		
//
//		List<Song> allSongs = repo.findAll();
//		for (Song song : allSongs) {
//			System.out.println(song.toString());
//		}
//
////		((AbstractApplicationContext) appContext).close();
////		Contact c = appContext.getBean("contact", Contact.class);
////		c.setRelationship("best friend");
////		repo.save(c);
////
////		Contact d = new Contact("Sandra Boynton", "555-555-5557", "friend");
////		Address a = new Address("123 Main Street", "Des Moines", "IA");
////		d.setAddress(a);
////		repo.save(d);
////
////		List<Contact> allMyContacts = repo.findAll();
////		for (Contact contact : allMyContacts) {
////			System.out.println(contact.toString());
////		}
////		((AbstractApplicationContext) appContext).close();
//	}
//
}

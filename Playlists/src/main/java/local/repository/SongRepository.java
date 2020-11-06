package local.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import local.beans.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long>{

}

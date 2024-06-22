package SpringBoot.Service;

import SpringBoot.Dominio.Anime;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class AnimeService {
    private final List<Anime> animeList = List.of(
            new Anime(1L, "Masamune-kun"),
            new Anime(2L,"Tsuki ga Kirei"),
            new Anime(3L,"Jojo"),
            new Anime(4L,"Shinigami Bocchan"),
            new Anime(5L,"Your Lie in April"));

    //Futuramente implementaremos a interface própria do AnimeRepo.
    public List<Anime> listAll(){
        return animeList;
    }

    public List<Anime> findByID(Long ID){
        return animeList.stream().filter(a -> Objects.equals(a.getID(), ID)).findFirst().orElseThrow()
    }
}
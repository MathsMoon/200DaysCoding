package SpringBoot.Service;

import SpringBoot.Dominio.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class AnimeService {
    private static List<Anime> animeList;

    static {
        animeList = List.of(
                new Anime(1L, "Masamune-kun"),
                new Anime(2L,"Tsuki ga Kirei"),
                new Anime(3L,"Jojo"),
                new Anime(4L,"Shinigami Bocchan"),
                new Anime(5L,"Your Lie in April"));
    }

    //Futuramente implementaremos a interface própria do AnimeRepo.
    public List<Anime> listAll(){
        return animeList;
    }

    //Realizando pesquisa pelo ID do anime:
    public Anime findByID(Long ID){
        return animeList.
                stream().
                filter(a -> a.getID() == ID).
                findFirst().
                orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not found!"));
    }

    public Anime save(Anime anime) {
        anime.setID(ThreadLocalRandom.current().nextLong(6, 10));
        animeList.add(anime);
        return anime;
    }
}
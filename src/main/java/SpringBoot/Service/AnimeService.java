package SpringBoot.Service;

import SpringBoot.Dominio.Anime;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class AnimeService {
    private static List<Anime> animes;

    static {
        animes = new ArrayList<>(
                List.of(
                        new Anime(1L, "Shinigami Bocchan"),
                        new Anime(2L, "One Piece"),
                        new Anime(3L, "Jojo"),
                        new Anime(4L, "Nisekoi"),
                        new Anime(5L, "Tsuki ga Kirei")
                ));
    }

    // private final AnimeRepository animeRepository;
    public List<Anime> listAll() {
        return animes;
    }

    public Anime findById(long id) {
        return animes.stream()
                .filter(anime -> anime.getID().equals(id))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Anime not Found"));
    }

    //O ID se repete após o fim dos 4 IDs Criados.
    public Anime save(Anime anime) {
        anime.setID(ThreadLocalRandom.current().nextLong(6,10));
        animes.add(anime);
        return anime;
    }
}
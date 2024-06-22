package SpringBoot.Repository;

import SpringBoot.Dominio.Anime;
import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
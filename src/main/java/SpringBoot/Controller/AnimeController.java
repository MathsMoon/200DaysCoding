package SpringBoot.Controller;

import SpringBoot.Dominio.Anime;
import SpringBoot.Util.DateUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {
    private DateUtil dateUtil;

    @GetMapping(path = "list")
    public List<Anime> list(){
        return List.of(new Anime("One Piece"),new Anime("Tsuki ga Kirei"),new Anime("Jojo"),new Anime("Shinigami Bocchan"));
    }
}
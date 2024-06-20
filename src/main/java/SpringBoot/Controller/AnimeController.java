package SpringBoot.Controller;

import SpringBoot.Dominio.Anime;
import SpringBoot.Util.DateUtil;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@AllArgsConstructor
public class AnimeController {
    private DateUtil dateUtil;

    @GetMapping(path = "list")
    public List<Anime> list(){
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return List.of(new Anime("Masamune-Kun"),new Anime("Tsuki ga Kirei"),new Anime("Jojo"),new Anime("Shinigami Bocchan"), new Anime("Your Lie in April"));
    }
}
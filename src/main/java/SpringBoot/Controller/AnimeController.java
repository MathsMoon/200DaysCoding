package SpringBoot.Controller;

import SpringBoot.Dominio.Anime;
import SpringBoot.Service.AnimeService;
import SpringBoot.Util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("animes")
@Log4j2
@RequiredArgsConstructor //Necessita todos os parâmetros como Final.
public class AnimeController {
    private final DateUtil dateUtil;
    private final AnimeService animeService;

    @GetMapping
    public ResponseEntity<List<Anime>> list(){
        log.info(dateUtil.formatLocalDateTimeToDataBaseStyle(LocalDateTime.now()));
        return new ResponseEntity<>(animeService.listAll(), HttpStatus.OK);
    }

    //Para acessar outra função já linkada pelo getMapping é necessário um path relativo a função, por exemplo:
    @GetMapping (path = "/{id}")
    public ResponseEntity<Anime> findByID(@PathVariable Long ID){
        log.info("Retornando anime pelo ID");
        return ResponseEntity.ok(animeService.listAll().get(0));
    }
}
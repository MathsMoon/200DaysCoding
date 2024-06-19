package SpringBoot.Dominio;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Anime {
    private String Name;

    public Anime(String name) {
        Name = name;
    }

    public Anime(){}
}
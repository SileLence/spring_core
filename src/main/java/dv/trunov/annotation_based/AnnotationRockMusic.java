package dv.trunov.annotation_based;

import dv.trunov.Music;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class AnnotationRockMusic extends Music {

    public AnnotationRockMusic() {
        this.songs = List.of("Du Hast", "Moth into Flame", "Hit the Floor");
    }
    @Override
    public String getSongName() {
        Random random = new Random();
        return songs.get(random.nextInt(0, 3));
    }
}

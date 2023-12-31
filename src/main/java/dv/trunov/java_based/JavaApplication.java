package dv.trunov.java_based;

import dv.trunov.MusicGenre;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaSpringConfig.class);

        JavaComputer computer = context.getBean(JavaComputer.class);

        JavaMusicPlayer musicPlayer = computer.getMusicPlayer();
        musicPlayer.getName();
        musicPlayer.getVolume();
        musicPlayer.getMusicList();
        musicPlayer.playRandomSong();

        computer.runMusicPlayer(MusicGenre.INSTRUMENTAL);
        computer.runMusicPlayer(MusicGenre.ROCK);
        computer.runMusicPlayer(MusicGenre.AMBIENT);

        context.close();
    }
}

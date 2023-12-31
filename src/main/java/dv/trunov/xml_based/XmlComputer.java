package dv.trunov.xml_based;

import dv.trunov.MusicGenre;

public class XmlComputer {

    private int id;
    private final XmlMusicPlayer musicPlayer;

    public XmlComputer(XmlMusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public XmlMusicPlayer getMusicPlayer() {
        return musicPlayer;
    }

    public void runMusicPlayer(MusicGenre genre) {
        System.out.printf("XmlComputer %d -> Playing: %s\n", id, musicPlayer.playMusic(genre));
    }

    public void setId(int id) {
        this.id = id;
    }
}

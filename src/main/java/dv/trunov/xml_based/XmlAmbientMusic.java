package dv.trunov.xml_based;

import dv.trunov.Music;

public class XmlAmbientMusic extends Music {

    @Override
    public String getSongName() {
        return "Ambient Music";
    }

    private void init() {
        System.out.println("XmlAmbientMusic Initialized.");
    }

    private void destroy() {
        System.out.println("XmlAmbientMusic Destroyed.");
    }
}

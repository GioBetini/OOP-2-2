package View;

import java.util.ArrayList;
import java.util.List;

import Model.Musica;
import Model.Playlist;

public class Main {
    public static void main(String[] args) throws Exception {
        Musica mus1 = new Musica();

        mus1.setNome("toxicity");
        mus1.setAutor("System of a Down");
        mus1.setGravadora("American Recordings");

        Musica mus2 = new Musica();

        mus2.setNome("Remédios Demais");
        mus2.setAutor("Matanza");
        mus2.setGravadora("Deck");

        Musica mus3 = new Musica();

        mus3.setNome("Hey you");
        mus3.setAutor("Pink Floyd");
        mus3.setGravadora("Columbia Records");
        
        List<Musica> playlistRock = new ArrayList<>();
        try {
            playlistRock.add(mus1);
            playlistRock.add(mus2);
            playlistRock.add(mus3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Playlist rock = new Playlist();
        rock.setDono("Giovai");
        rock.setPlaylist(playlistRock);
    

        rock.tocarPlaylist(playlistRock);

    }
}

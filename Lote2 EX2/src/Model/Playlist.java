package Model;


import java.util.List;

public class Playlist {
    private String dono;
    private List<Musica> playlist;
   
    
    
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setPlaylist( List<Musica> playlist){
        this.playlist = playlist;
    }

    public void tocarPlaylist(List<Musica> playlist){                              //estipulei um desafio extra de não deixar as músicas 
        for(int i = playlist.size()-1; i >= 0; i--){
            int j = (int)(Math.random()*playlist.size());
            System.out.println("Você está ouvindo: "+playlist.get(j).getNome()); //se repetirem até que todas tenham sido tocadas
        }
        System.out.println("Sua Playlist chegou ao fim!");
        System.out.println("Hora de ouvir um anúncio...");
        

        }
    }
    


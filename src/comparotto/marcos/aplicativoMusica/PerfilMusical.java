package comparotto.marcos.aplicativoMusica;

import java.util.ArrayList;
import java.util.List;

public class PerfilMusical {
    private byte id_usuario;
    private String generoMusical;
    private List<Playlist> playlists;
    private List<Musica> musicasRecomendadas;

    public PerfilMusical(byte id_usuario, String generoMusical) {
        this.id_usuario = id_usuario;
        this.generoMusical = generoMusical;
        this.playlists = new ArrayList<>();
        this.musicasRecomendadas = new ArrayList<>();
    }

    public void recomendarMusica() {
        System.out.println("Recomendando músicas com base no gênero: " + this.generoMusical);
        if (musicasRecomendadas.isEmpty()) {
            System.out.println("Nenhuma música recomendada disponível no momento.");
        } else {
            for (Musica musica : musicasRecomendadas) {
                System.out.println("- " + musica.getNomeMusica());
            }
        }
    }


    public void adicionarPlaylist(Playlist playlist) {
        this.playlists.add(playlist);
    }

    public void adicionarMusicaRecomendada(Musica musica) {
        this.musicasRecomendadas.add(musica);
    }


    public byte getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(byte id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public List<Musica> getMusicasRecomendadas() {
        return musicasRecomendadas;
    }

    public void setMusicasRecomendadas(List<Musica> musicasRecomendadas) {
        this.musicasRecomendadas = musicasRecomendadas;
    }
}
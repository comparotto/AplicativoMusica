package comparotto.marcos.aplicativoMusica;

import java.util.List;

public class Playlist {
    private String nomePlaylist;
    private List<Musica> musicasEscolhidas;
    private float duracao; // em  minutos
    private List<Usuario> donos;

    public Playlist(String nomePlaylist, List<Musica> musicasEscolhidas, float duracao, List<Usuario> donos) {
        this.nomePlaylist = nomePlaylist;
        this.musicasEscolhidas = musicasEscolhidas;
        this.duracao = duracao;
        this.donos = donos;
    }
    public void adicionarMusica(Musica musica){
        this.musicasEscolhidas.add(musica);
    }
    public void exibir(){
        System.out.println("Nome da Playlist: "+this.nomePlaylist+"\nTempo de duração da Playlist: "+this.duracao+"\nDono(s)/Criador(es) da Playlist: "+this.donos+"\nMusicas da Playlist: "+this.musicasEscolhidas);
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public List<Musica> getMusicasEscolhidas() {
        return musicasEscolhidas;
    }

    public void setMusicasEscolhidas(List<Musica> musicasEscolhidas) {
        this.musicasEscolhidas = musicasEscolhidas;
    }

    public float getDuracao() {
        return duracao;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public List<Usuario> getDonos() {
        return donos;
    }

    public void setDonos(List<Usuario> donos) {
        this.donos = donos;
    }
}

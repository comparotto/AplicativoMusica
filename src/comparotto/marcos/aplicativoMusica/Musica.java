package comparotto.marcos.aplicativoMusica;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Musica {
    String nomeMusica;
    Date dataLancamento;
    float tempoMin; // Tempo em minutos
    String generoMusical;
    private List<Artista> artistas;

    public Musica(String nomeMusica, Date dataLancamento, float tempoMin, String generoMusical, List<Artista> artistas) {
        this.nomeMusica = nomeMusica;
        this.dataLancamento = dataLancamento;
        this.tempoMin = tempoMin;
        this.generoMusical = generoMusical;
        this.artistas = artistas;
    }

    public void adicionarArtista(Artista artista) {
        this.artistas.add(artista);
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public float getTempoMin() {
        return tempoMin;
    }

    public void setTempoMin(float tempoMin) {
        this.tempoMin = tempoMin;
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }
    public void exibir() {
        System.out.println("Título da Música: "+this.nomeMusica+"\nData de Lançamento da Música: "+this.dataLancamento+"\nDuração da Música: "+this.tempoMin+"\nGênero Musical: "+this.generoMusical);

    }

    public void listarArtistas() {
        System.out.println("Artistas da música '" + nomeMusica + "':");
        for (Artista artista : artistas) {
            System.out.println("- " + artista.getNome());
        }
    }

}






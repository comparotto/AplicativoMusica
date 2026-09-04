package comparotto.marcos.aplicativoMusica;

import java.util.List;
import java.util.Properties;

public class Banda {
    private String nome;
    private String generoMusical;
    private List<Artista> integrantes;
    private List<Musica> musicas;

    public Banda(String nome, String generoMusical, List<Artista> integrantes, List<Musica> musicas) {
        this.nome = nome;
        this.generoMusical = generoMusical;
        this.integrantes = integrantes;
        this.musicas = musicas;
    }
    public void lancarMusica(Musica musica) {
        this.musicas.add(musica);
    }

    public String getGeneroMusical() {
        return generoMusical;
    }

    public void setGeneroMusical(String generoMusical) {
        this.generoMusical = generoMusical;
    }

    public List<Artista> getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(List<Artista> integrantes) {
        this.integrantes = integrantes;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void exibir() {
        System.out.println("Nome da Banda: "+this.nome+"\nGenero Musical: "+this.generoMusical+"\nIntegrantes da Banda;  "+this.integrantes+"\nMúsicas Lançadas: "+this.musicas);

    }
}

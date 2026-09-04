package comparotto.marcos.aplicativoMusica;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String nomePlaylist;
    private List<PlaylistM> itens;
    private float duracao;
    private List<Usuario> donos;

    public Playlist(String nomePlaylist, List<Usuario> donos) {
        this.nomePlaylist = nomePlaylist;
        this.donos = donos != null ? donos : new ArrayList<>();
        this.duracao = 0.0f;
        this.itens = new ArrayList<>();
    }

    public void adicionarMusica(Musica musica) {
        if (musica != null) {
            int proximaPosicao = itens.size() + 1;
            PlaylistM item = new PlaylistM(musica, this, proximaPosicao);
            this.itens.add(item);
            this.duracao += musica.getTempoMin();
        }
    }

    public void exibir() {
        System.out.println("====== PLAYLIST ======");
        System.out.println("Nome: " + this.nomePlaylist);
        System.out.println("Duração Total: " + String.format("%.2f", this.duracao) + " min");

        System.out.print("Dono(s): ");
        if (donos.isEmpty()) {
            System.out.println("Nenhum dono cadastrado.");
        } else {
            for (int i = 0; i < donos.size(); i++) {
                System.out.print(donos.get(i).getNome() + (i < donos.size() - 1 ? ", " : "\n"));
            }
        }

        System.out.println("\nMúsicas:");
        if (itens.isEmpty()) {
            System.out.println("  - Nenhuma música na playlist.");
        } else {
            for (PlaylistM item : itens) {
                System.out.println("  " + item.getPosicao() + ". " + item.getMusica().getNomeMusica());
            }
        }
        System.out.println("======================");
    }

    public String getNomePlaylist() {
        return nomePlaylist;
    }

    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    public List<PlaylistM> getItens() {
        return itens;
    }

    public void setItens(List<PlaylistM> itens) {
        this.itens = itens;
    }

    public float getDuracao() {
        return duracao;
    }

    public List<Usuario> getDonos() {
        return donos;
    }

    public void setDonos(List<Usuario> donos) {
        this.donos = donos;
    }
}
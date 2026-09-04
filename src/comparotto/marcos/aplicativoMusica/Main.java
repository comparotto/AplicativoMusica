package comparotto.marcos.aplicativoMusica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date dataAtual = new Date();

        Usuario usuario = new Usuario("Marcos Comparotto", 22, "marcos@email.com", dataAtual);
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(usuario);

        Artista artista1 = new Artista(1, "Chester Bennington", 41, "Chester");
        Artista artista2 = new Artista(2, "Mike Shinoda", 47, "Mike");
        List<Artista> artistas = new ArrayList<>();
        artistas.add(artista1);
        artistas.add(artista2);

        Musica musica1 = new Musica("In the End", dataAtual, 3.36f, "Rock", artistas);
        Musica musica2 = new Musica("Numb", dataAtual, 3.07f, "Rock", artistas);

        List<Musica> musicasBanda = new ArrayList<>();
        musicasBanda.add(musica1);
        musicasBanda.add(musica2);

        Banda banda = new Banda("Linkin Park", "Rock", artistas, musicasBanda);

        PerfilMusical perfil = new PerfilMusical((byte) 1, "Rock");
        perfil.adicionarMusicaRecomendada(musica1);
        perfil.adicionarMusicaRecomendada(musica2);

        Playlist playlist = new Playlist("Melhores do Rock", usuarios);
        playlist.adicionarMusica(musica1);
        playlist.adicionarMusica(musica2);

        perfil.adicionarPlaylist(playlist);

        usuario.exibir();
        System.out.println();
        artista1.exibir();
        System.out.println();
        musica1.exibir();
        musica1.listarArtistas();
        System.out.println();
        banda.exibir();
        System.out.println();
        perfil.recomendarMusica();
        System.out.println();
        playlist.exibir();
    }
}
/*
Somente a classe main foi feita por Inteligência Artificial,
 pois quis testar o projeto de forma rapida
 */
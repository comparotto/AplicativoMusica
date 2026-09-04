package comparotto.marcos.aplicativoMusica;

import java.util.Date;

public class Usuario extends Pessoa {
    private String email;
    private Date dataCadastro;
    private Pessoa pessoa;
    public void exibir() {
        System.out.println("Nome do Usuário: "+super.getNome()+"\nE-mail: "+this.email+"\nData de cadastro na plataforma: "+this.dataCadastro);
    }

    public Usuario(String nome, int idade, String email, Date dataCadastro) {
        super(nome, idade);
        this.email = email;
        this.dataCadastro = dataCadastro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}

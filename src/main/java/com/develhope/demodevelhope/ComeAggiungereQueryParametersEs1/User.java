package com.develhope.demodevelhope.ComeAggiungereQueryParametersEs1;

public class User {
    private String nome;
    private String provincia;

    public User(String nome, String provincia) {
        this.nome = nome;
        this.provincia = provincia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}

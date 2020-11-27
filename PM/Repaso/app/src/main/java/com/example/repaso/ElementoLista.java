package com.example.repaso;

public class ElementoLista {

    private  String nombe, region, sexo;
    private int imagen, dificultad;

    public ElementoLista(String nombe, String region, String sexo, int imagen, int dificultad) {
        this.nombe = nombe;
        this.region = region;
        this.sexo = sexo;
        this.imagen = imagen;
        this.dificultad = dificultad;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }
}

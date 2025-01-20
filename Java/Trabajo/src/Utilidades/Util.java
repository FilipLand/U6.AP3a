package Utilidades;

public class Util {
    String Marca;
    String Modelo;
    int Antiguedad;
    int Caballos;
    int revoluciones;
    boolean Funciona;

    public Util(String marca, String modelo, int antiguedad, int caballos, int revoluciones, boolean funciones) {
        this.Marca = marca;
        this.Modelo = modelo;
        this.Antiguedad = antiguedad;
        this.Caballos = caballos;
        this.revoluciones = revoluciones;
        this.Funciona = funciones;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        Antiguedad = antiguedad;
    }

    public int getCaballos() {
        return Caballos;
    }

    public void setCaballos(int caballos) {
        Caballos = caballos;
    }

    public int getRevoluciones() {
        return revoluciones;
    }

    public void setRevoluciones(int revoluciones) {
        this.revoluciones = revoluciones;
    }

    public boolean isFunciona() {
        return Funciona;
    }

    public void setFunciona(boolean funciona) {
        Funciona = funciona;
    }
}

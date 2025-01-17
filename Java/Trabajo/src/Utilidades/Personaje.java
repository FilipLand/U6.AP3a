package Utilidades;

public class Personaje {
    private String Nombre;
    private int Nivel;
    private String Clase;
    private int Defensa;
    private int Velocidad;
    private int Bigote;
    private int Martillo;
    private int Salto;
    private int Vida;
    private int Energia;
    private String Objeto1;
    private String Objeto2;

    public Personaje(String nombre, int nivel, String clase, int defensa, int velocidad, int bigote, int martillo, int salto, int vida, int energia, String objeto1, String objeto2) {
        Nombre = nombre;
        Nivel = nivel;
        Clase = clase;
        Defensa = defensa;
        Velocidad = velocidad;
        Bigote = bigote;
        Martillo = martillo;
        Salto = salto;
        Vida = vida;
        Energia = energia;
        Objeto1 = objeto1;
        Objeto2 = objeto2;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getNivel() {
        return Nivel;
    }

    public void setNivel(int nivel) {
        Nivel = nivel;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String clase) {
        Clase = clase;
    }

    public int getDefensa() {
        return Defensa;
    }

    public void setDefensa(int defensa) {
        Defensa = defensa;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int velocidad) {
        Velocidad = velocidad;
    }

    public int getBigote() {
        return Bigote;
    }

    public void setBigote(int bigote) {
        Bigote = bigote;
    }

    public int getMartillo() {
        return Martillo;
    }

    public void setMartillo(int martillo) {
        Martillo = martillo;
    }

    public int getSalto() {
        return Salto;
    }

    public void setSalto(int salto) {
        Salto = salto;
    }

    public int getVida() {
        return Vida;
    }

    public void setVida(int vida) {
        Vida = vida;
    }

    public int getEnergia() {
        return Energia;
    }

    public void setEnergia(int energia) {
        Energia = energia;
    }

    public String getObjeto1() {
        return Objeto1;
    }

    public void setObjeto1(String objeto1) {
        Objeto1 = objeto1;
    }

    public String getObjeto2() {
        return Objeto2;
    }

    public void setObjeto2(String objeto2) {
        Objeto2 = objeto2;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "Nombre='" + Nombre + '\'' +
                ", Nivel=" + Nivel +
                ", Clase='" + Clase + '\'' +
                ", Defensa=" + Defensa +
                ", Velocidad=" + Velocidad +
                ", Bigote=" + Bigote +
                ", Martillo=" + Martillo +
                ", Salto=" + Salto +
                ", Vida=" + Vida +
                ", Energia=" + Energia +
                ", Objeto1='" + Objeto1 + '\'' +
                ", Objeto2='" + Objeto2 + '\'' +
                '}';
    }
}

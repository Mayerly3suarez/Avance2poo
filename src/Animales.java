public class Animales{

    protected String nombre;
    protected String tamano;
    protected String especie;
    protected String lugarAvistamiento;

    public Animales(){

    }

    public Animales(String nombre, String tamano, String especie, String lugarAvistamiento) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.especie = especie;
        this.lugarAvistamiento = lugarAvistamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getLugarAvistamiento() {
        return lugarAvistamiento;
    }

    public void setLugarAvistamiento(String lugarAvistamiento) {
        this.lugarAvistamiento = lugarAvistamiento;
    }

    @Override
    public String toString() {
        return "Animales{" +
                "nombre='" + nombre + '\'' +
                ", tamano='" + tamano + '\'' +
                ", especie='" + especie + '\'' +
                ", lugarAvistamiento='" + lugarAvistamiento + '\'' +
                '}';
    }
}


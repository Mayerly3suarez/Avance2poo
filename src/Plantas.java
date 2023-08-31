public class Plantas {

    protected String nombreComun;
    protected String ubicacion;
    protected String alturamt;

    public Plantas() {

    }

    public Plantas(String nombreComun, String ubicacion, String altura) {
        this.nombreComun = nombreComun;
        this.ubicacion = ubicacion;
        this.alturamt = altura;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String  getAltura() {
        return alturamt;
    }

    public void setAltura(String altura) {
        this.alturamt = altura;
    }

    @Override
    public String toString() {
        return "Plantas{" +
                "nombreComun='" + nombreComun + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", alturamt=" + alturamt +
                '}';
    }
}


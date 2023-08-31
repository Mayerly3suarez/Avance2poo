import javax.swing.*;

public class Usuario extends JFrame {
    protected String nombre;
    protected String id;
    protected String tipodeUsuario;

    public Usuario(){

    }

    public Usuario(String nombre, String id, String tipodeUsuario) {
        this.nombre = nombre;
        this.id = id;
        this.tipodeUsuario = tipodeUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipodeUsuario() {
        return tipodeUsuario;
    }

    public void setTipodeUsuario(String tipodeUsuario) {
        this.tipodeUsuario = tipodeUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", tipodeUsuario='" + tipodeUsuario + '\'' +
                '}';
    }
}



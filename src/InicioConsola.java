import java.io.IOException;
import java.util.ArrayList;

public class InicioConsola {

    static Usuario usu;
    static String listado;
    static ArrayList<Usuario> listaUsuarios;



    public static void main(String[] args) throws IOException {

        cargar();
        crearUsuario();
        verLista();
        actualizar();




    }
    public static void actualizar(){
        String lineaEnviar="C:\\archivos\\QuizPoo2_Ejercicios\\usuarios.txt";
        for (Usuario p: listaUsuarios) {

            lineaEnviar=lineaEnviar+p.nombre+":"+p.id+":"+p.tipodeUsuario;
        }

        lineaEnviar= ";"+usu.nombre+","+usu.id+","+usu.tipodeUsuario;
        EscribirArchivo.writeFile(listado+lineaEnviar,"usuarios.txt");
        System.out.println("\nUsuario registrado");
    }

    public static void crearUsuario(){
        Usuario usuario1 = new Usuario("Sofia Perez","TI1025463254","Estudiante");
        Usuario usuario2 = new Usuario("Victor Hernandez","CC12532541","Estudiante");
        listaUsuarios.add(usuario1);
        listaUsuarios.add(usuario2);

    }

    public static void verLista(){

        System.out.println("Lista usuarios");
        for (Usuario p: listaUsuarios) {

            System.out.print("\n"+p.nombre+":"+p.id+":"+p.tipodeUsuario);
        }
    }
    public static void cargar()throws IOException {
        listado = LeerArchivo.readFile("C:\\archivos\\QuizPoo2_Ejercicios\\usuarios.txt");
        String[] usuarios = listado.split(";");
        String[] atributos = null;
        listaUsuarios = new ArrayList<>();



        for (int i = 0; i < usuarios.length; i++) {
            atributos = usuarios[i].split(",");
            usu = new Usuario(atributos[0], atributos[1],atributos[2]);
            listaUsuarios.add(usu);
            return;
        }
    }
}







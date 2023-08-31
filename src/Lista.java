import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Lista  {


    static ArrayList<Usuario> crearLista(String usuarios){
        ArrayList<Usuario> listaUsuarios= new ArrayList<>();
        String[] Usuario=usuarios.split(";");
        Usuario u;
        String[] atributos;
        for (int i = 0; i < Usuario.length; i++) {
            atributos= Usuario[i].split(",");
            u= new Usuario (atributos[0],atributos[1],atributos[2]);
            listaUsuarios.add(u);

        }
        return listaUsuarios;



    }

    static ArrayList<Plantas> crearListaP(String plantas){
        ArrayList<Plantas> listaPlantas= new ArrayList<>();
        String[] Plantas=plantas.split(";");
        Plantas u;
        String[] atributos;
        for (int i = 0; i < Plantas.length; i++) {
            atributos= Plantas[i].split(",");
            u= new Plantas (atributos[0],atributos[1],atributos[2]);
            listaPlantas.add(u);

        }
        return listaPlantas;
    }

    static ArrayList<Animales> crearListaA(String animales){
        ArrayList<Animales> listaAnimales= new ArrayList<>();
        String[] Animales= animales.split(";");
        Animales u;
        String[] atributos;
        for (int i = 0; i < Animales.length; i++) {
            atributos= Animales[i].split(",");
            u= new Animales (atributos[0],atributos[1],atributos[2],atributos[3]);
            listaAnimales.add(u);

        }
        return listaAnimales;

    }


    public static void main(String[] args ) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        List<String> lines1 = Files.readAllLines(Paths.get("C:\\archivos\\QuizPoo2_Ejercicios\\usuarios.txt"));
        List<Usuario> usuarios1 = new ArrayList<>();


        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\archivos\\QuizPoo2_Ejercicios\\usuarios.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }

            reader.close();
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        System.out.println("Contenido del archivo:");
        for (String line : lines) {
            System.out.println(line);
        }

    }
    }





























































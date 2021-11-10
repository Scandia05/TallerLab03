import java.util.Scanner;

public class Camion {
    private String codigo;
    private String patente;
    private String descripcion;
    private Boolean estado;

    public Camion() {
        this.codigo = codigo;
        this.patente = patente;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public static void agregarCamion() {
        AdminitradordeArchivos.nuevaLinea(".\\Camiones",ingresoDatos());
        System.out.println("La lista queda Asi: ");
        System.out.println(AdminitradordeArchivos.leerArchivo(".\\Camiones"));
    }
    public static String ingresoDatos() {
        System.out.println("Ingrese la patente del camión");
        String contenido = ingresarRespuesta();
        System.out.println("Ingrese el codigo del Camion");
        contenido = contenido + " "+ ingresarRespuesta();
        System.out.println("¿Cómo es el camion?");
        contenido = contenido + " "+ contenido+ " "+ ingresarRespuesta();
        return contenido;
    }
    public static String ingresarRespuesta() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }
    }


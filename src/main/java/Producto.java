import java.util.Scanner;

public class Producto {
    private String codigo;
    private String tipo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Producto(String codigo, String tipo) {
        this.codigo = codigo;
        this.tipo = tipo;
    }
    public static void agregarProducto() {
        AdminitradordeArchivos.nuevaLinea(".\\Producto",ingresoDatos());
        System.out.println("La lista queda Asi: ");
        System.out.println(AdminitradordeArchivos.leerArchivo(".\\Producto"));
    }
    public static String ingresoDatos() {
        System.out.println("Que Tipo de producto desea Agregar");
        String contenido = ingresarRespuesta();
        System.out.println("Ingrese el codigo del Producto");
        contenido = contenido + " "+ ingresarRespuesta();
        return contenido;
    }
    public static String ingresarRespuesta() {
        Scanner teclado = new Scanner(System.in);
        return teclado.next();
    }
    }


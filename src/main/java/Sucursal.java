public class Sucursal {
    private String codigo;
    private String direcciones;

    public Sucursal(String codigo, String direcciones) {
        this.codigo = codigo;
        this.direcciones = direcciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(String direcciones) {
        this.direcciones = direcciones;
    }
}

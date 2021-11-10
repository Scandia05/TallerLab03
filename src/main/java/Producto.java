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
}

public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;

    // Constructor
    public Producto(String codigo, String nombre, int cantidad){
        setCodigo(codigo);
        this.nombre = nombre;
        setCantidad(cantidad);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.trim().isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Error: Código no válido.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("Error: Cantidad no puede ser negativa.");
        }
    }

    public String toString() {
        return "Producto{" + "codigo='" + codigo + "', nombre='" + nombre + "', cantidad=" + cantidad + '}';
    }
}

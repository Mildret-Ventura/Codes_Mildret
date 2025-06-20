public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(3);

        Producto p1 = new Producto("456", "Galletas", 4);
        Producto p2 = new Producto("789", "Galon de agua", 2);
        Producto p3 = new Producto("123", "Leche", 12);
        Producto p4 = new Producto("963", "Aceite", 17);

        System.out.println("Agregar p1: " + inventario.agregarProducto(p1));
        System.out.println("Total items: " + inventario.totalItems());

        System.out.println("Agregar p2: " + inventario.agregarProducto(p2));
        System.out.println("Total items: " + inventario.totalItems());

        System.out.println("Agregar p3: " + inventario.agregarProducto(p3));
        System.out.println("Total items: " + inventario.totalItems());

        System.out.println("Agregar p4 (debe fallar): " + inventario.agregarProducto(p4));
        System.out.println("Total items: " + inventario.totalItems());

        Producto buscado = inventario.buscar("789");
        System.out.println("Buscar 789: " + (buscado != null ? buscado : "No encontrado"));

        Producto noEncontrado = inventario.buscar("000");
        System.out.println("Buscar 000: " + (noEncontrado != null ? noEncontrado : "No encontrado"));

        System.out.println("Eliminar 456: " + inventario.eliminarProducto("456"));
        System.out.println("Total items: " + inventario.totalItems());

        System.out.println("Agregar p4 (debe funcionar): " + inventario.agregarProducto(p4));
        System.out.println("Total items: " + inventario.totalItems());

        inventario.mostrarStock();

    }
}

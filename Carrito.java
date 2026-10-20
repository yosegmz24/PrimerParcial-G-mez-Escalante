import java.util.ArrayList;

public class Carrito {
    private ArrayList<Articulo> articulos;
    private int cantidadDeArticulos;

    public Carrito() {
        articulos = new ArrayList<>();
        cantidadDeArticulos = 0;
    }

    public void agregarArticulo(Articulo a) {
        if (a != null) {
            articulos.add(a);
            cantidadDeArticulos++;
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (Articulo a : articulos) {
            total += a.getPrecioUnitario();
        }

        return total;
    }

    public void mostrarCarrito() {
        System.out.println("\n--- CARRITO DE COMPRAS ---");

        for (Articulo a : articulos) {
            System.out.println(
                a.getDescripcion() + " - $" +
                a.getPrecioUnitario()
            );
        }

        System.out.println("Cantidad de artículos: " + cantidadDeArticulos);
        System.out.println("Total: $" + calcularTotal());
    }
}
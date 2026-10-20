import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrito carrito = new Carrito();

        for (int i = 1; i <= 3; i++) {
            System.out.println("Artículo " + i);

            System.out.print("Ingrese la descripción: ");
            String descripcion = sc.nextLine();

            System.out.print("Ingrese el precio: ");
            double precio = sc.nextDouble();
            sc.nextLine();

            Articulo articulo = new Articulo(descripcion, precio);
            carrito.agregarArticulo(articulo);
        }

        carrito.mostrarCarrito();

        sc.close();
    }
}

package co.edu.notas;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarritoComprasTest {
private CarritoCompras carrito;
@BeforeEach
void setUp() { carrito = new CarritoCompras(); }
@Test
@DisplayName("Subtotal = precio × cantidad de cada producto")
void calcularSubtotal_variosProductos_sumaCorrecta() {
// Arrange
carrito.agregarProducto("Cuaderno", 8_000, 3);
carrito.agregarProducto("Esfero", 2_000, 5);
// Act
double subtotal = carrito.calcularSubtotal();
// Assert
assertEquals(34_000, subtotal, 0.001);
}
// TODO Parte A: carrito vacío + una prueba por cada entrada inválida de R1
// TODO Parte B: SENA10, BIENVENIDO (50.000 y 49.999), cupón inválido, totales (R6)
}

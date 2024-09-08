
import com.mycompany.cuenta.bancaria.poo.CuentaBancaria;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


//....
public class CuentaBancariaTest {
    @Test
    public void testIngresar() {
        CuentaBancaria cuenta = new CuentaBancaria("Nicolas", "123456789", 10000);
        cuenta.ingresar(5000);
        assertEquals(15000, cuenta.getSaldo(), 0.01);
    }
    @Test
    public void testIngresar2() {
        CuentaBancaria cuenta = new CuentaBancaria("Nicolas", "123456789", 10000);
        cuenta.ingresar(500);
        assertEquals(10500, cuenta.getSaldo(), 0.01);
    }
    

    @Test
    public void testRetirar() {
        CuentaBancaria cuenta = new CuentaBancaria("Nicolas", "123456789", 10000);
        cuenta.retirar(3000);
        assertEquals(7000, cuenta.getSaldo(), 0);
    }
    @Test
    public void testRetirar2() {
        CuentaBancaria cuenta = new CuentaBancaria("Nicolas", "123456789", 10000);
        cuenta.retirar(100000);
        assertEquals(0, cuenta.getSaldo(), 0); //fondos insuficientes debe si o si fallar
    }
    
       
    @Test
    public void testCalcularInteres() {
        CuentaBancaria cuenta = new CuentaBancaria("Nicolas", "123456789", 10000);
        cuenta.setTipoInteres(7);
        double interes = cuenta.calcularInteres();
        assertEquals(700, interes, 0.01);
    }
    @Test
    public void testCalcularInteres2() {
        CuentaBancaria cuenta = new CuentaBancaria("Nicolas", "123456789", 1000);
        cuenta.setTipoInteres(5);
        double interes = cuenta.calcularInteres();
        assertEquals(50, interes, 0.01);
    }
}
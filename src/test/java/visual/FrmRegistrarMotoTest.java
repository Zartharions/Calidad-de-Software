package visual;
import org.junit.Test;
import static org.junit.Assert.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class FrmRegistrarMotoTest {

    @Test
    public void testRegistrar() {
        // Configuración previa al test
        FrmRegistrarMoto frm = new FrmRegistrarMoto(null, true); // Crear instancia del formulario
        frm.cmbMoto.setSelectedItem("Electrica"); // Configurar datos de prueba
        frm.txtPlaca.setText("123ABC");
        frm.txtMarca.setText("Honda");
        frm.txtModelo.setText("CBR");
        frm.txtColor.setText("Rojo");
        frm.txtTipo.setText("Deportiva");
        frm.dtcFecha.setDate(new Date());

        // Ejecutar el método a probar
        frm.btnRegistrar.doClick(); // Simular clic en el botón Registrar

        // Verificar resultado esperado
        // Aquí podrías añadir aserciones para verificar el comportamiento esperado después de registrar

        // Ejemplo de aserción básica para demostración
        assertNotNull(frm.adm); // Verificar que el administrador de motos no sea nulo después de registrar
    }
}

package visual;
import org.junit.Test;
import static org.junit.Assert.*;

public class FrmPresentarMotoTest {

    @Test
    public void testBtnPresentarActionPerformed() {
        // Configuración previa al test
        FrmPresentarMoto frm = new FrmPresentarMoto(null, true); // Crear instancia del formulario

        // Ejecutar el método a probar
        frm.btnPresentar.doClick(); // Simular clic en el botón Presentar

        // Verificar resultado esperado
        assertFalse(frm.isVisible()); // Verificar que el formulario no esté visible después de presionar el botón
    }
}

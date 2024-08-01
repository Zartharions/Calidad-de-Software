package Control;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import model.MotoMVY;

public class AdmMotoTest {

    private AdmMoto admMoto;

    @Before
    public void setUp() {
        admMoto = AdmMoto.getAdm();
    }

    @Test
    public void testLlenarCombo() {
        JComboBox<String> comboBox = new JComboBox<>();
        admMoto.llenarCombo(comboBox);

        assertEquals(2, comboBox.getItemCount());
        assertEquals("Electrico", comboBox.getItemAt(0));
        assertEquals("Mecanico", comboBox.getItemAt(1));
    }

    @Test
    public void testVerificar() {
        assertTrue(admMoto.verificar(null));
        assertFalse(admMoto.verificar(LocalDate.now()));
    }
    

    @Test
    public void testCodigo() {
        int codigo1 = admMoto.codigo();
        int codigo2 = admMoto.codigo();

        assertTrue(codigo1 > 0 && codigo1 <= 9999);
        assertTrue(codigo2 > 0 && codigo2 <= 9999);
    }

    @Test
    public void testLlenarTabla() {
        LocalDate fecha = LocalDate.now();
        admMoto.registrar("ABC123", "123ABC", "Marca", "Modelo", "Rojo", "Electrico", fecha);
        
        JTable tabla = new JTable(new DefaultTableModel(new Object[]{"Código", "Sistema", "NroPlaca", "Marca", "Modelo", "Color", "Tipo", "FechaCrea"}, 0));
        admMoto.llenarTabla(tabla);

        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        assertEquals(1, modelo.getRowCount());
        assertEquals("ABC123", tabla.getValueAt(0, 1));
    }







    @Test
    public void testEliminar() {
        LocalDate fecha = LocalDate.now();
        admMoto.registrar("ABC123", "123ABC", "Marca", "Modelo", "Rojo", "Electrico", fecha);

        admMoto.eliminar("1");
        assertNull(admMoto.motos.get(1));
    }
}

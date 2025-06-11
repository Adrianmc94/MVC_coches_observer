import com.cod.mvc.Coche;
import com.cod.mvc.Model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testRecu {
    @Nested
    class ModelTest {

        @BeforeEach
        void limpiarParking() {
            // Limpia el parking antes de cada test
            Model.parking.clear();
        }

        @Test
        void testCrearCoche() {
            Coche coche = Model.crearCoche("Ferrari", "ABC123");
            assertNotNull(coche);
            assertEquals("Ferrari", coche.modelo);
            assertEquals("ABC123", coche.matricula);
            assertEquals(0, coche.velocidad);
        }


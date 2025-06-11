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

        @Test
        void testGetCoche() {
            Model.crearCoche("Alpine", "DEF456");
            Coche coche = Model.getCoche("DEF456");
            assertNotNull(coche);
            assertEquals("Alpine", coche.modelo);
        }

        @Test
        void testCambiarVelocidad() {
            Model.crearCoche("Aston Martin", "GHI789");
            int nuevaVelocidad = Model.cambiarVelocidad("GHI789", 100);
            assertEquals(100, nuevaVelocidad);
            assertEquals(100, Model.getVelocidad("GHI789"));
        }
    }
}





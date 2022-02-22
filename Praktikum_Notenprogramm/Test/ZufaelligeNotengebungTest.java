import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZufaelligeNotengebungTest {
    ZufaelligeNotengebung testZufallsNoten = new ZufaelligeNotengebung();
    Map<Double, Integer> zufallsZahlen = new HashMap<>();
    private static final double notemin = 1.0;
    private static final double notemax = 6.0;
    Pruefungsverwaltung pruefungsverwaltungTest = new Pruefungsverwaltung();

    @BeforeEach
    void setUp() {
    }

    @Test
    void testeZufaelligeNotengabe() {
        for (int i = 0; i < 100000; i++) {
            double zufallszahl = testZufallsNoten.generiereZufaelligePruefungsnote();
            Assertions.assertFalse(zufallszahl < 1.0, "zahl unter 1.0");
            Assertions.assertFalse(zufallszahl > 6.0, "zahl grösser als 6.0");

        }
    }

    @Test
    void testeZufaelligeNotenVerteilung() {
        for (int i = 0; i < 100000; i++) {
            double zufallszahl = testZufallsNoten.generiereZufaelligePruefungsnote();
            zufallszahl = pruefungsverwaltungTest.rundeAufHalbeNote(zufallszahl);
            if (zufallsZahlen.containsKey(zufallszahl)) {
                int counter = zufallsZahlen.get(zufallszahl);
                zufallsZahlen.put(zufallszahl, ++counter);
            } else {
                zufallsZahlen.put(zufallszahl, 1);
            }
        }
        for (Map.Entry<Double, Integer> note :
                zufallsZahlen.entrySet()) {

            System.out.println(note.getKey() + " = "
                    + note.getValue());
        }
    }

}




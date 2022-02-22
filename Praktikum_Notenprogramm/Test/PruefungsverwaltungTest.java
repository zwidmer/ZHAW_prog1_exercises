import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PruefungsverwaltungTest {
private static final double noteKnappAbrunden = 4.24;
private static final double noteKnappAufrunden= 4.25;

private double note;
Pruefungsverwaltung pruefungsverwaltungTest= new Pruefungsverwaltung();

    @BeforeEach
    void setUp() {
    }


    @Test
    void notenRunden(){
        note= pruefungsverwaltungTest.rundeAufHalbeNote(3.74);
        assertEquals(3.5, note);

    }

    @Test
    void notenRundenAufrunden(){
        note= pruefungsverwaltungTest.rundeAufHalbeNote(noteKnappAufrunden);
        assertEquals(4.5, note);

    }

    @Test
    void notenRundenAbrunden(){
        note= pruefungsverwaltungTest.rundeAufHalbeNote(noteKnappAbrunden);
        assertEquals(4.0, note);

    }

}
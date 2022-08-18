package spa.simone;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import spa.simone.Persona;

public class PersonaTest {

  private Persona persona = null;

  @BeforeEach
  void init() {
    this.persona = new Persona();
  }

  @Test
  void testGetCodiceFiscale() {
    String codiceFiscale = "abc";
    this.persona.setCodiceFiscale(codiceFiscale);
    assertEquals(this.persona.getCodiceFiscale(), codiceFiscale);
  }
}

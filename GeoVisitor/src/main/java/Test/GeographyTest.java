package Test;

import main.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeographyTest {

    @Test
    void deveExibirPaisJSON() {
        Pais pais = new Pais("Brasil", "BR");

        JSONVisitor visitor = new JSONVisitor();
        assertEquals("Pais{nome='Brasil', abreviacao='BR'}", visitor.visit(pais));
    }

    @Test
    void deveExibirPaisCSV() {
    	Pais pais = new Pais("Brasil", "BR");

        CSVVisitor visitor = new CSVVisitor();
        assertEquals("nome, abreviacao\n'Brasil', 'BR'", visitor.visit(pais));
    }

    @Test
    void deveExibirEstadoJSON() {
    	Estado estado = new Estado(new Pais("Brasil", "BR"), "Minas Gerais", "MG");

        JSONVisitor visitor = new JSONVisitor();
        assertEquals("Estado{nome='Minas Gerais', abreviacao='MG', Pais{nome='Brasil', abreviacao='BR'}}", visitor.visit(estado));
    }
    
    @Test
    void deveExibirEstadoCSV() {
    	Estado estado = new Estado(new Pais("Brasil", "BR"), "Minas Gerais", "MG");

        CSVVisitor visitor = new CSVVisitor();
        assertEquals("nome, abreviacao, abreviacao_pais,\n'Minas Gerais', 'MG', 'BR'", visitor.visit(estado));
    }
  
    @Test
    void deveExibirCidadeJSON() {
    	Cidade cidade = new Cidade("Juiz de Fora", new Estado(new Pais("Brasil", "BR"), "Minas Gerais", "MG"));

        JSONVisitor visitor = new JSONVisitor();
        assertEquals("Cidade{nome='Juiz de Fora', Estado{nome='Minas Gerais', abreviacao='MG', Pais{nome='Brasil', abreviacao='BR'}}}", visitor.visit(cidade));
    }
      
    @Test
    void deveExibirCidadeCSV() {
    	Cidade cidade = new Cidade("Juiz de Fora", new Estado(new Pais("Brasil", "BR"), "Minas Gerais", "MG"));
        CSVVisitor visitor = new CSVVisitor();
        assertEquals("nome, abreviacao_estado, abreviacao_pais,\n'Juiz de Fora', 'MG', 'BR'", visitor.visit(cidade));
    }
    
    @Test
    void deveExibirPaisXML() {
        Pais pais = new Pais("Brasil", "BR");

        XMLVisitor visitor = new XMLVisitor();
        assertEquals("<Pais><nome>Brasil</nome><abreviacao>BR</abreviacao></Pais>", visitor.visit(pais));
    }

    @Test
    void deveExibirEstadoXML() {
    	Estado estado = new Estado(new Pais("Brasil", "BR"), "Minas Gerais", "MG");

    	XMLVisitor visitor = new XMLVisitor();
        assertEquals("<Estado><nome>Minas Gerais</nome><abreviacao>MG</abreviacao><Pais><nome>Brasil</nome><abreviacao>BR</abreviacao></Pais></Estado>", visitor.visit(estado));
    }
    
    @Test
    void deveExibirCidadeXML() {
    	Cidade cidade = new Cidade("Juiz de Fora", new Estado(new Pais("Brasil", "BR"), "Minas Gerais", "MG"));
    	XMLVisitor visitor = new XMLVisitor();
        assertEquals("<Cidade><nome>Juiz de Fora</nome><Estado><nome>Minas Gerais</nome><abreviacao>MG</abreviacao><Pais><nome>Brasil</nome><abreviacao>BR</abreviacao></Pais></Estado></Cidade>", visitor.visit(cidade));
    }
}
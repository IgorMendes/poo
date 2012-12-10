package br.ufpb.agenda;
import static org.junit.Assert.*;

import java.util.Iterator;
import org.junit.Before;
import org.junit.Test;

public class AgendaTest {

	AgendaList agenda;

	@Before
	public void setUp() throws Exception {
		agenda = new AgendaList();
	}
	
	@Test
	public void testaAdicionaContato() {
		try {
			agenda.pesquisarContato("Pedro");
			fail("Deveria Lançar exceção");
		} catch (ContatoInexistenteException e) {
			// OK
		}
		agenda.adicionarContato("Pedro", "111");
		try {
			Contato c = agenda.pesquisarContato("Pedro");
			assertTrue(c.getTel().equals("111")&& c.getNome().equals("Pedro"));
		} catch (ContatoInexistenteException e) {
			fail("Exceção não deveria ser lançada");
		}

	}

	@Test
	public void testaPesquisaContatos() {
		agenda.adicionarContato("B1", "222");
		agenda.adicionarContato("B2", "333");
		try {
			Contato c1 = agenda.pesquisarContato("B1");
			Contato c2 = agenda.pesquisarContato("B2");
			assertEquals("222", c1.getTel());
			assertEquals("333", c2.getTel());
		} catch (ContatoInexistenteException e) {
			fail("Não deveria lançar a exceção");
		}
		try {
			Contato c3 = agenda.pesquisarContato("B3");
			fail("Deveria ter lançado a exceção!");
		} catch (ContatoInexistenteException e) {
			// OK
		}

	}

	@Test
	public void testaContatosOrdenados() {
		Iterator<Contato> contatosIt = agenda.getContatosOrdenados();
		assertTrue(contatosIt.hasNext() == false);
		assertFalse(contatosIt.hasNext());
		agenda.adicionarContato("José", "555");
		agenda.adicionarContato("Carlos", "444");
		contatosIt = agenda.getContatosOrdenados();
		assertTrue(contatosIt.hasNext());
		Contato c1 = contatosIt.next();
		assertEquals("Carlos", c1.getNome());
		assertEquals("444", c1.getTel());

		assertTrue(contatosIt.hasNext());
		Contato c2 = contatosIt.next();
		assertEquals("José", c2.getNome());
		assertEquals("555", c2.getTel());

	}

}

package br.ufpb.agenda;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AgendaMap implements AgendaIF {

	private Map<String, Contato> contatosMap;
	private GravadorDeContatos gravador;

	public AgendaMap() {
		this.gravador = new GravadorDeContatos();
	}

	public void recuperaContatos() {

		try {
			contatosMap = gravador.leContatosMap();
		} catch (IOException e) {
			System.err.println(e.getMessage());
			contatosMap = new HashMap<String, Contato>();

		}
	}

	public void guardaContatos() {
		try {
			gravador.gravaContatosMap(contatosMap);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	public void adicionarContato(String nome, String tel) {
		this.contatosMap.put(nome, new Contato(nome, tel));
		System.out.println("Contato Adicionado" + nome);
	}

	public void removerContato(String nomeContato)
			throws ContatoInexistenteException {
		if (!(this.contatosMap.containsKey(nomeContato))) {
			System.out.println("Contato nao encontrado");
		}
		this.contatosMap.remove(nomeContato);
		System.out.println("Contato Removido: " + nomeContato);

	}

	public Contato pesquisarContato(String nomeContato)
			throws ContatoInexistenteException {
		if (!(this.contatosMap.containsKey(nomeContato))) {
			throw new ContatoInexistenteException("Contato nao cadastrado: "
					+ nomeContato);
		}
		return this.contatosMap.get(nomeContato);
	}


	public Collection<Contato> getContatos() {
		Collection<Contato> c = new ArrayList<Contato>();
		c.addAll(this.contatosMap.values());
		return c;
	}


	public Iterator<Contato> getContatosOrdenados(){
		List<Contato> c = new ArrayList<Contato>();
		c.addAll(this.contatosMap.values());
		Collections.sort(c);
		return c.iterator();
	}

}

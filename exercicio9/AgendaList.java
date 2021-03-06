package br.ufpb.agenda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AgendaList implements AgendaIF {

	private List<Contato> contatos;

	public AgendaList() {
		this.contatos = new ArrayList<Contato>();
	}

	public void adicionarContato(String nome, String tel) {

		this.contatos.add(new Contato(nome, tel));
	}

	public void removerContato(String nomeContato)
			throws ContatoInexistenteException {
		for (Contato aux : contatos) {
			if (aux.getNome().equals(nomeContato)) {
				contatos.remove(aux);
			}
		}
		throw new ContatoInexistenteException("Contato nao Cadastrado : "
				+ nomeContato);
	}

	public Contato pesquisarContato(String nomeContato)
			throws ContatoInexistenteException {

		for (Contato aux : contatos) {
			if (aux.getNome().equals(nomeContato)) {
				return aux;
			}
		}
		throw new ContatoInexistenteException("Contato nao Cadastrado : "
				+ nomeContato);
	}


	public Collection<Contato> getContatos() {
		Collection<Contato> c = new ArrayList<Contato>();
		c.addAll(this.contatos);
		return c;
	}

	
	public Iterator<Contato> getContatosOrdenados() {
		List<Contato> c = new ArrayList<Contato>();
		c.addAll(this.contatos);
		Collections.sort(c);
		
		return c.iterator();
	}

}

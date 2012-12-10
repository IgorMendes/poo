package br.ufpb.agenda;

public class Contato implements Comparable<Contato>{

	private String nome;
	private String tel;

	public Contato() {
		this(" ", " ");
	}

	public Contato(String nome, String tel) {
		this.nome = nome;
		this.tel = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}


	public int compareTo(Contato c) {
		
		return this.nome.compareTo(c.getNome());
	}

}

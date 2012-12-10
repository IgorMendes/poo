package br.ufpb.agenda;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;

public class GravadorDeContatos {

	public List<Contato> leContatosList() throws IOException {

		ObjectInputStream entrada = null;
		try {
			new ObjectInputStream(new FileInputStream("contatosList.txt"));
			return (List<Contato>) entrada.readObject();

		} catch (FileNotFoundException e) {
			throw new IOException("Arquivo nao encontrado", e);
		} catch (IOException e) {
			throw e;
		} catch (ClassNotFoundException e) {
			throw new IOException("Classe nao existe", e);
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
	}

	public void gravaContatoList(List<Contato> contatos) throws IOException {

		ObjectOutputStream saida = null;
		try {
			saida = new ObjectOutputStream(new FileOutputStream(
					"contatosList.txt"));
			saida.writeObject(contatos);
		} catch (FileNotFoundException e) {
			throw new IOException("Arquivo nao encontrado", e);
		} catch (IOException e) {
			throw e;
		} finally {
			if (saida != null) {
				saida.close();
			}
		}
	}

	public Map<String, Contato> leContatosMap() throws IOException {

		ObjectInputStream entrada = null;
		try {
			new ObjectInputStream(new FileInputStream("contatosMap.txt"));
			return (Map<String, Contato>) entrada.readObject();

		} catch (FileNotFoundException e) {
			throw new IOException("Arquivo nao encontrado", e);
		} catch (IOException e) {
			throw e;
		} catch (ClassNotFoundException e) {
			throw new IOException("Classe nao existe", e);
		} finally {
			if (entrada != null) {
				entrada.close();
			}
		}
	}

	public void gravaContatosMap(Map<String, Contato> contatos)
			throws IOException {

		ObjectOutputStream saida = null;
		try {
			saida = new ObjectOutputStream(new FileOutputStream(
					"contatosMap.txt"));
			saida.writeObject(contatos);
		} catch (FileNotFoundException e) {
			throw new IOException("Arquivo nao encontrado", e);
		} catch (IOException e) {
			throw e;
		} finally {
			if (saida != null) {
				saida.close();
			}
		}
	}
}

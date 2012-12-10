package br.ufpb.agenda;

import javax.swing.*;

public class TesteAgenda {

	public static void main(String[] args) {

		String tipoDaAgenda = JOptionPane
				.showInputDialog("Selecione Tipo da Agenda: 1 = MAP / 2 = LIST");
		int agendaSelecionada = Integer.parseInt(tipoDaAgenda);

		AgendaIF agenda;

		if (agendaSelecionada == 1) {
			agenda = new AgendaList();
		} else {
			agenda = new AgendaMap();
		}
		int opcao = Integer
				.parseInt(JOptionPane
						.showInputDialog("OPÇÕES: 1 = Adicionar / 2 = Remover / 3 = Pesquisar / 4 = Sair"));
		do {
			switch (opcao) {
			case 1:
				agenda.adicionarContato(
						JOptionPane.showInputDialog("Digite Nome: "),
						JOptionPane.showInputDialog("Digite Telefone: "));
				break;
			case 2:
				try {
					agenda.removerContato(JOptionPane
							.showInputDialog("Digite o nome do contato à ser removido"));
				} catch (ContatoInexistenteException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				break;
			case 3:
				try {
					Contato c = agenda.pesquisarContato(JOptionPane
							.showInputDialog("Digite o nome do contato: "));
					JOptionPane.showMessageDialog(null, "Nome: " + c.getNome()
							+ "Telefone: " + c.getTel());
				} catch (ContatoInexistenteException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				break;
			}
			opcao = Integer
					.parseInt(JOptionPane
							.showInputDialog("OPÇÕES: 1 = Adicionar / 2 = Remover / 3 = Pesquisar / 4 = Sair"));
		} while (opcao < 4);
	}
}
package Vetores;

import java.util.ArrayList;

public class PessoaListDAO implements PessoaDAO {
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	@Override
	public void addPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		pessoas.add(p);
	}

	@Override
	public void removerPessoa(Pessoa p) {
		// TODO Auto-generated method stub
		pessoas.remove(p);
	}

	@Override
	public ArrayList<String> obterNomesTodos() {
		ArrayList<String> nomes = new ArrayList<String>();
		for (Pessoa p : pessoas) {
			nomes.add(p.getNome());
		}
		return nomes;
	}

	@Override
	public ArrayList<Integer> obterIdadeTodos() {
		ArrayList<Integer> nomes = new ArrayList<Integer>();
		for (Pessoa p : pessoas) {
			nomes.add(p.getIdade());
		}
		return nomes;
	}

	@Override
	public Pessoa obterPessoaJovem() {
		Pessoa pessoa = new Pessoa();
		for (Pessoa p : pessoas) {
			for (Pessoa e : pessoas) {
				if (p.getIdade() > e.getIdade()) {
					pessoa = p;
				}
			}
		}

		return pessoa;

	}

}

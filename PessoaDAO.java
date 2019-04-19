package Vetores;

import java.util.ArrayList;

public interface PessoaDAO {
	public void addPessoa(Pessoa p);
	public void removerPessoa(Pessoa p);
	public ArrayList<String> obterNomesTodos();
	public ArrayList<Integer> obterIdadeTodos();
	public Pessoa obterPessoaJovem();

}

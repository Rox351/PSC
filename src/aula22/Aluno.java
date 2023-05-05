package aula22;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Aluno implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final String NOMEARQUIVO = "aluno.txt";

	private Integer id;
	private String nome;
	private String curso;

	public Aluno(Integer id, String nome, String curso) {
		this.id = id;
		this.nome = nome;
		this.curso = curso;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public void salvar() throws FileNotFoundException, IOException {
		ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream(NOMEARQUIVO));
		
		arquivo.writeObject(this);
		arquivo.close();
		
	}
	
	public void pesquisar(Integer id) throws IOException {
		ObjectOutputStream arquivo = new ObjectOutputStream(new FileOutputStream(NOMEARQUIVO));
	}

	public void pesquisar() {

	}

}

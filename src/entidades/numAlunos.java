package entidades;

public class numAlunos {
	private String curso;
	private Integer aluno;
	
	public numAlunos(String curso, Integer aluno) {
		this.curso = curso;
		this.aluno = aluno;
	}

	public String getCurso() {
		return curso;
	}

	public void setCursoA(String curso) {
		this.curso = curso;
	}
	
	public Integer getAluno() {
		return aluno;
	}

	public void setAluno(Integer aluno) {
		this.aluno = aluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aluno == null) ? 0 : aluno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		numAlunos other = (numAlunos) obj;
		if (aluno == null) {
			if (other.aluno != null)
				return false;
		} else if (!aluno.equals(other.aluno))
			return false;
		return true;
	}

	
}


public class Aluno {
	
	private int matricula;
	private String nome;
	private Turma turma;
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	public void mostrarAluno(){
		System.out.println("Aluno: "+nome);
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Turma: "+getTurma().getNome());
		System.out.println("Turno: "+getTurma().getTurno());
	}
	
	

}

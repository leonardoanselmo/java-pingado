
public class Aplicacao {

	public static void main(String[] args) {
		
		Turma objTurma = new Turma();
		
		objTurma.setNome("Engenharia de Software");
		objTurma.setTurno("manhã");
		
		Turma objTurma1 = new Turma();
		
		objTurma1.setNome("Arquitetura");
		objTurma1.setTurno("noite");		
		
		Aluno objAluno1 = new Aluno();
				
		objAluno1.setMatricula(1210);
		objAluno1.setNome("Leonardo Anselmo");
		objAluno1.setTurma(objTurma);
		
		objAluno1.mostrarAluno();
		
		Aluno objAluno2 = new Aluno();
		
		objAluno2.setMatricula(5240);
		objAluno2.setNome("Patricia Anselmo");
		objAluno2.setTurma(objTurma1);
		
		objAluno2.mostrarAluno();	
		
	}

}

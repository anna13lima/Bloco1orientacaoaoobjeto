package Atividade4;

public class Funcionario {
	String nome;
	int anosTrabalhados;
	double salario;
	boolean estagio;
	
	public void funcao()
	{
		if(this.estagio==true)
			System.out.println("funcionario  � estagiario");
		else
			System.out.println("funcionario n�o � estagiario ");
	}
	
	public void estagio()
	{
		this.estagio=true;
	}
	public void outros()
	{
		this.estagio=false;
	}
	
	public void estado ()
	{
	System.out.println("nome : "+ this.nome);
	System.out.println("Anos trabalhados: "+ this.anosTrabalhados);
	System.out.println("valor do salario: "+this.salario);
	System.out.println("o funcionario � estagiario  : "+this.estagio);
	}

}

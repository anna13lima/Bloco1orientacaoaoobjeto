package Atividade4;

public class Funcionario {
	String nome;
	int anosTrabalhados;
	double salario;
	boolean estagio;
	
	public void funcao()
	{
		if(this.estagio==true)
			System.out.println("funcionario  é estagiario");
		else
			System.out.println("funcionario não é estagiario ");
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
	System.out.println("o funcionario é estagiario  : "+this.estagio);
	}

}

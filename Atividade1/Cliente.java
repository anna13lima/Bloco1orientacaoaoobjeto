package Atividade1;

public class Cliente {
	
	String nome;
	int idade;
	double altura;
	boolean vegetariano;
	
	public void comer() 
	{
		if(this.vegetariano== true)
			System.out.println("cliente vegetariano");
		else
			System.out.println("cliente não vegetariano");
	}
	
	public void vegetariano()
	{
		this.vegetariano=true;
	}
	
	public void carnivoro ()
	{
		this.vegetariano=false;
	}
	
	public void estado ()
	{
	System.out.println("nome: "+ this.nome);
	System.out.println("idade: "+ this.idade);
	System.out.println("altura : "+this.altura);
	System.out.println("vegetariano: "+this.vegetariano);
	}


}

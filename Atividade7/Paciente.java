package Atividade7;

public class Paciente {
	String nomedopaciente;
	int idade;
	double peso;
	boolean apto;
	
	public Paciente()
	{
		this.idade= 25;
		this.peso= 56.5;
		this.apto=true;
		
	}
	
	public void consulta()
	{
		if(this.apto==true)
			System.out.println("Paciente apto ao trabalho");
		else
			System.out.println("Paciente não esta apto ao trabalho ");
	}
	
	public void apto()
	{
		this.apto=true;
	}
	public void repouso()
	{
		this.apto=false;
	}
	
	public void estado ()
	{
	System.out.println("nome do paciente: "+ this.nomedopaciente);
	System.out.println("idade: "+ this.idade);
	System.out.println("peso: "+this.peso);
	System.out.println("retorno ao trabalho : "+this.apto);
	}
}

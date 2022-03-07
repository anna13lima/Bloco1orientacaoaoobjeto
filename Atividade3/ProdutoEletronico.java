package Atividade3;

public class ProdutoEletronico {
	
	String nomedoapp;
	int versao;
	double memoria;
	boolean androide;
	
	public void baixar()
	{
		if(this.androide==true)
			System.out.println("baixando ...");
		else
			System.out.println("ERRO: sistema operacional incompativel  ");
	}
	
	public void androide()
	{
		this.androide =true;
	}
	public void outros()
	{
		this.androide =false;
	}
	
	public void estado ()
	{
	System.out.println("nome do app: "+ this.nomedoapp);
	System.out.println("versão: "+ this.versao);
	System.out.println("espaço ocupado : "+this.memoria);
	System.out.println("sistema operacional : "+this.androide);
	}

}

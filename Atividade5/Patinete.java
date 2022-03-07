package Atividade5;

public class Patinete {
	String marca ;
	int rodas;
	double modelo;
	boolean profissional;
	
	public void atividade()
	{
		if(this.profissional==true)
			System.out.println("Patinete para uso profissional");
		else
			System.out.println("Patinete para atividades recreativas  ");
	}
	
	public void profissional()
	{
		this.profissional=true;
	}
	public void recreativo()
	{
		this.profissional=false;
	}
	
	public void estado ()
	{
	System.out.println("Marca: "+ this.marca);
	System.out.println("quantas rodas: "+ this.rodas);
	System.out.println("modelo: "+this.modelo);
	System.out.println("profissional  : "+this.profissional);
	}

}

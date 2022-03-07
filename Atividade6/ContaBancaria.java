package Atividade6;

public class ContaBancaria {
	
	String nomedocliente;
	int agencia;
	double saldo;
	boolean corrente ;
	
	public ContaBancaria()
	{
		this.agencia= 001;
		this.saldo= 1.555;
		this.corrente=true;
		
	}
	
	public void extrato()
	{
		if(this.corrente==true)
			System.out.println("cliente correntista");
		else
			System.out.println("cliente não correntista ");
	}
	
	public void conta()
	{
		this.corrente=true;
	}
	public void corrente()
	{
		this.corrente=false;
	}
	
	public void estado ()
	{
	System.out.println("nome do cliente: "+ this.nomedocliente);
	System.out.println("agencia: "+ this.agencia);
	System.out.println("saldo: "+this.saldo);
	System.out.println("cliente correntista  : "+this.corrente);
	}

}

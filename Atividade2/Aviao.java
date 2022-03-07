package Atividade2;

public class Aviao {
	
	String nomedoAviao;
	int passageiros;
	double combustivel;
	boolean lotacao;
	
	public void embarque()
	{
		if(this.lotacao==true)
			System.out.println("avião atigiu sua lotação maxima");
		else
			System.out.println("ainda ha assentos vagos ");
	}
	
	public void vago()
	{
		this.lotacao=true;
	}
	public void lotado()
	{
		this.lotacao=false;
	}
	
	public void estado ()
	{
	System.out.println("nome do Avião: "+ this.nomedoAviao);
	System.out.println("passageiros: "+ this.passageiros);
	System.out.println("quantos litros de combustivel: "+this.combustivel);
	System.out.println("assentos : "+this.lotacao);
	}
	

}

public class Credit{
	//variavel que armazena o crédito
	private int credito_centavo;
	
	//construtor padrão da classe
	public Credit(){
		this.credito_centavo = 1000;
	}

	//construtor parametrizado da Classe
	public Credit(int credito_centavo_recebido){
		this.credito_centavo = credito_centavo_recebido;
	}
	
	//metodo de acesso para o crédito
	public int getCreditoCentavo(){
		return this.credito_centavo;
	}

	//metodo modificador para o crédito
	public void setCreditoCentavo(int credito_centavo_recebido){
		this.credito_centavo = credito_centavo_recebido;
	}

	//método para adicionar crédito
	public void topUp(int credito_centavo_recebido){
		this.credito_centavo += credito_centavo_recebido;
	}

	//método para subtrair crédito
	public void spend(int credito_centavo_recebido){
		this.credito_centavo -= credito_centavo_recebido;
	}
}

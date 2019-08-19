package activity;

public class EntryPoint {

	public static void main(String[] args) {
		
		//Alguns atributos da classe Pessoa
		Pessoa muryllo = new Pessoa();
		muryllo.setAltura(1.67F);
		muryllo.setBatimentosPorMinuto((short)100);
		muryllo.setCidade("Recife");
		muryllo.setEstado("Pernambuco");
		muryllo.setPais("Brasil");
		muryllo.setConjuge(null);
		muryllo.setCorDaPele(CorPele.BRANCO); //ou pardo
		muryllo.setCPF(new short[] {120, 254, 954, 39});
		muryllo.setRG(new short[] {9, 277, 541});
		muryllo.setDoen�as(null);
		muryllo.setCrimes(null);
		muryllo.setEmail("muryllopimenta@gmail.com");
		muryllo.setTelefone(new int[] {55, 81, 9, 9645, 7021});
		muryllo.setName("Muryllo");
		muryllo.setGradua�ao(true);
		muryllo.setEnsinoMedio(true);
		muryllo.setEnsinoFundamental(true);
		muryllo.setEstadoCivil(false);
		muryllo.setFilhos(null);
		Pessoa Pai = new Pessoa();
		Pai.setName("Ailson Pimenta");
		muryllo.setPai(Pai);
		Pessoa Mae = new Pessoa();
		Mae.setName("L�gia Oliveira");
		muryllo.setMae(Mae);
		muryllo.setIdade(18);
		muryllo.setIdiomas(new String[] {"Portugu�s", "Ingl�s"});
		muryllo.setPressaoArterial(13/8);
		muryllo.setEndereco("Rua Professor Jos� Vicente, Ipsep");
		muryllo.setIMC(0);
		muryllo.setSalario(0);
		
		//M�todos da classe pessoa
		muryllo.Respirar();
		muryllo.Pulsar();
		muryllo.Andar();
		muryllo.VirarEsquerda();
		muryllo.VirarDireita();
		muryllo.Correr();
		muryllo.Espirrar();
		muryllo.Tossir();
		muryllo.Urinar();
		muryllo.Defecar();
		muryllo.Beber();
		muryllo.Comer();
		muryllo.Ler();
		muryllo.Assistir();
		muryllo.Dan�ar();
		muryllo.Pular();
		muryllo.Agachar();
		muryllo.OlharParaCima();
		muryllo.Cuspir();
		muryllo.Falar("A soma dos quadrados dos catetos � igual ao quadrado da Hipotenusa.");
		muryllo.Sussurrar("Fala baixo!");
		muryllo.Dirigir();
		muryllo.Cozinhar();
		muryllo.Socar();
		muryllo.Empurrar();
		muryllo.Chorar();
		
		LaraCroft lara = new LaraCroft(); //Que tamb�m � uma pessoa, logo herda todas as caracter�sticas de uma pessoa.
		lara.setName("Alicia Vikander");
		lara.setNomePersonagem("Lara Croft");
		lara.setNomeFilme("Tomb Raider");
		lara.setHabilidades(new String[] {"Habilidade com armas de fogo",
				"Habilidade em lutas", "Flexibilidade", "Arco e flechas"});
		lara.setExperienciaCombate("Na maior parte das apari��es, Lara exibe um n�vel excepcionalmente elevado na habilidade de luta, particularmente com armas de fogo. Em Legend, por exemplo, ela � capaz de lutar sozinha em seu caminho contra um pequeno ex�rcito de mercen�rios. Como ela atingui tal profici�ncia, n�o � explicado nos games. No filme Lara Croft: Tomb Raider, uma fotografia pode ser vista mostrando Lara no centro de uma unidade militar. Isto, junto com outras frases dos filmes (\"Nascidos em Riqueza. Limpos pela Elite. Treinados para Combater.\"), sugere que ela pode ter tido experi�ncia militar formal. Por�m, nenhum dos jogos menciona ou indica servi�o militar, tornando esta explica��o exclusiva para o passado de Lara nos filmes. Mas no jogo legend mostra sua roupa militar na inglaterra como sendo das for�as especias inglesas a SAS de onde vem o seu refor�o de ultima hora.");
		lara.setRoupa("blusa sem manga azul esverdeado, shorts marrons, botas, meias brancas, luvas sem dedos, uma pequena mochila e um cinto utilit�rio.");
		lara.setInterprete("Alicia Vikander");
		lara.setPersonalidade("Lara � retratada constantemente como uma pessoa altamente confiante, independente e teimosa do signo de aqu�rio. (Data de nascimento: 14 de fevereiro de 1993) tem muita energia e odeia ficar parada. Dos principais generos musical original que ela adora e�Eletro House e Rap. ela tamb�m � muito corajosa, mostrando raramente sinal de medo em muitas situa��es perigosas ou letais.");
		lara.setPassado("Na primeira continuidade, o manual do game Tomb Raider contava sobre o nascimento de Lara para o Lord Henshingly Croft e como ela foi criada como uma aristocrata cercada de riqueza e luxo. Tamb�m explica-se como, aos 21 anos de idade, ela foi a �nica sobrevivente de um naufr�gio pr�ximo � costa do Jap�o e foi obrigada a confiar no seu ju�zo para permanecer viva. O incidente a mudou e a inspirou a abandonar sua vida de conforto e seguran�a em favor de viajar ao redor do mundo sozinha.");
		lara.setEquipamentos(new String[] {"mochila", "faca", "arco e flechas"});
	
		//M�todos de Lara Croft
		lara.AtirarFlecha();
		lara.AtirarPedra();
		lara.Lutar();
		lara.CurarFerida();
		lara.SacarArmas();
		lara.PendurarEmObjeto();
		lara.EscalarTerreno();
		
	}

}

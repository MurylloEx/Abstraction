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
		muryllo.setDoenças(null);
		muryllo.setCrimes(null);
		muryllo.setEmail("muryllopimenta@gmail.com");
		muryllo.setTelefone(new int[] {55, 81, 9, 9645, 7021});
		muryllo.setName("Muryllo");
		muryllo.setGraduaçao(true);
		muryllo.setEnsinoMedio(true);
		muryllo.setEnsinoFundamental(true);
		muryllo.setEstadoCivil(false);
		muryllo.setFilhos(null);
		Pessoa Pai = new Pessoa();
		Pai.setName("Ailson Pimenta");
		muryllo.setPai(Pai);
		Pessoa Mae = new Pessoa();
		Mae.setName("Lígia Oliveira");
		muryllo.setMae(Mae);
		muryllo.setIdade(18);
		muryllo.setIdiomas(new String[] {"Português", "Inglês"});
		muryllo.setPressaoArterial(13/8);
		muryllo.setEndereco("Rua Professor José Vicente, Ipsep");
		muryllo.setIMC(0);
		muryllo.setSalario(0);
		
		//Métodos da classe pessoa
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
		muryllo.Dançar();
		muryllo.Pular();
		muryllo.Agachar();
		muryllo.OlharParaCima();
		muryllo.Cuspir();
		muryllo.Falar("A soma dos quadrados dos catetos é igual ao quadrado da Hipotenusa.");
		muryllo.Sussurrar("Fala baixo!");
		muryllo.Dirigir();
		muryllo.Cozinhar();
		muryllo.Socar();
		muryllo.Empurrar();
		muryllo.Chorar();
		
		LaraCroft lara = new LaraCroft(); //Que também é uma pessoa, logo herda todas as características de uma pessoa.
		lara.setName("Alicia Vikander");
		lara.setNomePersonagem("Lara Croft");
		lara.setNomeFilme("Tomb Raider");
		lara.setHabilidades(new String[] {"Habilidade com armas de fogo",
				"Habilidade em lutas", "Flexibilidade", "Arco e flechas"});
		lara.setExperienciaCombate("Na maior parte das aparições, Lara exibe um nível excepcionalmente elevado na habilidade de luta, particularmente com armas de fogo. Em Legend, por exemplo, ela é capaz de lutar sozinha em seu caminho contra um pequeno exército de mercenários. Como ela atingui tal proficiência, não é explicado nos games. No filme Lara Croft: Tomb Raider, uma fotografia pode ser vista mostrando Lara no centro de uma unidade militar. Isto, junto com outras frases dos filmes (\"Nascidos em Riqueza. Limpos pela Elite. Treinados para Combater.\"), sugere que ela pode ter tido experiência militar formal. Porém, nenhum dos jogos menciona ou indica serviço militar, tornando esta explicação exclusiva para o passado de Lara nos filmes. Mas no jogo legend mostra sua roupa militar na inglaterra como sendo das forças especias inglesas a SAS de onde vem o seu reforço de ultima hora.");
		lara.setRoupa("blusa sem manga azul esverdeado, shorts marrons, botas, meias brancas, luvas sem dedos, uma pequena mochila e um cinto utilitário.");
		lara.setInterprete("Alicia Vikander");
		lara.setPersonalidade("Lara é retratada constantemente como uma pessoa altamente confiante, independente e teimosa do signo de aquário. (Data de nascimento: 14 de fevereiro de 1993) tem muita energia e odeia ficar parada. Dos principais generos musical original que ela adora e´Eletro House e Rap. ela também é muito corajosa, mostrando raramente sinal de medo em muitas situações perigosas ou letais.");
		lara.setPassado("Na primeira continuidade, o manual do game Tomb Raider contava sobre o nascimento de Lara para o Lord Henshingly Croft e como ela foi criada como uma aristocrata cercada de riqueza e luxo. Também explica-se como, aos 21 anos de idade, ela foi a única sobrevivente de um naufrágio próximo à costa do Japão e foi obrigada a confiar no seu juízo para permanecer viva. O incidente a mudou e a inspirou a abandonar sua vida de conforto e segurança em favor de viajar ao redor do mundo sozinha.");
		lara.setEquipamentos(new String[] {"mochila", "faca", "arco e flechas"});
	
		//Métodos de Lara Croft
		lara.AtirarFlecha();
		lara.AtirarPedra();
		lara.Lutar();
		lara.CurarFerida();
		lara.SacarArmas();
		lara.PendurarEmObjeto();
		lara.EscalarTerreno();
		
	}

}

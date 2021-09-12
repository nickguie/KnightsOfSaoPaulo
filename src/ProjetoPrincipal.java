import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ProjetoPrincipal {

  //VARIAVEIS GLOBAIS
	static Scanner ler = new Scanner(System.in);
	static Random random = new Random();
	static int adv = 0;
	//CONTADOR DO BALANCEADOR
  static int contador = 0;
	static ArrayList<String> cenas = new ArrayList<String>();
	static ArrayList<String> itens = new ArrayList<String>();
	static ArrayList<String> inventory = new ArrayList<String>();
	
	public static void main(String[] args) {
		carregarCenas();
		carregaritens();
    apresentacao();
    dicas();
		corredor();
	}
	
  static void apresentacao(){
    System.out.printf("Davi Pereira era um menino negro de 11 anos que morava com seus pais e seus dois irmãos mais novos em uma casa alugada em uma comunidade na região de Santo Amaro, zona sul da cidade de São Paulo. \n\nA família de classe baixa de Davi era sustentada apenas pelo pouco dinheiro que o pai conseguia vendendo doces nordestinos nos faróis do centro da cidade.\n\nComo a mãe era muito ocupada cuidando dos filhos, o pai trabalhava o dia todo, saía as 05 da manhã e retornava por volta das 11 horas da noite, Davi mal tinha tempo de aproveitar a presença do pai, mas o amava e admirava muito! \n\nTodas as noites, o Davi se levantava da cama sorrateiramente, tentando não acordar os irmãos e mãe, para ter a oportunidade de dar um abraço no pai e os dois assistirem o desenho animado que eles amavam, Os Cavaleiros do Zodíaco e haviam prometido um para o outro que não iriam sossegar enquanto não assistissem até o último episódio. Semanalmente um novo episódio era lançado na TV Manchete de televisões e o pai guardava as moedinhas que sobravam para comprar o DVD pirata que vendia na feira e, juntos, os dois conseguiam assistir ao desenho por uma televisão de tubo doada por uma família de amigos próximos. \n\nEm uma das noites em que o Davi se levantou, ele notou que já eram 23:30 e o pai ainda não havia retornado, então decidiu aguardá-lo na sala, onde não demorou muito para cair no sono. Assim que ele acordou, pela manhã, notou que sua mãe estava conversando, aos prantos, com uma moradora do bairro, sem entender muito bem a situação, Davi foi até a porta para ver o que estava acontecendo e se deparou com o pai no chão da viela onde moravam com perfurações no peito. O pai de Davi havia sido morto em uma operação policial que ocorreu naquela noite, quando foi confundido com um dos traficantes que residiam na região. O garoto ficou traumatizado com a situação, meses se passaram e a imagem do pai não saía de sua mente. A mãe, sem o sustento que o pai trazia, teve que vender a televisão para dar comida aos irmãos e pagar as contas. O único entretenimento que o Davi tinha se foi e, desde então, ele nunca soube como a história de “Os Cavaleiros do Zodíaco” terminava. \n\n~ Dia 02 de fevereiro de 1995 – Data em que seria transmitido o último episódio do desenho da televisão. \n\nSeguindo a promessa que havia feito ao seu pai, Davi faria o possível e o impossível para assistir ao desenho e ele sabia que havia uma televisão na Sala de TV da escola, porém ela vivia fechada. Davi precisa encontrar um modo de entrar na sala para poder cumprir sua promessa.\n\nAjude-o a encontrar a Chave da Sala de TV sem ser visto pelo professor.\n");
  }

  static void fim(){
    System.out.printf("... Apesar de ter tomado uma ação fora das regras da escola, Davi conseguiu chegar até a sala de TV a tempo de assistir o último episódio de “Os Cavaleiros do Zodíaco”, cumprindo a promessa que havia feito para seu pai. A saudade persistirá para todo o sempre, mas a lembrança que o desenho lhe trouxe conseguiu consolá-lo e confortar seu pequeno coração. Davi se lembrou das noites em que passava assistindo com seu pai, das risadas, das brincadeiras e do cochilo após o fim de cada episódio.\n\nA história contada neste jogo é fictícia, mas transmite a realidade de muitas pessoas que perdem seus pais quando criança e das inúmeras pessoas que são assassinadas diariamente pelo tráfico e por balas perdidas nas comunidades brasileiras.\n\nEspero que tenham gostado!\n\n#VidasNegrasImportam\n");
  }

  static void dicas(){
    System.out.printf("\nDICAS:\n- NÃO TENTE ENTRAR NA SALA DE TV SEM A CHAVE\n- NÃO TENTE ABRIR O ARMARIO DA SALA SE O PROFESSOR ESTIVER PRESENTE.\n- NÃO TENTE SAIR DA SALA SE O  PROFESSOR ESTIVER PRESENTE.\n\n");
  }

	static void infos() {
		System.out.println("ADVERTÊNCIAS: " + adv);
		exibeInventario();
		exibeCenas();
	}
	
  //FUNCAO PARA BALANCEAR O STATUS DO PROFESSOR
	static int balancer(int c) {
		if(c == 1) {
			return 1;  
		}
		else if(c > 1) {
			return 2;
		}
		return 0;
	}
	
	static int carregarAlunos() {

		return random.nextInt(15);
		
	}
	
	static String carregarProfessor() {
		int b = balancer(contador);
		System.out.println(contador);
		if(b > 1) {
			contador = 0;
			return "NÃO";
		}
		
		if(b == 1) {
			int v = random.nextInt(4);
			if(v == 1 || v == 2 || v == 3) {
				contador = 0;
				return "NÃO";
			}
			else {
				contador++;
				return "SIM";
			}
		}
		
		int v = random.nextInt(4);
		if(v == 1 || v == 2 || v == 3) {
			contador++;
			return "SIM";
		}
		else {
			contador = 0; 
			return "NÃO";
		}
		
	}

  static void luta(){
    System.out.println("--------------------");
    System.out.println("AI AI, POR FAVOR ME AJUDE. O JORGE ESTÁ ME BATENDO DE NOVO...");
    System.out.println("--------------------");
		System.out.println("OPÇÔES DE LUTA");
		System.out.println("[1] - BATER NO JORGE");
		System.out.println("[2] - CHAMAR O INSPETOR");
		System.out.println("[3] - IGNORAR");
		System.out.println("--------------------");
    int resp = ler.nextInt();

    switch(resp){
		case 1:
      System.out.printf("\n\nMUITO OBRIGADO POR ME AJUDAR, O JORGE FOI EMBORA.\n\n");
      System.out.printf("\n\n- POR NADA, MAS LUCAS FALE COM A DIRETORA SOBRE ISSO.\n\n");
      System.out.println("--------------------");
      System.out.println("VOCÊ TOMOU UMA ADVERTENCIA POR BRIGAR NO CORREDOR, MAS CONSEGUIU SALVAR O LUCAS.");
      adv++;
      corredor();
      break;
    case 2:
      System.out.printf("\n\nMUITO OBRIGADO POR CHAMAR O INSPETOR, O JORGE FOI PRA DIRETORIA.\n\n");
      System.out.printf("\n\n- POR NADA. O JORGE TEM QUE MUDAR DE ATITUDE.\n\n");
      corredor();
      break; 
    case 3: 
      System.out.println("LUCAS CONTINUA SOFRENDO, REPENSE ESSA SUA ATITUDE.");
      corredor();
      break;
    default:
		  break;
    }

  }
	
	static void carregarCenas() {
		cenas.add("SALA 01");
		cenas.add("SALA 02");
		cenas.add("SALA 03");
		cenas.add("SALA TV");
		cenas.add("CORREDOR");
	}
	
	static void carregaritens() {
		itens.add("CANETA AZUL");
		itens.add("CANETA VERMELHA");
		itens.add("CANETA PRETA");
		itens.add("LÁPIS");
		itens.add("CHAVE DA SALA DE TV");
	}
	
	static void exibeCenas() {
		System.out.println("MAPA: " + cenas.toString());
	}
	
	static void exibeInventario() {
		System.out.println("INVENTARIO: " + inventory.toString());
	}
	
	static void corredor() {
    checkLives();
		System.out.println("------------------------");
		System.out.println("VOCÊ ESTÁ NA NO CORREDOR");
		System.out.println("------------------------");
		infos();

		switch (opcoesCorredor()) {
		case 1:
			sala01(carregarAlunos(), carregarProfessor(), itens.get(0), itens.get(1), itens.get(2));
			break;
		case 2:
			sala02(carregarAlunos(), carregarProfessor(), itens.get(3), itens.get(2), itens.get(1));
			break;
		case 3:
			sala03(carregarAlunos(), carregarProfessor(), itens.get(0), itens.get(2), itens.get(4));
			break;
    case 4:
			salaTV();
		break;
    case 5:
      luta();	
    break;
		default:
			break;
		}
	}

	static int opcoesCorredor() {
		System.out.println("--------------------");
		System.out.println("OPÇÔES DO CORREDOR");
		System.out.println("[1] - IR PRA SALA 01");
		System.out.println("[2] - IR PRA SALA 02");
		System.out.println("[3] - IR PRA SALA 03");
		System.out.println("[4] - IR PRA SALA TV");
    System.out.println("[5] - AJUDAR O LUCAS");
		System.out.println("--------------------");
		int resp = ler.nextInt();
		return resp;
	}
	
	static void sala01(int qtd, String status, String item1, String item2, String item3) {
    checkLives();
		System.out.println("--------------------");
		System.out.println("VOCÊ ESTÁ NA SALA 01");
		System.out.println("ALUNOS: " + qtd);
		System.out.println("PROFESSOR: " + status);
		System.out.println("--------------------");
		infos();
		switch (opcoesSalas()) {
		case 1:
			if(status.equalsIgnoreCase("SIM")) {
				adv++;
        System.out.println("--------------------");
        System.out.printf("VOCÊ TOMOU UMA ADVERTÊNCIA POR TENTAR SAIR DA SALA COM O PROFESSOR PRESENTE.\nDICA: AGUARDE SENTANDO, O PROFESSOR SAIR DA SALA.\n");
        System.out.println("--------------------");
				corredor();
      }
			corredor();
			break;
		case 2:
			if(status.equalsIgnoreCase("SIM")) {
				adv++;
        System.out.println("--------------------");
        System.out.printf("VOCÊ TOMOU UMA ADVERTÊNCIA POR TENTAR ABRIR O ARMÁRIO DO PROFESSOR COM ELE PRESENTE.\n DICA: AGUARDE SENTANDO, O PROFESSOR SAIR DA SALA.\n");
        System.out.println("--------------------");
				corredor();
			}
			armario(item1, item2 , item3);
			sala01(carregarAlunos(), carregarProfessor(),item1, item2, item3);
			
			break;
		case 3:
			sala01(carregarAlunos(), carregarProfessor(), item1, item2, item3);
			break;

		default:
			break;
		}
		
	}

	static void sala02(int qtd, String status, String item1, String item2, String item3) {
		checkLives();
    System.out.println("--------------------");
		System.out.println("VOCÊ ESTÁ NA SALA 02");
		System.out.println("ALUNOS: " + qtd);
		System.out.println("PROFESSOR: " + status);
		System.out.println("--------------------");
		infos();
		switch (opcoesSalas()) {
		case 1:
			if(status.equalsIgnoreCase("SIM")) {
				adv++;
        System.out.println("--------------------");
        System.out.printf("VOCÊ TOMOU UMA ADVERTÊNCIA POR TENTAR SAIR DA SALA COM O PROFESSOR PRESENTE.\nDICA: AGUARDE SENTANDO, O PROFESSOR SAIR DA SALA.\n");
        System.out.println("--------------------");
				corredor();
      }
			corredor();
			break;
		case 2:
			if(status.equalsIgnoreCase("SIM")) {
				adv++;
        System.out.println("--------------------");
        System.out.printf("VOCÊ TOMOU UMA ADVERTÊNCIA POR TENTAR ABRIR O ARMÁRIO DO PROFESSOR COM ELE PRESENTE.\n DICA: AGUARDE SENTANDO, O PROFESSOR SAIR DA SALA.\n");
        System.out.println("--------------------");
				corredor();
			}
			armario(item1, item2 , item3);
			sala02(carregarAlunos(), carregarProfessor(),item1, item2, item3);
			
			break;
    case 3:
			sala02(carregarAlunos(), carregarProfessor(), item1, item2, item3);
			break;

		default:
			break;
		}
		
	}
	
	static void sala03(int qtd, String status, String item1, String item2, String item3) {
    checkLives();
		System.out.println("--------------------");
		System.out.println("VOCÊ ESTÁ NA SALA 03");
		System.out.println("ALUNOS: " + qtd);
		System.out.println("PROFESSOR: " + status);
		System.out.println("--------------------");
		infos();
		switch (opcoesSalas()) {
		case 1:
			if(status.equalsIgnoreCase("SIM")) {
				adv++;
        System.out.println("--------------------");
        System.out.printf("VOCÊ TOMOU UMA ADVERTÊNCIA POR TENTAR SAIR DA SALA COM O PROFESSOR PRESENTE.\nDICA: AGUARDE SENTANDO, O PROFESSOR SAIR DA SALA.\n");
        System.out.println("--------------------");
				corredor();
      }
			corredor();
			break;
		case 2:
			if(status.equalsIgnoreCase("SIM")) {
				adv++;
        System.out.println("--------------------");
        System.out.printf("VOCÊ TOMOU UMA ADVERTÊNCIA POR TENTAR ABRIR O ARMÁRIO DO PROFESSOR COM ELE PRESENTE.\n DICA: AGUARDE SENTANDO, O PROFESSOR SAIR DA SALA.\n");
        System.out.println("--------------------");
				corredor();
			}
			armario(item1, item2 , item3);
			sala03(carregarAlunos(), carregarProfessor(),item1, item2, item3);
			
			break;
		case 3:
			sala03(carregarAlunos(), carregarProfessor(), item1, item2, item3);
			break;

		default:
			break;
		}
		
	}
	
	static int opcoesSalas() {
		System.out.println("--------------------");
		System.out.println("OPÇÔES DA SALA");
		System.out.println("[1] - SAIR DA SALA");
		System.out.println("[2] - ABRIR ARMARIO");
		System.out.println("[3] - SENTAR NA CARTEIRA");
		System.out.println("--------------------");
		int resp = ler.nextInt();
		return resp;
	}
	
	static void armario(String item1, String item2, String item3) {
		String[] itens = {"NULL", item1, item2, item3};
		
		System.out.println("ITENS DO ARMARIO:");
		for(int i = 1 ; i <= 3 ; i++) {
			System.out.println("[" + i + "] - " + itens[i]);
		}
	
		switch (opcoesArmario()) {
		case 1:
			inventory.add(item1);
      System.out.println("--------------------");
      System.out.println("VOCE OBTEVE O ITEM: " + item1);
      System.out.println("--------------------");
			break;
		case 2:
      inventory.add(item2);
      System.out.println("--------------------");
      System.out.println("VOCE OBTEVE O ITEM: " + item2);
			System.out.println("--------------------");
			break;
		case 3:
      inventory.add(item3);
      System.out.println("--------------------");
      System.out.println("VOCE OBTEVE O ITEM: " + item3);
			System.out.println("--------------------");
			break;
		case 4:
      System.out.println("--------------------");
			System.out.println("FECHANDO ARMARIO");
      System.out.println("--------------------");
			break;

		default:
			break;
		}
		
	}
	
	static int opcoesArmario() {
		System.out.println("--------------------");
		System.out.println("OPÇÔES DO ARMARIO");
		System.out.println("[1] - PEGAR ITEM 1");
		System.out.println("[2] - PEGAR ITEM 2");
		System.out.println("[3] - PEGAR ITEM 3");
		System.out.println("[4] - FECHAR ARMARIO");
		System.out.println("--------------------");
		int resp = ler.nextInt();
		return resp;
	}

  static void checkLives(){
    if(adv == 5 ){
      System.out.println("+++++++++++++++++++++");
      System.out.println("     VOCÊ PERDEU!    ");
      System.out.println("+++++++++++++++++++++");
      System.exit(0);
    }
  }

  static void salaTV(){
    if(inventory.contains("CHAVE DA SALA DE TV")){
      System.out.println("+++++++++++++++++++++");
      System.out.println("   VOCÊ CONSEGUIU!   ");
      System.out.println("+++++++++++++++++++++");
      fim();
      System.exit(0);
    }
    else{
      System.out.println("--------------------");
      System.out.printf("VOCÊ FOI PEGO TENTANDO ENTRAR NA SALA DE TV E RECEBEU UMA ADVERTÊNCIA.\nDICA: PROCURE A CHAVE NOS ARMARIOS DAS SALAS DE AULA.\n");
      System.out.println("--------------------");
      adv++;
      corredor();
    }
    
  }

}
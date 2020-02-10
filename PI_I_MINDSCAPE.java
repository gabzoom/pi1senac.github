package MINDSCAPE;

/**
 *
 * @authors Carlos Eduardo, Gabriel Rodrigues, Lucas Gonçalves
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Classe única utilizada para a construção do RPG
public class PI_I_MINDSCAPE {

    static Scanner entrada = new Scanner(System.in);

    //Método criado para apresentar a estrutura do Menu ao usuário na tela inicial e obter a escolha
    static int menu() {
        int opcao;

        //estrutura de repetição seguida por estrutura condicional para validação da opção escolhida pelo usuário
        do {
            System.out.println("\n1 - Jogar");
            System.out.println("2 - Sinopse");
            System.out.println("3 - Instruções");
            System.out.println("4 - Créditos");
            System.out.println("5 - Sair");

            System.out.print("\nDigite a opção desejada: ");
            opcao = entrada.nextInt();

            if (opcao > 5 || opcao < 1) {
                System.out.println("\nOpção inválida.");
            }
        } while (opcao > 5 || opcao < 1);

        return opcao;
    }

    //Método criado para determinar a função que será executada de acordo com o parâmetro escolhido pelo usuário no menu
    static void controlador(int opcao) {
        switch (opcao) {
            case 1:
                jogar();
                break;
            case 2:
                sinopse();
                break;
            case 3:
                instrucao();
                break;
            case 4:
                creditos();
                break;
            case 5:
                sair();
                break;
        }
    }

    //Método criado para apresentar as instruções básicas do jogo ao usuário
    static void instrucao() {
        System.out.println("\n**********************************INTRUÇÕES**************************************");
        System.out.println("\nVocê só pode concluir a história se enfrentar os desafios que forem apresentados.");
        System.out.println("\nQuando iniciar o jogo, você encontrará alguns campos para digitar suas escolhas.");
        System.out.println("\nUtilize apenas os números na frente das frases para selecionar sua opção.");
        System.out.println("\nPor exemplo:");
        System.out.println("\nVocê está entendendo a explicação?");
        System.out.println("1 - Sim \n2 - Não");
        System.out.println("Digite sua escolha:_____");
        System.out.println("\nNesse caso, você digitaria o número 1 ou o número 2 para escolher.");
        System.out.println("\nCaso você escreva alguma palavra, o jogo lerá sua escolha como inválida.");
        System.out.println("\nVocê só poderá prosseguir com a história se digitar corretamente.");
        System.out.println("\nSempre que encontrar falas do narrador, você visualizará um - antes da frase.");
        System.out.println("*********************************************************************************");
    }

    //Método criado para apresentar uma breve descrição do jogo ao usuário
    static void sinopse() {
        System.out.println("\n***********************************************************SINOPSE**************************************************************");
        System.out.println("\nDEMA é um lugar silencioso, cinzento, obscuro e solitário que é regido por um grupo macabro e misterioso conhecido como A ORDEM.\n"
                + "\nÉ também o lugar onde você está prestes a adentrar...\n"
                + "\nMas será que você é capaz de escapar de toda essa tormenta?\n"
                + "\nTente aproveitar todas as suas chances para vencer os desafios e prove a si mesmo que é capaz.\n"
                + "\nDurante sua jornada você contará com a ajuda da IRMANDADE, mas também terá de enfrentar A ORDEM para alcançar seu objetivo.\n"
                + "\nGuarde todos os conhecimentos que irá adquirir nessa jornada, pois esse mundo é mais real do que se imagina.\n"
                + "\nE lembre-se, DEMA não nos controla!");
        System.out.println("********************************************************************************************************************************");
    }

    //Função para apresentar os créditos aos criadores e programadores do projeto
    static void creditos() {
        System.out.println("\n****************************CRÉDITOS*****************************");
        System.out.println("\nEste RPG textual foi desenvolvido pelos alunos:"
                + "\n*Carlos Eduardo"
                + "\n*Gabriel Rodrigues"
                + "\n*Lucas Santos"
                + "\n\nMatéria: Projeto Integrador I"
                + "\n\nCurso: Tecnologia em Análise e Desenvolvimento de Sistemas"
                + "\n\nTurma: A | Período: Noturno | Ano: 2019"
                + "\n\nInstituição de ensino: Centro Universitário Senac - Santo Amaro");
        System.out.println("*****************************************************************");
    }

    //Função para apresentar uma mensagem caso o usuário opte por sair do jogo
    static void sair() {
        System.out.println("\n*****************");
        System.out.println("Sessão finalizada");
        System.out.println("*****************");
    }

    //Função para apresentar o desafio final
    static void desafioFinal() {
        int aleatorio;
        String opcao;

        //possíveis questões para o desafio final
        String[] perguntas = {"-Porque no fim das contas, A ORDEM é a representação de seus macanismos de defesa e doenças psicológicas.",
            "-Porque DEMA é a sua própria mente.",
            "-Porque Thanatos, o líder da ORDEM, nada mais é do que a personificação da Depressão que você carrega."};

        //alternativas para cada questão
        String[] questoes = {"1-Verdadeiro \n2-Falso",
            "1-Verdadeiro \n2-Falso",
            "1-Verdadeiro \n2-Falso"};

        //respostas corretas para cada afirmação
        String[] respostas = {"1",
            "1",
            "1"};

        //feedback positivo para cada questão
        String[] feedbackPositivo = {"\n-Você foi muito observador(a) durante toda a sua jornada nesse universo."
            + "\n-E foi sua atenção aos detalhes te possibilitou vencer o último desafio!\n"};

        //feedback negativo para cada questão
        String[] feedbackNegativo = {"\n-Mesmo após sua longa jornada em DEMA, ainda é necessário ter um pouco mais de atenção aos detalhes..."
            + "\n-Isso pode definir suas relações com todos ao seu redor, e com si mesmo."
            + "\n\n-Sempre busque ser melhor!\n"};

        //aleatoriedade para mostrar 1 das 3 afirmações
        aleatorio = (int) (Math.random() * 3);

        //impressão da afirmação e as alternativas        
        do {
            System.out.print("\n" + perguntas[aleatorio] + "\n" + questoes[aleatorio] + "\nDigite sua escolha: ");
            opcao = entrada.next();
            if (!opcao.equals("1") && !opcao.equals("2")) {
                System.out.println("\nOpção inválida.");
            }
        } while ((!opcao.equals("1")) && (!opcao.equals("2")));

        //condicional para verificar qual o feedback que será apresentado para o usúario
        if (opcao.equals(respostas[aleatorio])) {
            System.out.println(feedbackPositivo[0]);
        } else {
            System.out.println(feedbackNegativo[0]);
        }
    }

    //Função utilizada para a codificação da história principal e desafios do jogo
    static void jogar() {

        //declaração de variáves locais
        String nome, opcao;
        int aleatorio, escolha;
        boolean acerto = false;

        //estrutura de repetição para obter nome/id do usuário
        do {
            System.out.print("\nDigite como você gostaria de ser chamado(a): ");
            nome = entrada.next();

            //estrutura de repetição e estrutura condicional para validar a opção escolhida usuário e dar a chance de modificar o nome
            do {
                System.out.print("Você confirma que seu nome é " + nome + "? \n1 - Sim \n2 - Não \nConfirme: ");
                opcao = entrada.next();

                switch (opcao) {
                    case "1":
                    case "2":
                        break;
                    default:
                        System.out.println("\nOpção inválida.\n");
                        break;
                }
            } while (!opcao.equals("1") && !opcao.equals("2"));

        } while (!opcao.equals("1"));

        //INÍCIO DO PRIMEIRO ARCO DA HISTÓRIA
        System.out.println("\n_____________________________________________________________________________________________________________________");
        System.out.println("\nSeja bem-vindo(a), " + nome + "!");
        System.out.println("\n-DEMA é o local onde nem mesmo o mais bravo dos homens gostaria de viver.");
        System.out.println("-Uma cidade mórbida e fria regida por uma organização suprema conhecida como A ORDEM.");
        System.out.println("-Os membros dessa organização são grandes esqueletos trajados de capas vermelhas, bem semelhantes a vestes de padres.");
        System.out.println("-Não se sabe desde quando DEMA existe. O que se sabe é que ningúem entra ou sai de lá.");
        System.out.println("-Bom... Isso é o que A ORDEM sempre disse...");
        System.out.println("-Os habitantes de DEMA sempre comentaram sobre um grupo de pessoas que já escapou de lá, conhecidos como A IRMANDADE.");
        System.out.println("-Ninguém nunca pôde provar a existência desse grupo, e A ORDEM sempre se alegrou com isso.");
        System.out.println("-Mas o fato é que A IRMANDADE é real!");
        System.out.println("-Os integrantes desse grupo conseguiram escapar de DEMA e vivem na TRINCHEIRA, seu acampamento no entorno da cidade.");
        System.out.println("-Desvende quem são os integrantes da IRMANDADE, os males pertencentes À ORDEM e seja capaz de enfrentar seus desafios!");

        System.out.println("\nA partir de agora você está por sua conta e risco... \n\n...\n"
                + "\nDesconhecido: " + nome + "...? "
                + "\nDesconhecido: Como você está se sentindo...? \n"
                + nome + ": Como eu... me sinto?"
                + "\nDesconhecido: Você pode ser honesto(a), sabia...?\n"
                + nome + ": Bem... é como seu não sentisse nada... como se eu não existisse..."
                + "\nDesconhecido: Continue assim... tudo ficará bem, minha criança...\n"
                + nome + ": Você sempre me diz isso...");

        System.out.println("\n*Horas depois*\n\n"
                + nome + ": Cara... que dor de cabeça... aquela voz mais uma vez... tenho certeza que ouvi ela antes de adormecer...\n"
                + "\n-Você se encontra no seu quarto."
                + "\n-Ele é vazio e bagunçado... mas é seu."
                + "\n-Há apenas uma escrivaninha, uma cama e uma cadeira. Tudo é cinza, assim como DEMA."
                + "\n-Sobre a mesa você avista uma carta que não parecia estar lá ontem..."
                + "\n-Há também uma mochila velha e suja debaixo da cama fria.");

        //estrutura de repetição seguida de estrutura condicional para validação da opção escolhida pelo usuário
        do {
            System.out.println("\nPrimeiro você deseja ler a carta ou pegar a mochila? \n1 - Ler a carta \n2 - Pegar a mochila");
            System.out.print("\nDigite sua escolha: ");
            opcao = entrada.next();

            switch (opcao) {
                case "1":
                case "2":
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }

        } while ((!opcao.equals("1")) && (!opcao.equals("2")));

        //bloco executado caso o usuário escolha pegar a carta primeiro
        if (opcao.equals("1")) {
            //mensagem apresentada dentro da carta
            System.out.println("\n~~~~\nNOS ENCONTRE PERTO DA ESTÁTUA CENTRAL, AO CAIR DA NOITE. VÁ PREPARADO!"
                    + "\nDICA: ELES NÃO PODEM VER AMARELO!\n\n -A IRMANDADE \n~~~~\n");

            System.out.println(nome + ": Essa é minha chance! Talvez dessa vez eu consiga escapar desse lugar!\n"
                    + nome + ": Antes de sair é melhor arrumar minha mochila");

            //campo de escrita para executar ação do usuário
            do {
                System.out.print("\n1 - Pegar a mochila \nDigite: ");
                opcao = entrada.next();

                if (!opcao.equals("1")) {
                    System.out.println("\nOpção inválida.");
                }

            } while (!opcao.equals("1"));

            System.out.printf("\n-%s verifica que, apesar de velha, a mochila ainda parece ser funcional.", nome);

            System.out.println("\n-Então coloca seu Jumpsuit e sua fita plástica amarela dentro de sua mochila velha e está pronto para partir!");
        } //caminho executado caso o usuário escolha pegar a mochila primeiro
        else if (opcao.equals("2")) {
            System.out.println("\n-" + nome + " verifica que, apesar de velha, a mochila ainda parece ser funcional.");

            //estrutura de repetição para solicitar a leitura da carta ao usuário e continuar o código
            do {
                System.out.print("\n1 - Ler carta \nDigite: ");
                opcao = entrada.next();

                if (!opcao.equals("1")) {
                    System.out.println("\nOpção inválida.");
                }

            } while (!opcao.equals("1"));

            //mensagem apresentada dentro da carta
            System.out.println("\n~~~~\nNOS ENCONTRE PERTO DA ESTÁTUA CENTRAL, AO CAIR DA NOITE. VÁ PREPARADO!"
                    + "\nDICA: ELES NÃO PODEM VER AMARELO!\n\n -A IRMANDADE \n~~~~\n");

            System.out.println(nome + ": Essa é minha chance! Talvez dessa vez eu consiga sair desse lugar!\n"
                    + nome + ": Mas antes de sair é melhor arrumar minha mochila!");

            System.out.println("\n-Então você coloca seu Jumpsuit e sua fita plástica amarela dentro de sua mochila velha e está pronto para partir!");
        }

        //INÍCIO DO SEGUNDO ARCO DA HISTÓRIA
        System.out.println("\n-Ao sair do seu quarto, você encontra seu primeiro desafio."
                + "\n-Há um enorme esqueleto na sua frente, apoiado na mureta que divide a rua e a saída de seu pequeno quarto."
                + "\n-Este é Anubis, um dos Capas Vermelhas, ou como são mais conhecidos, A ORDEM. "
                + "\n-Ele está portando sua *roleta da doutrina*."
                + "\n-Esse objeto gera uma pergunta aleatória relacionada a você mesmo,"
                + "\n-E se quer sair de seu quarto, deve responder corretamente ao que ele pede."
                + "\n-Entretanto, este objeto tembém é usado para manter tudo em DEMA sob controle.");

        System.out.println("\nANUBIS: Olá, " + nome + ", onde pensa que vai? Bem... não importa! "
                + "\nANUBIS: Precisa encarar minha roleta da doutrina se quiser deixar seu quarto."
                + "\nANUBIS: Mas já lhe aviso, não é tão simples quanto parece.");
        System.out.println("\n-Anubis roda a roleta... ela vai parando lentamente até que... lá está sua pergunta!");

        //PRIMEIRO DESAFIO
        System.out.println("\nANUBIS: Para se manter bem em DEMA você deve ter atitudes adversas ao restante das pessos ao seu redor."
                + "\nANUBIS: E deve estar distante delas, pois assim elas não vão julgar você e tudo terminará bem..."
                + "\nANUBIS: Em outras palavras, o que você deve praticar?");

        //criação de uma nova lista para armazenar as alternativas do desafio
        List respostas = new ArrayList();

        //criação das alternativas de resposta
        respostas.add("Deslocamento");
        respostas.add("Isolamento"); //resposta correta
        respostas.add("Apatia");
        respostas.add("Sublimação");
        respostas.add("Regressão");

        //estrutura de repetição para apresentar as alternativas do desafio ao usuário
        do {
            //classe que fará o embaralhamento das alternativas adicionadas
            Collections.shuffle(respostas);

            //apresentação das alternativas embaralhadas para o usuário
            System.out.println("1 - " + respostas.get(0));
            System.out.println("2 - " + respostas.get(1));
            System.out.println("3 - " + respostas.get(2));
            System.out.println("4 - " + respostas.get(3));
            System.out.println("5 - " + respostas.get(4));

            System.out.print("Digite sua escolha: ");
            opcao = entrada.next();

            //estrutura condicional para verificar se a opção escolhida é a correta
            switch (opcao) {
                case "1":
                    if (respostas.get(0).equals("Isolamento")) {
                        acerto = true;
                    } else {
                        System.out.println("\nANUBIS: Errado! \nVocê pode tentar novamente. Mas enquanto não acertar, não passará!\n");
                    }
                    break;
                case "2":
                    if (respostas.get(1).equals("Isolamento")) {
                        acerto = true;
                    } else {
                        System.out.println("\nANUBIS: Errado! \nVocê pode tentar novamente. Mas enquanto não acertar, não passará!\n");
                    }
                    break;
                case "3":
                    if (respostas.get(2).equals("Isolamento")) {
                        acerto = true;
                    } else {
                        System.out.println("\nANUBIS: Errado! \nVocê pode tentar novamente. Mas enquanto não acertar, não passará!\n");
                    }
                    break;
                case "4":
                    if (respostas.get(3).equals("Isolamento")) {
                        acerto = true;
                    } else {
                        System.out.println("\nANUBIS: Errado! \nVocê pode tentar novamente. Mas enquanto não acertar, não passará!\n");
                    }
                    break;
                case "5":
                    if (respostas.get(4).equals("Isolamento")) {
                        acerto = true;
                    } else {
                        System.out.println("\nANUBIS: Errado! \nVocê pode tentar novamente. Mas enquanto não acertar, não passará!\n");
                    }
                    break;
                default:
                    System.out.println("\nEscolha inválida.\n");
            }
        } while (!acerto);

        //feedback do desafio
        System.out.println("\n-Enfim você foi capaz de visualizar o que é isolamento... você foi bem!"
                + "\n-Perceber características e mecanismos de defesa em outras pessoas e em você pode ajudar em diversos momentos...");

        System.out.println("\nANUBIS: Devo alertar ao resto da ORDEM... se você continuar assim e perceber tudo, será nosso fim!"
                + "\nANUBIS: Mas como combinado, você pode passar... só não fique perambulando por aí. "
                + "\nANUBIS: Estamos de olho em você sempre, minha criança...\n"
                + nome + ": O que você quer dizer com \"ser o fim de vocês\"?! Não se cale!");

        System.out.println("\n-E num piscar de olhos, tudo ficou cinza e não dava pra enxergar nada "
                + "\n-Quando você conseguiu abrir os olhos e enxergar, o enorme esqueleto havia sumido!\n");
        System.out.println(nome + ": Tenho que me apressar para chegar até a estátua central. Já vai escurecer.");

        //INÍCIO DO TERCEIRO ARCO DA HISTÓRIA
        System.out.println("\n-Alguns minutos depois de encontrar seu primeiro obstáculo,\n-"
                + nome + " visualiza a estátua e se encaminha para o enorme galpão em que ela fica localizada."
                + "\n-Antes que tivesse tempo para descansar, " + nome + " é cercado por um grupo de pessoas."
                + "\n-Pelas vestes militares amarelas e as tochas nas mãos, só pode significar uma coisa..."
                + "\n-A carta era real!\n");

        System.out.println(nome + ": EU SABIA!!!\n"
                + nome + ": Vocês existem!\n"
                + "Líder da IRMANDADE: Então você conseguiu chegar até aqui.\n"
                + "Líder da IRMANDADE: Isso significa que enfrentou a roleta da doutrina e venceu Anubis.\n"
                + "Líder da IRMANDADE: Muito bem!\n"
                + nome + ": Todos em DEMA comentam sobre a existência de vocês,\n"
                + nome + ": Mas os Capas Vermelhas sempre negaram a possbilidade de haver quem deixasse DEMA.\n"
                + nome + ": Mas por alguma razão eu acreditava na sua existência.");

        System.out.println("\nLíder da IRMANDADE: Não temos tempo para conversas... eles já sabem da nossa presença aqui e estão a caminho."
                + "\nLíder da IRMANDADE: Precisamos deixar DEMA agora! Pegue seu Jumpsuit!");

        //estruturas condicionais para validar a opção escolhida pelo usuário
        do {
            System.out.println("\n1 - Tudo bem! \n2 - Por que?");
            System.out.print("Digite sua escolha: ");
            opcao = entrada.next();

            switch (opcao) {
                case "1":
                case "2":
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }

        } while ((!opcao.equals("1")) && (!opcao.equals("2")));

        //estrutura condicional para se usuário questionar por que pegar o jumpsuit
        if (opcao.equals("2")) {
            System.out.printf("\n%s: Por que?", nome);
            System.out.println("\nLíder da IRMANDADE: Ele é capaz de camuflar você e impedir que seja visualizado de maneira fácil. Agora pegue!");
        }

        System.out.println("\n" + nome + ": Tudo bem!");
        System.out.println("\nLíder da IRMANDADE: Escute, " + nome + "... sabemos que você sente que suas atitudes não são importantes."
                + "\nLíder da IRMANDADE: Mas para escapar de DEMA precisamos acionar as passagens subterrâneas."
                + "\nLíder da IRMANDADE: E a única forma de fazer isso é derrotando esse mecanismo de defesa da apatia que você desenvolveu.\n"
                + nome + ": O que preciso fazer?"
                + "\nLíder da IRMANDADE: Há um número chave que aciona as passagens subterrâneas aqui no galpão."
                + "\nLíder da IRMANDADE: Como todos em DEMA são condicionados a permanecer apáticos, só há uma maneira de escapar pelos túneis..."
                + "\nLíder da IRMANDADE: É preciso demonstrar interesse e motivação descobrindo o número certo para acionar as passagens de fuga."
                + "\nLíder da IRMANDADE: Essa é a única maneira se quiser escapar daqui."
                + "\nLíder da IRMANDADE: Quando disser um número que está numa distância de 1 número pra mais ou pra menos do número certo,"
                + "\nLíder da IRMANDADE: Lhe darei dicas para ajudar."
                + "\nLíder da IRMANDADE: Contamos com você! Demonstre interesse em algo! Sinta que você é capaz!"
                + "\nLíder da IRMANDADE: Ah, o número chave está entre 0 e 50.");

        //SEGUNDO DESAFIO
        //retorno da variável acerto ao seu estado falso para reutilizar a variável no desafio a seguir
        acerto = false;

        //função utilizada para gerar um número chave aleatório entre 0 e 50
        aleatorio = (int) (Math.random() * 51);

        //estrutura condicional para validar a opção escolhida pelo usuário
        do {
            System.out.print("\nDigite seu escolha: ");
            escolha = entrada.nextInt();

            //feedback positivo assim que o usuário acertar a questão
            if (escolha == aleatorio) {
                System.out.println("\n-Você mandou bem! Continue assim!"
                        + "\n-Mais do que um sentimento angustiante, a apatia pode ser um sintoma de distúrbios mentais graves."
                        + "\n-Mas há pessoas que podem te ajudar a procurar ajuda e te fazer sair dessa! "
                        + "\n-Confie em pessoas que se importam com você, sua opinião e sua atitude fazem a diferença no mundo!");
                acerto = true;
                break;
            }
            //dicas para ajudar o usuário a acertar a senha 
            if (escolha == (aleatorio + 1) || escolha == (aleatorio - 1)) {
                System.out.println("Líder da IRMANDADE: Você está muito próximo!");
            } else if (aleatorio > escolha) {
                System.out.println("Líder da IRMANDADE: O número chave é MAIOR do que sua escolha!");
            } else if (aleatorio < escolha) {
                System.out.println("Líder da IRMANDADE: O número chave é MENOR do que sua escolha!");
            }
        } while (!acerto);

        System.out.println("\nLíder da IRMANDADE: Você conseguiu! Agora vamos depressa! Eles estão chegando!");

        System.out.println("\n-" + nome + " se junta à IRMANDADE e entra nas passagens subterrâneas daquele galpão frio e cinzento."
                + "\n-Em questão de segundos, dois Capas Vermelhas chegam ao local e encontram algumas crianças."
                + "\n-Elas estão segurando tochas apagadas e o que parece ser pedaços de uma jaqueta camuflada."
                + "\n-Os portadores daquelas capas eram Thanatos e Oizus. "
                + "\n-Eles sentiram a presença da IRMANDADE em DEMA e foram até o local o mais rápido possível."
                + "\n-Eles rápidamente perceberam a gravidade daquele ocorrido e sentiram a presença de " + nome + " se distanciar cada vez mais."
                + "\n-Seria necessário agir rapidamente, pois se eles permitissem que tudo ficasse assim, poderia ser o fim de DEMA."
                + "\n-Enquanto A IRMANDADE se encaminhava para fora de DEMA pelos túneis subterrâneos de forma silenciosa,"
                + "\n-A ORDEM se preparava para recuperar seu habitante mais precioso, " + nome + ".");

        //INÍCIO DO QUARTO ARCO DA HISTÓRIA
        System.out.println("\n-Pelo lado de fora de DEMA, o grupo da IRMANDADE se dirigia até a TRINCHEIRA.");
        System.out.println("-O silêncio ainda era predominante,");
        System.out.println("-E andando pelas montanhas rochosas a única luz que se via era a das tochas levadas pelo grupo.");
        System.out.println("-Então após uma longa caminhada, o grupo finalmente chega no acampamento.");
        System.out.println("\n-Todos ficam alegres com a chegada de " + nome + ", o resgate parece ter sido um sucesso.");
        System.out.println("-A cor predominante em tudo era amarelo. Roupas camufladas, barracas, equipamentos, flores.");
        System.out.println("-O local era como se fosse um tipo de base militar e havia muitas áreas montanhosas ao redor.");
        System.out.printf("-A grande quantidade de tochas espalhadas pelo local não era algo comum para %s.", nome);
        System.out.println("\n-Mas o fogo cobria todas as áreas do acampamento, era uma maneira de manter as sombras longe.");
        System.out.printf("-E com a chegada de %s, o grupo decide comemorar.", nome);

        System.out.printf("\n\n%s: Quem são vocês, afinal?", nome);
        System.out.println("\n\n-Neste momento o grupo inteiro desamarrou as bandanas que cobriam grande parte do seu rosto.");
        System.out.printf("-Finalmente %s conseguia se lembrar...", nome);
        System.out.println("\n-Seus pais, seus irmãos, seus melhores amigos...");
        System.out.println("-As pessoas mais importantes na vida de " + nome + " estavam ali...");
        System.out.println("-É como se aos poucos suas memórias retornassem. ");
        System.out.println("-Como se aquelas pessoas realmente fossem importantes...");
        System.out.println("-Mas parece que os dias solitários em DEMA fizeram você esquecer de tudo.");
        System.out.printf("-Então se iniciam os preparativos para a comemoração da sua fuga de DEMA.");
        System.out.println("\n-Enquanto isso você tinha algumas dúvidas para tratar com seu irmão mais próximo, Tyler.");
        System.out.println("\n...");
        System.out.printf("\n%s: Mas afinal, por que estive sozinho(a) em DEMA todo esse tempo?", nome);
        System.out.println("\nTyler: Você realmente não se lembra de nada, não é?");

        //estrutura de repetição para validar escolha do usuário
        do {
            System.out.print("\n1 - Como assim? \n2 - Eu me lembro! \nDigite sua escolha: ");
            opcao = entrada.next();

            //estrutura condicional usada para indicar escolhas invalidas do usuario
            switch (opcao) {
                case "1":
                case "2":
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }
        } while ((!opcao.equals("1")) && (!opcao.equals("2")));

        //caminho seguido caso o usuário escolha a primeira opção
        if (opcao.equals("1")) {
            System.out.printf("\n%s: Como assim?", nome);
            System.out.println("\nTyler: Nós sempre estivemos te observando.");
            System.out.println("Tyler: Tentamos diversas vezes te tirar de DEMA, mas parece que essa foi a primeira vez que conseguimos.");
            System.out.println("Tyler: Infelizmente só você é capaz de sair de lá, não podemos fazer as escolhas por você.");
            System.out.printf("%s: Droga! Eu nunca me lembro de nada, mas valeu, eu acho...", nome);
        } else {
            System.out.printf("\n%s: Eu me lembro sim!", nome);
        }

        System.out.printf("\n%s: Aqui é tão diferente de DEMA. Por que tudo é amarelo?", nome);
        System.out.println("\nTyler: Essa foi a forma que encontramos de nos comunicar sem que A ORDEM nos notasse.");
        System.out.println("Tyler: Tudo sempre foi tão cinza por aqui,");
        System.out.println("Tyler: Então procuramos encontrar alguma maneira de passar despercebidos pelos Capas Vermelhas.");
        System.out.println("Tyler: Essa cor foi muito importante para que conseguíssimos fugir de DEMA.");
        System.out.println("Tyler: De qualquer forma, você já deveria saber disso...");
        System.out.println("Tyler: Da última vez eu te expliquei tudo quando entreguei seu Jumpsuit.");
        System.out.println("Tyler: Mas vamos lá... parece que as comemorações vão começar!");
        System.out.printf("%s: (\"Da última vez\"? Como assim?)", nome);

        System.out.println("\n\n...");

        System.out.println("\n-Todos estavam contentes e alegres comemorando com músicas e danças.");
        System.out.printf("-Em um certo momento, %s se senta ao redor de uma grande fogueira com alguns membros da IRMANDADE.", nome);
        System.out.println("\n-Entretanto, " + nome + " parecia distante, embora estivesse em boa companhia.");
        System.out.println("\n-Todos parecem eufóricos, conversando entre si sobre como estavam felizes com a fuga de DEMA.");
        System.out.println("-Mas " + nome + " não se sente muito bem... mãos trêmulas, coração acelerado, falta de ar, calafrios...");
        System.out.println("-É como se estivesse antecipando uma ameaça futura.");
        System.out.printf("-%s sempre sentiu essa sensação de que algo ia acontecer, mas nada nunca acontecia.", nome);
        System.out.println("\n-Nada que pensasse justificava seus sentimentos de enxergar perigo em tudo.");

        System.out.println("\n-Então, num piscar de olhos, um par de mãos se aproxima do pescoço de " + nome + " e o(a) puxa rapidamente da roda.");
        System.out.printf("-O vulto vermelho, que em questões de segundos arrastou %s da TRINCHEIRA, não deixava dúvidas, era A ORDEM.", nome);
        System.out.println("\n-Ao notar o acontecido, os membros da IRMANDADE pegaram suas tochas e partiram para o caminho que retornava a DEMA.");

        System.out.printf("-A razão pela qual %s sentia todos os sentimentos mencinados antes, era OIZUS.", nome);
        System.out.println("\n-Era ele também, o segundo integrante da ORDEM, que havia invadido a TRINCHEIRA para arruinar os planos da IRMANDADE.");
        System.out.println("-Ao chegar em um lago bem raso e cheio de pedras ao fundo, OIZUS finalmente se pronuncia.");

        System.out.println("\nOIZUS: Então você realmente tentou se afastar de DEMA... desculpe, mas isso é impossível!");
        System.out.println("OIZUS: Só por sua audácia, terá de me vencer em um desafio.");
        System.out.println("OIZUS: Vamos ver o quanto você evoluiu.");
        System.out.println("OIZUS: Você enfrentou a roleta da doutrina e desmascarou Anubis.");
        System.out.println("OIZUS: Se for tão bom(a) assim, me diga... você sabe o que represento?");
        System.out.println("OIZUS: Caso acerte, estará liberto(a).");

        //TERCEIRO DESAFIO   
        //criação de uma nova lista para armazenar as alternativas do desafio
        List alternativas = new ArrayList();

        //retorno da variável acerto ao seu estado falso para reutilizar a variável no desafio a seguir
        acerto = false;

        //criação das alternativas de resposta
        alternativas.add("Angústia");
        alternativas.add("Ansiedade"); //resposta correta
        alternativas.add("Ineficiência");
        alternativas.add("Bulimia");
        alternativas.add("Psicopatia");

        //estrutura de repetição para apresentar o desafio ao usuário
        do {
            //classe que fará o embaralhamento das alternativas adicionadas
            Collections.shuffle(alternativas);

            System.out.println("\nOIZUS: Então... O que eu, o poderoso OIZUS, represento na sua vida em DEMA?");

            //apresentação das alternativas embaralhadas para o usuário
            System.out.println("1 - " + alternativas.get(0));
            System.out.println("2 - " + alternativas.get(1));
            System.out.println("3 - " + alternativas.get(2));
            System.out.println("4 - " + alternativas.get(3));
            System.out.println("5 - " + alternativas.get(4));
            System.out.print("\nDigite sua escolha: ");
            opcao = entrada.next();

            //estrutura condicional para verificar se a opção escolhida é a correta
            switch (opcao) {
                case "1":
                    if (alternativas.get(0).equals("Ansiedade")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "2":
                    if (alternativas.get(1).equals("Ansiedade")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "3":
                    if (alternativas.get(2).equals("Ansiedade")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "4":
                    if (alternativas.get(3).equals("Ansiedade")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "5":
                    if (alternativas.get(4).equals("Ansiedade")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                default:
                    System.out.println("\nOpção inválida! Tente mais uma vez!");
            }

        } while (!acerto);

        //feedback do desafio
        System.out.println("\n-Você evoluiu bem!");
        System.out.println("-Porém mantenha sua atenção nos detalhes em pessoas, vai precisar em sua vida pessoal e também profissional.");

        System.out.println("\nOIZUS: Você acertou... mas não se anime tanto... ainda não acabou!");
        System.out.println("OIZUS: Seria muito fácil te deixar partir agora.");
        System.out.println("OIZUS: Responda ao próximo desafio, aí sim você poderá se livrar de mim!");

        //QUARTO DESAFIO
        //criação de uma nova lista para armazenar as alternativas do desafio
        alternativas = new ArrayList();

        //retorno da variável acerto ao seu estado falso para reutilizar a variável no desafio a seguir
        acerto = false;

        //criação das alternativas de resposta
        alternativas.add("\"Mãos trêmulas, coração acelerado, falta de ar, calafrios, enxergar perigo em tudo.\""); //resposta correta
        alternativas.add("\"Se afastar de grupos sociais para se proteger.\"");
        alternativas.add("\"Sabemos que você acha que a sua opinião não é importante.\"");
        alternativas.add("\"Estamos de olho em você sempre, minha criança...\"");
        alternativas.add("\"Tudo é vazio... não há nada que me faça sentir vivo.\"");

        //estrutura de repetição para apresentar o desafio ao usuário
        do {
            //classe que fará o embaralhamento das alternativas adicionadas
            Collections.shuffle(alternativas);
            System.out.println("\nOIZUS: Qual trecho prova que eu sou a personificação da ansiedade?");

            //apresentação das alternativas embaralhadas para o usuário
            System.out.println("1 - " + alternativas.get(0));
            System.out.println("2 - " + alternativas.get(1));
            System.out.println("3 - " + alternativas.get(2));
            System.out.println("4 - " + alternativas.get(3));
            System.out.println("5 - " + alternativas.get(4));
            System.out.print("\nDigite sua escolha: ");
            opcao = entrada.next();

            //estrutura condicional para verificar se a opção escolhida é a correta
            switch (opcao) {
                case "1":
                    if (alternativas.get(0).equals("\"Mãos trêmulas, coração acelerado, falta de ar, calafrios, enxergar perigo em tudo.\"")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "2":
                    if (alternativas.get(1).equals("\"Mãos trêmulas, coração acelerado, falta de ar, calafrios, enxergar perigo em tudo.\"")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "3":
                    if (alternativas.get(2).equals("\"Mãos trêmulas, coração acelerado, falta de ar, calafrios, enxergar perigo em tudo.\"")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "4":
                    if (alternativas.get(3).equals("\"Mãos trêmulas, coração acelerado, falta de ar, calafrios, enxergar perigo em tudo.\"")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                case "5":
                    if (alternativas.get(4).equals("\"Mãos trêmulas, coração acelerado, falta de ar, calafrios, enxergar perigo em tudo.\"")) {
                        acerto = true;
                    } else {
                        System.out.println("\nResposta incorreta! Tente mais uma vez!");
                    }
                    break;
                default:
                    System.out.println("\nEscolha inválida! Tente mais uma vez!");
            }

        } while (!acerto);

        //feedback do desafio
        System.out.println("\n-Muito bem! Você já está sendo capaz de perceber detalhes nas pessoas.");
        System.out.println("-Você é capaz de ajudar muitas pessoas se sensibilizando com elas e identificando esses detalhes.");
        System.out.println("-Ansiedade não é saudável, e muitas vezes as pessoas ao seu redor também são acompanhadas por ela.");
        System.out.println("-Não contribua para que isso piore. Busque ser gentil e tente ajudar!");

        System.out.println("\nOIZUS: Jamais perdoarei tamanha insolência...");
        System.out.println("OIZUS: Sempre estive ao seu lado, e mesmo assim você insiste em se livrar de mim.");
        System.out.println("OIZUS: Bem... eu disse que lhe deixaria livre... mas só por hora... HAHAHAHA...");
        System.out.println("OIZUS: Fique sabendo que A ORDEM não está acabada...");
        System.out.println("OIZUS: Você não perde por esperar a chegada de... esqueça!");
        System.out.printf("OIZUS: Nos veremos de novo, %s...", nome);

        System.out.println("\n\n-Após esse discurso, uma fumaça vermelha e cinza se espalhou pelo ar frente a lua cheia.");
        System.out.printf("-E %s despencou imediatamente por sobre as águas rasas do lago, "
                + "caiu desacordado enquanto OIZUS se dissipou junto com a fumaça.", nome);
        System.out.printf("\n\n-Enquanto isso acontecia, A IRMANDADE continuava buscando por %s...", nome);

        //INÍCIO DO QUINTO ARCO DA HISTÓRIA
        System.out.println("\n\n*Na manhã seguinte*");
        System.out.printf("\n-%s finalmente acorda, porém não sabe bem onde está.", nome);
        System.out.println("\n-É uma região abaixo das enormes montanhas que andará antes para chegar no acampamento.");
        System.out.printf("-%s se levanta, sacode as roupas molhadas pela água do rio e observa ao seu redor.", nome);
        System.out.println("\n-O rio em que havia caído desacordado ficava entre várias montanhas rochosas.");
        System.out.println("-A luz do sol, mesmo entre as nuvens, dava um pouco de vida para aquela região.");
        System.out.println("-Havia um gramado bem verde e curto que se misturava com o raso rio e seus pedregulhos ao fundo.");
        System.out.println("-De fato, era uma bela visão para se apreciar.");

        System.out.printf("-Após caminhar alguns metros, %s olha para uma das montanhas e avista algumas silhuetas.", nome);
        System.out.println("\n-A IRMANDADE finalmente chegou após muita busca.");
        System.out.println("-O grupo estava em grande número e para qualquer montanha que olhasse, mais deles apareciam.");
        System.out.printf("-Eles olham fixamente para %s, que parece meio desnorteado(a).", nome);
        System.out.println("\n-Pressentindo algo ruim novamente, você começa a andar num passo apressado, como se quisesse fugir de algo.");

        System.out.printf("-Nesse momento todos os membros da IRMANDADE olham para o lado oposto de %s, que faz o mesmo.", nome);
        System.out.println("\n-Há um Capa Vermelha montando em um cavalo branco que segue velozmente em sua direção.");
        System.out.println("-Você pensa em se mover. Mas está com muito medo e se sente muito mal.");
        System.out.println("-Seu corpo não te obedece, muito menos sua mente. Você está se sentindo indefeso(a).");
        System.out.printf("\n%s: O que está acontecendo comigo? Droga!", nome);
        System.out.println("\n\n-Sentimentos vazios dominaram seus pensamentos e sua alma.");
        System.out.println("-Já paralizado(a), você apenas fecha os olhos.");

        System.out.println("\n-Quem estava lá era Thanatos, o último e principal membro da ORDEM.");
        System.out.println("-A presença dele fez com que você sentisse tudo o que te impedia de se mover.");
        System.out.println("-Ele era diferente dos outros membros.");
        System.out.println("-As sensações ruins perto dele eram mais fortes.");
        System.out.println("-Ele usava um véu branco assustador sobre seu rosto.");
        System.out.println("\n-Ao chegar bem perto de você, ele desce de seu cavalo e vai caminhando lentamente.");
        System.out.println("-Já em sua frente, Thanatos se pronuncia.");

        System.out.println("\nTHANATOS: Não sei por que você está fazendo isso comigo, minha criança...");
        System.out.println("THANATOS: Eu faço tudo pelo seu bem. Você pertence a DEMA! Você sabe disso.");
        System.out.println("THANATOS: Vamos voltar juntos, agora. Não há nada para nos impedir.");

        System.out.println("\n-Nesse momento Thanatos passa as mãos suavemente em seu pescoço e deixa a marca dos seus dedos.");
        System.out.println("-É como se fosse uma marca com tinta preta.");
        System.out.println("-Você sequer se move, sequer consegue resistir...");
        System.out.println("-A presença de Thanatos faz com que você se torne submisso(a) a ele.");
        System.out.println("-Embora fosse uma presença familiar, você não se lembrava dele.");
        System.out.println("-Para você, é como se ele sempre estivesse ao se lado...");
        System.out.println("-Como se ele jamais tivesse te abandonado em hora alguma...");

        System.out.println("\n-Então Thanatos monta em seu cavalo, que começa a cavalgar lentamente.");
        System.out.println("-Mesmo com um andar robótico e cabisbaixo, você está seguindo ele e nem contraria isso.");
        System.out.println("-Após alguns passo, você avista um girassol em meio àqueles pedregulhos cobertos pela água,");
        System.out.println("-Você levanta a sua cabeça para o topo das montanhas e para de caminhar.");
        System.out.println("-Percebendo que você parou de se mover, Thanatos também levanta a cabeça.");
        System.out.println("-Nesse momento, todos os membros da IRMANDADE que estavam sobre as montanhas,");
        System.out.println("-Começam a jogar pétalas de girassol em sua direção. Eram centenas delas.");
        System.out.println("-E a medida em que as pétalas se aproximavam, o cavalo ficava mais agitado.");

        System.out.println("-Thanatos não entendia bem o que estava acontecendo naquele momento.");
        System.out.println("-Ele apenas podia visualizar as silhuetas dos membros da IRMANDADE,");
        System.out.println("-Mas não conseguia ver as pétalas amarelas sendo atiradas em sua direção.");

        System.out.println("\n-Tyler já havia deixado claro que só você pode fugir de DEMA.");
        System.out.println("-E que eles não podem fazer as escolhas por você.");
        System.out.println("-Aquelas pétalas eram o máximo que podiam fazer naquele momento.");
        System.out.println("-Eram como uma tentativa de te despertar daquele estado.");
        System.out.println("-De mostrar que A IRMANDADE estava ali por você. Pra te ajudar sempre.");
        System.out.println("\n-Então seu semblante começa a mudar... você está em conflito com si mesmo.");
        System.out.println("-Thanatos, temendo seu comportamento, resolve tentar controlá-lo(a) a força.");

        System.out.println("\nTHANATOS: Pare agora! Você deve permanecer comigo! Não tente nada!");
        System.out.printf("%s: Eu sei bem quem você é!", nome);
        System.out.printf("\n%s: Tudo o que acontece comigo... Você nunca me protegeu! Você só quer o meu fim!", nome);
        System.out.printf("\n%s: Eu não ficarei sob seu comando novamente!", nome);

        System.out.println("\n\n-Nesse momento você dá dois passos para trás, se vira e sai correndo velozmente.");
        System.out.println("-Thanatos, porém, não perde tempo e parte atrás de você montado em seu cavalo.");

        //estrutura de repetição para interação do usuário ao executar ação
        for (int i = 0; i < 4; i++) {
            System.out.println("\n1 - Correr mais rápido");
            System.out.print("Digite: ");
            opcao = entrada.next();

            switch (opcao) {
                case "1":
                    switch (i) {
                        case 0:
                            System.out.printf("\n%s: Preciso ser mais veloz!", nome);
                            System.out.println("\n-Thanatos está chegando mais perto...");
                            break;
                        case 1:
                            System.out.printf("\n%s: Droga... mais rápido!!!", nome);
                            System.out.println("\n-Thanatos está muito próximo!");
                            break;
                        case 2:
                            System.out.printf("\n%s: Acho que não vou conseguir...", nome);
                            System.out.println("\n-Thanatos irá te alcançar!");
                            break;
                        case 3:
                            System.out.printf("\n%s: Por favor... Me deixe em paz...", nome);
                            System.out.println("\n-Thanatos finalmente lhe alcançou.");
                            break;
                    }
                    break;
                default:
                    System.out.println("\nOpção inválida.");
            }
        }

        System.out.println("\n-Você correu o quanto pôde...");
        System.out.println("-Mas não foi o suficiente dessa vez...");
        System.out.println("-O seu cansaço e seu esforço o fizeram tropeçar nas rochas...");
        System.out.println("...");
        System.out.println("-Você caiu, e bateu a cabeça...");
        System.out.println("...");
        System.out.println("-O impacto fez com que você ficasse desacordado(a).");
        System.out.println("...");
        System.out.println("\n-Depois de toda sua jornada, por que Thanatos e A ORDEM permaneceriam te aprisionando em DEMA?!");
        System.out.println("-Por que você não conseguiu se manter fora de DEMA?\n");

        //O DESAFIO FINAL 
        System.out.print("~~~Classifique a afirmação a seguir: ");

        //função utilizada para acionar o conteúdo do último desafio do jogo
        desafioFinal();

        System.out.println("-No fim das contas, tudo sempre esteve na sua frente...");
        System.out.println("\n-DEMA não é só uma cidade!");
        System.out.println("-DEMA é uma analogia para todos os conflitos que ocorrem na mente humana.");
        System.out.println("-Os mecanismos de defesa, as doenças e distúrbios psicológicos... DEMA é onde tudo isso vive.");
        System.out.println("-É a sua própria mente.");
        System.out.println("\n-A ORDEM é uma representação de todas essas doenças e distúrbios mentais.");
        System.out.println("-Anubis representa os mecanismos de defesa prejudiciais à saúde mental.");
        System.out.println("-Oizus é a personificação da ansiedade.");
        System.out.println("-E Thanatos, o líder da ORDEM, representa a depressão,");
        System.out.println("-Que é uma doença que já atinge 300 milhões de pessoas em todo o mundo.");
        System.out.println("\n-Os membros da IRMANDADE são as pessoas próximas de você que vivem fora de sua mente,");
        System.out.println("-Enxergam seus problemas pelo lado de fora, e sempre estarão dispostas a lhe ajudar a superar seus desafios.");
        System.out.println("\n-Dia após dia, milhares de pessoas ao seu redor necessitam de ajuda para enfrentar problemas como estes.");
        System.out.println("-E por mais que elas lutem para vencer seus desafios e se sintam seguras, elas nunca estão livres de suas amarras.");
        System.out.println("-Assim como você lutou bravamente para fugir de DEMA, se manter fora de lá não é tão simples quanto parece.");
        System.out.println("-As pessoas sempre estão passíveis de uma recaída a qualquer instante. Então preste atenção nos detalhes.");
        System.out.println("-Você nunca sabe quais batalhas as pessoas ao seu redor estão enfrentando. Então seja gentil e tente ajudar.\n");
        System.out.println("...\n");
        
        //ENCERRAMENTO
        System.out.println("Desconhecido: " + nome + "...? "
                + "\nDesconhecido: Como você está se sentindo...? \n"
                + nome + ": Como eu... me sinto?"
                + "\nDesconhecido: Você pode ser honesto(a), sabia...?\n"
                + nome + ": Bem... é como seu não sentisse nada... como se eu não existisse..."
                + "\nDesconhecido: Continue assim... tudo ficará bem, minha criança...\n"
                + nome + ": Você sempre me diz isso...");
        System.out.println("\n  ...");
        System.out.println("\n      ...");
        System.out.println("\n          ...");
        System.out.println("\n***Você completou o jogo***");
        System.out.println("\n***Retornando ao meu principal***");
    }

    public static void main(String[] args) {

        int opcaoEscolhida;

        System.out.println("Seja bem-vindo(a) ao M!NDSCAPE!");

        //estrutura de repetição utilizada para apresentar o menu novamente ao usuário caso acione as funções do tipo void no menu
        do {
            //atribuição do retorno da função "menu" à variável que indica a opção escolhida pelo usuário
            opcaoEscolhida = menu();

            //controlador recebe opção escolhida do menu como parâmetro
            controlador(opcaoEscolhida);
        } while (opcaoEscolhida == 1 || opcaoEscolhida == 2 || opcaoEscolhida == 3 || opcaoEscolhida == 4);
    }
}
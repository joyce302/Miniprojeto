import java.util.Scanner;

public class Miniprojeto2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nivelEntendimento = 0; // Nível de entendimento da investigação
        
        // Personalização do detetive
        System.out.println("Bem-vindo ao Livro I!");
        System.out.println("Vamos criar o seu personagem detetive para a história.");
        System.out.print("Qual é o nome do seu detetive? ");
        String nomeDetetive = scanner.nextLine();
        
        System.out.print("Qual é o gênero do seu detetive (Masculino/Feminino)? ");
        String generoDetetive = scanner.nextLine();
        
        // Introdução e explicação do nível de entendimento
        System.out.println("\nVocê é " + nomeDetetive + ", um detetive " + generoDetetive + " em busca de resolver um crime.");
        System.out.println("Seu nível de entendimento da investigação começa em 0%. Cada escolha que você faz pode aumentar ou diminuir esse nível.");
        
        // Introdução e personalização do detetive
        System.out.println("\nEram duas da manhã em Belo Jardim. " + nomeDetetive + " já se encontrava na cama, dormindo, quando recebe uma ligação...");
        System.out.println("Supervisor: " + nomeDetetive + ", preciso que você compareça a uma cena de crime. Você vai atender ao chamado? (S/N)");
        
        String resposta = scanner.nextLine();
        
        // Verificação da resposta para atender ao chamado ou não
        if (resposta.equalsIgnoreCase("N")) {
            System.out.println("Você recusou o chamado. Seu supervisor repassou a tarefa para outro detetive e não parece muito feliz com você.");
            scanner.close();
            return;
        } else if (!resposta.equalsIgnoreCase("S")) {
            System.out.println("Resposta inválida. Por favor, digite 'S' ou 'N'.");
            scanner.close();
            return;
        }
        
        // Ganhar nível de entendimento da investigação
        nivelEntendimento += 10;
        System.out.println("Você ganhou 10% de nível de entendimento da investigação. Seu nível agora é " + nivelEntendimento + "%.");
        
        // Começo da investigação
        System.out.println("\nVocê chega na cena do crime e encontra o corpo de um homem de cerca de cinquenta anos de idade ensanguentado em um galpão qualquer...");
        System.out.println("Você decide investigar o corpo ou a cena? (Corpo/Cena)");
        
        resposta = scanner.nextLine();
        
        // Verificação da escolha de investigar o corpo ou a cena
        if (resposta.equalsIgnoreCase("Corpo")) {
            System.out.println("Você decide investigar o corpo. Encontra marcas de esfaqueamento no peito da vítima e um anel com um monograma estranho na mão.");
            System.out.println("Você deseja procurar a arma do crime ou pedir para outro detetive fazer? (Arma/Outro)");
            resposta = scanner.nextLine();
            
            if (resposta.equalsIgnoreCase("Arma")) {
                System.out.println("Você encontra uma faca ensanguentada escondida embaixo de um monte de detritos.");
                System.out.println("Você deseja procurar o DNA na faca ou verificar a procedência da faca? (DNA/Procedencia)");
                resposta = scanner.nextLine();
                
                if (resposta.equalsIgnoreCase("DNA")) {
                    System.out.println("Você encontra um DNA que corresponde ao de um dos suspeitos conhecidos. Seu nome é João Alves, um talentoso mecânico local, as provas são incotestavéis.");
                    int aumento = 100 - nivelEntendimento;
                    nivelEntendimento += aumento; // Ajuste para alcançar 100% de entendimento
                    System.out.println("Você ganhou " + aumento + "% de nível de entendimento da investigação. Seu nível agora é 100%. Parabéns você ganhou!");
                } else if (resposta.equalsIgnoreCase("Procedencia")) {
                    System.out.println("A faca possui uma inscrição que sugere um fabricante local. Você descobre que apenas dois homens da cidade têm acesso a essa faca.");
                    System.out.println("Você precisa escolher entre os dois suspeitos para interrogar: João Alves ou Carlos Alves? (Joao/Carlos)");
                    resposta = scanner.nextLine();
                    
                    if (resposta.equalsIgnoreCase("Joao") || resposta.equalsIgnoreCase("João Alves")) {
                        System.out.println("Parabéns! Você escolheu o suspeito correto. Ele confessa o crime, e você resolve o caso! Seu nível de entendimento do caso chega em 100%");
                        nivelEntendimento = 100; // Ajuste para alcançar 100% de entendimento
                    } else if (resposta.equalsIgnoreCase("Carlos") || resposta.equalsIgnoreCase("Carlos Alves")) {
                        System.out.println("Você escolheu o suspeito errado. Ele parece surpreso com a acusação, mas você não encontra provas suficientes para prendê-lo.");
                        System.out.println("João Alves, o irmão de Carlos, percebendo que a situação está ficando perigosa, decide fugir.");
                        System.out.println("Você deseja perseguir João Alves? (S/N)");
                        resposta = scanner.nextLine();
                        
                        if (resposta.equalsIgnoreCase("S")) {
                            // Diminuir nível de entendimento por escolha errada
                            nivelEntendimento -= 20;
                            System.out.println("Você persegue João Alves pelas ruas escuras da cidade. Ele é ágil, mas você não consegue alcançá-lo.");
                            System.out.println("Você perdeu 20% de nível de entendimento da investigação. Seu nível agora é " + nivelEntendimento + "%.");
                            System.out.println("Com João Alves fugindo, você continua sua investigação.");
                        } else {
                            System.out.println("Você decide não perseguir João Alves, deixando-o escapar. Sua investigação continua, mas você perdeu uma oportunidade importante.");
                        }
                    } else {
                        System.out.println("Resposta inválida. Por favor, digite 'Joao' ou 'Carlos'.");
                    }
                } else {
                    System.out.println("Resposta inválida. Por favor, digite 'DNA' ou 'Procedencia'.");
                }
            } else if (resposta.equalsIgnoreCase("Outro")) {
                System.out.println("Você pede para outro detetive procurar a arma do crime. Ele não consegue encontrá-la.");
            } else {
                System.out.println("Resposta inválida. Por favor, digite 'Arma' ou 'Outro'.");
            }
        } else if (resposta.equalsIgnoreCase("Cena")) {
            System.out.println("Você decide investigar a cena. Encontra pegadas de sangue ao redor do corpo e um bilhete enigmático no chão.");
            System.out.println("Você deseja analisar as pegadas ou verificar o conteúdo do bilhete? (Pegadas/Bilhete)");
            resposta = scanner.nextLine();
            
            if (resposta.equalsIgnoreCase("Pegadas")) {
                System.out.println("Você não encontra nenhuma informação relevante nas pegadas.");
            } else if (resposta.equalsIgnoreCase("Bilhete")) {
                System.out.println("O bilhete contém uma mensagem criptografada que você não consegue decifrar.");
            } else {
                System.out.println("Resposta inválida. Por favor, digite 'Pegadas' ou 'Bilhete'.");
            }
        } else {
            System.out.println("Resposta inválida. Por favor, digite 'Corpo' ou 'Cena'.");
        }
        
        scanner.close();
    }
}

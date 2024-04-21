import java.util.Scanner;

public class Miniprojeto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int porcentagemEntendimento = 0;
        
        System.out.println("Eram duas da manhã em Belo Jardim. O detetive já se encontrava na cama, dormindo quando recebe uma ligação...");
        System.out.println("Supervisor: Detetive, preciso que você compareça a uma cena de crime. Você vai atender ao chamado? (Sim/Não)");
        
        String resposta = scanner.nextLine();
        
        if (resposta.equalsIgnoreCase("Não")) {
            System.out.println("Você recusou o chamado. Seu supervisor repassou a tarefa para outro detetive e não parece muito feliz com você.");
            scanner.close();
            return;
        } else if (!resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Resposta inválida. Por favor, digite 'Sim' ou 'Não'.");
            scanner.close();
            return;
        }
        
        System.out.println("Você chega na cena do crime e encontra o corpo de um homem de cerca de cinquenta anos de idade ensanguentado em um galpão qualquer...");
        System.out.println("Você decide investigar o corpo ou a cena? (Corpo/Cena)");
        
        resposta = scanner.nextLine();
        
        if (resposta.equalsIgnoreCase("Corpo")) {
            System.out.println("Você decide investigar o corpo. Encontra marcas de esfaqueamento no peito da vítima e um anel com um monograma estranho na mão.");
            porcentagemEntendimento += 20;
            
            System.out.println("Você deseja procurar a arma do crime ou pedir para outro detetive fazer? (Arma/Outro)");
            resposta = scanner.nextLine();
            
            if (resposta.equalsIgnoreCase("Arma")) {
                System.out.println("Você encontra uma faca ensanguentada escondida embaixo de um monte de detritos.");
                porcentagemEntendimento += 30;
                
                System.out.println("Você deseja procurar o DNA na faca ou verificar a procedência da faca? (DNA/Procedencia)");
                resposta = scanner.nextLine();
                
                if (resposta.equalsIgnoreCase("DNA")) {
                    System.out.println("Você encontra um DNA que corresponde ao de um dos suspeitos conhecidos.");
                    porcentagemEntendimento += 50;
            }   else if (resposta.equalsIgnoreCase("Procedencia")) {
                    System.out.println("A faca possui uma inscrição que sugere um fabricante local. Você descobre que apenas dois homens da cidade têm acesso a essa faca.");
                    System.out.println("Você precisa escolher entre os dois suspeitos para interrogar: João ou Carlos? (Joao/Carlos)");
                    resposta = scanner.nextLine();
                    
                    if (resposta.equalsIgnoreCase("Joao")) {
                        System.out.println("Parabéns! Você escolheu o suspeito correto. Ele confessa o crime, e você resolve o caso!");
                        porcentagemEntendimento += 50;
                    } else if (resposta.equalsIgnoreCase("Carlos")) {
                        System.out.println("Você escolheu o suspeito errado. Ele parece surpreso com a acusação, mas você não encontra provas suficientes para prendê-lo. E João foge do país ao ouvir da acusação de Carlos");
                    } else {
                        System.out.println("Resposta inválida. Por favor, digite 'Joao' ou 'Carlos'.");
                        scanner.close();
                        return;
                    }
                } else {
                    System.out.println("Resposta inválida. Por favor, digite 'DNA' ou 'Procedência'.");
                    scanner.close();
                    return;
                }
            } else if (resposta.equalsIgnoreCase("Outro")) {
                System.out.println("Você pede para outro detetive procurar a arma do crime. Ele não consegue encontrá-la.");
                porcentagemEntendimento -= 10;
            } else {
                System.out.println("Resposta inválida. Por favor, digite 'Arma' ou 'Outro'.");
                scanner.close();
                return;
            }
        } else if (resposta.equalsIgnoreCase("Cena")) {
            System.out.println("Você decide investigar a cena. Encontra pegadas de sangue ao redor do corpo e um bilhete enigmático no chão.");
            porcentagemEntendimento += 20;
            
            System.out.println("Você deseja analisar as pegadas ou verificar o conteúdo do bilhete? (Pegadas/Bilhete)");
            resposta = scanner.nextLine();
            
            if (resposta.equalsIgnoreCase("Pegadas")) {
                System.out.println("Você não encontra nenhuma informação relevante nas pegadas.");
            } else if (resposta.equalsIgnoreCase("Bilhete")) {
                System.out.println("O bilhete contém uma mensagem criptografada que você não consegue decifrar.");
            } else {
                System.out.println("Resposta inválida. Por favor, digite 'Pegadas' ou 'Bilhete'.");
                scanner.close();
                return;
            }
        } else {
            System.out.println("Resposta inválida. Por favor, digite 'Corpo' ou 'Cena'.");
            scanner.close();
            return;
        }
        
        System.out.println("Porcentagem de entendimento da cena: " + porcentagemEntendimento + "%");
        
        if (porcentagemEntendimento >= 100) {
            System.out.println("Parabéns! Você descobriu quem é o assassino e resolveu o caso!");
        } else {
            System.out.println("Você continua sua investigação...");
        }
        
        scanner.close();
    }
}

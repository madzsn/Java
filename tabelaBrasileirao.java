package com.codigogrande; // Pacote onde a classe está localizada

import java.util.Scanner; // Importa a classe Scanner do pacote java.util

public class Main { // Início da definição da classe Main

    public static void main(String[] args) {
        // Lista de times do Brasileirão
        String[] times = {
                "América Mineiro", "Atlético-PR", "Atlético Mineiro", "Palmeiras", "Botafogo",
                "Corinthians", "Coritiba", "Cruzeiro", "Cuiabá", "Flamengo",
                "Fluminense", "Fortaleza", "Chapecoense", "Goiás", "Internacional",
                "Grêmio", "Santos", "Vasco", "São Paulo", "Sport"
        };

        int[] pontuacoes = new int[times.length];
        int[] cartoesAmarelos = new int[times.length];
        int[] vitorias = new int[times.length];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Visualizar Tabela");
            System.out.println("2 - Editar Pontuação");
            System.out.println("3 - Editar Cartões Amarelos");
            System.out.println("4 - Editar Vitórias");
            System.out.println("0 - Sair");

            int opcao = scanner.nextInt(); // Recebe a opção do usuário

            switch (opcao) {
                case 0:
                    scanner.close();
                    return;
                case 1:
                    exibirTabela(times, pontuacoes, cartoesAmarelos, vitorias);
                    break;
                case 2:
                    editarPontuacao(times, pontuacoes, cartoesAmarelos, vitorias, scanner);
                    break;
                case 3:
                    editarCartoesAmarelos(times, pontuacoes, cartoesAmarelos, vitorias, scanner);
                    break;
                case 4:
                    editarVitorias(times, pontuacoes, cartoesAmarelos, vitorias, scanner);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    public static void exibirTabela(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias) {
        System.out.println("\nPosição | Time | Pontuação | Cartões Amarelos | Vitórias");
        for (int i = 0; i < times.length; i++) {
            System.out.println((i + 1) + " | " + times[i] + " | " + pontuacoes[i] + " | " + cartoesAmarelos[i] + " | "
                    + vitorias[i]);
        }
    }

    public static void exibirTimes(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias) {
        for (int i = 0; i < times.length; i++) {
            System.out.println((i + 1) + " - " + times[i] + " | Pontuação: " + pontuacoes[i] + " | Cartões Amarelos: "
                    + cartoesAmarelos[i] + " | Vitórias: " + vitorias[i]);
        }
    }

    public static void editarPontuacao(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias,
            Scanner scanner) {
        while (true) {
            System.out.println("\nTimes disponíveis para edição: ");
            exibirTimes(times, pontuacoes, cartoesAmarelos, vitorias);
            System.out.println("\nEscolha o número do time para editar a pontuação (ou 0 para voltar): ");

            int posicao = scanner.nextInt();

            if (posicao == 0) {
                break;
            }
            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("\nDigite a nova pontuação para " + times[posicao - 1] + ": ");
                int novaPontuacao = scanner.nextInt();

                if (novaPontuacao >= 0) {
                    pontuacoes[posicao - 1] = novaPontuacao;
                } else {
                    System.out.println("A pontuação não pode ser negativa.");
                }
            } else {
                System.out.println("Posição inválida. Tente novamente.");
            }
        }

        scanner.nextLine();
        ordenarPorPontuacaoECartoesEVitorias(times, pontuacoes, cartoesAmarelos, vitorias);
    }

    public static void editarCartoesAmarelos(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias,
            Scanner scanner) {
        while (true) {
            System.out.println("\nTimes disponíveis para edição: ");
            exibirTimes(times, pontuacoes, cartoesAmarelos, vitorias);
            System.out.println("\nEscolha o número do time para editar os cartões amarelos(ou 0 para voltar): ");
            int posicao = scanner.nextInt();
            if (posicao == 0) {
                break;
            }
            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("\nDigite o novo número de cartões amarelos do" + times[posicao - 1] + ": ");
                int novosCartoes = scanner.nextInt();
                if (novosCartoes >= 0) {
                    cartoesAmarelos[posicao - 1] = novosCartoes;
                } else {
                    System.out.println("O número de cartões não pode ser negativo.");
                }
            } else {
                System.out.println("Posição inválida, tente novamente.");
            }
            scanner.nextLine();
            ordenarPorPontuacaoECartoesEVitorias(times, pontuacoes, cartoesAmarelos, vitorias);
        }
    }

    public static void editarVitorias(String[] times, int[] pontuacoes, int[] cartoesAmarelos, int[] vitorias,
            Scanner scanner) {
        while (true) {
            System.out.println("\nTimes disponíveis para edição: ");
            exibirTimes(times, pontuacoes, cartoesAmarelos, vitorias);
            System.out.println("\nEscolha o número do time para editar as vitórias(ou 0 para voltar): ");
            int posicao = scanner.nextInt();

            if (posicao == 0) {
                break;
            }
            if (posicao >= 1 && posicao <= times.length) {
                System.out.println("\nDigite o novo número de vitórias do " + times[posicao - 1] + ": ");
                int novasVitorias = scanner.nextInt();
                if (novasVitorias >= 0) {
                    vitorias[posicao - 1] = novasVitorias;
                } else {
                    System.out.println("O número de vitórias não pode ser negativo.");
                }
            } else {
                System.out.println("Posição inválida, tente novamente.");
            }
            scanner.nextLine();
            ordenarPorPontuacaoECartoesEVitorias(times, pontuacoes, cartoesAmarelos, vitorias);
        }
    }

    // módulo para ordenar os times por pontuação
    public static void ordenarPorPontuacaoECartoesEVitorias(String[] times, int[] pontuacoes, int[] cartoesAmarelos,
            int[] vitorias) {
        for (int i = 0; i < pontuacoes.length - 1; i++) {
            for (int j = i + 1; j < pontuacoes.length; j++) {
                if (pontuacoes[i] < pontuacoes[j]
                        || (pontuacoes[i] == pontuacoes[j] && cartoesAmarelos[i] > cartoesAmarelos[j])
                        || (pontuacoes[i] == pontuacoes[j] && cartoesAmarelos[i] == cartoesAmarelos[j]
                                && vitorias[i] < vitorias[j])) {
                    int tempPontuacao = pontuacoes[i]; // variável temporária para pontuação
                    pontuacoes[i] = pontuacoes[j]; // atualiza a pontuação do time i
                    pontuacoes[j] = tempPontuacao; // atualiza a pontuação do time j

                    int tempCartoes = cartoesAmarelos[i]; // variável temporária para cartões
                    cartoesAmarelos[i] = cartoesAmarelos[j]; // atualiza o número de cartões do time i
                    cartoesAmarelos[j] = tempCartoes; // atualiza o número de cartões do time j

                    int tempVitorias = vitorias[i]; // variável temporária de Vitórias
                    vitorias[i] = vitorias[j]; // atualiza o número de vitórias do time i
                    vitorias[j] = tempVitorias; // atualiza o número de vitórias do time j

                    String tempTime = times[i]; // variável temporária para time
                    times[i] = times[j]; // atualiza o time i
                    times[j] = tempTime; // atualiza o time j
                }
            }
        }
    }
}

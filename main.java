import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.controller.VendaDeDocesController;
package java;

public class Main {
    public static void main(String[] args) {
     String URL = "jdbc:mysql://localhost:3306/BDalg3";
     String USUARIO = "root";
     String SENHA = "123456";
      
     VendaDeDocesController controller = new VendaDeDocesController();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Meu Nome é Gabriel Angelo da Silva");
        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Criar Venda de Doces");
            System.out.println("2. Ler Venda de Doces");
            System.out.println("3. Atualizar Venda de Doces");
            System.out.println("4. Excluir Venda de Doces");
            System.out.println("5. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do doce: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço do doce: ");
                    double preco = scanner.nextDouble();

                    VendaDeDoces novaVenda = new VendaDeDoces();
                    novaVenda.setNome(nome);
                    novaVenda.setPreco(preco);
                    controller.criarVendaDeDoces(novaVenda);
                    System.out.println("Venda de doces criada com sucesso!");
                    break;
                case 2:
                    System.out.print("ID da venda de doces a ser lida: ");
                    int idParaLer = scanner.nextInt();

                    VendaDeDoces vendaLida = controller.lerVendaDeDoces(idParaLer);
                    if (vendaLida != null) {
                        System.out.println("ID: " + vendaLida.getId());
                        System.out.println("Nome: " + vendaLida.getNome());
                        System.out.println("Preço: " + vendaLida.getPreco());
                    } else {
                        System.out.println("Não encontrada.");
                    }
                    break;
                case 3:
                    System.out.print("ID da venda de doces a ser atualizada: ");
                    int idParaAtualizar = scanner.nextInt();
                    scanner.nextLine();

                    VendaDeDoces vendaParaAtualizar = controller.lerVendaDeDoces(idParaAtualizar);

                    if (vendaParaAtualizar != null) {
                        System.out.print("Novo nome do doce: ");
                        String novoNome = scanner.nextLine();
                        System.out.print("Novo preço do doce: ");
                        double novoPreco = scanner.nextDouble();

                        vendaParaAtualizar.setNome(novoNome);
                        vendaParaAtualizar.setPreco(novoPreco);
                        controller.atualizarVendaDeDoces(vendaParaAtualizar);
                        System.out.println("Venda de doces atualizada com sucesso!");
                    } else {
                        System.out.println("Não encontrada.");
                    }
                    break;
                case 4:
                    System.out.print("ID da venda de doces a ser excluída: ");
                    int idParaExcluir = scanner.nextInt();

                    VendaDeDoces vendaParaExcluir = controller.lerVendaDeDoces(idParaExcluir);
                    if (vendaParaExcluir != null) {
                        controller.excluirVendaDeDoces(idParaExcluir);
                        System.out.println("Venda de doces excluída com sucesso!");
                    } else {
                        System.out.println("Não encontrada.");
                    }
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}

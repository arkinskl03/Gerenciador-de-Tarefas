import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Tarefas> tarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int proximoId = 1;
        int opcao;

        do {
            System.out.println("\n1-Adicionar 2-Listar 3-Concluir 4-Remover 0-Sair");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> {
                    System.out.print("Título: ");
                    tarefas.add(new Tarefas(proximoId++, sc.nextLine()));
                }
                case 2 -> tarefas.forEach(System.out::println);
                case 3 -> {
                    System.out.print("ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    tarefas.stream().filter(t -> t.getId() == id)
                            .findFirst().ifPresent(Tarefas::concluir);
                }
                case 4 -> {
                    System.out.print("ID: ");
                    int id = Integer.parseInt(sc.nextLine());
                    tarefas.removeIf(t -> t.getId() == id);
                }
            }
        } while (opcao != 0);
    }
}
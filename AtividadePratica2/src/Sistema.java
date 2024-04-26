public class Sistema {

    private static void exibirMenu() {

        System.out.println("\nEscolinha SYSTEM");
        System.out.println("1) Cadastrar Aluninho");
        System.out.println("2) Cadastrar Professor");
        System.out.println("3) Cadastrar Tia da Merenda");
        System.out.println("4) Procurar Cidadão");
        System.out.println("5) Listar Todos");
        System.out.println("6) Excluir todos os itens cadastrados");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");

    }

    private static void verificarOpcao(int op) {

        int matricula;
        String nome;
        String QualidadesAluninho;
        String QualidadesProfessor;
        String QualidadesTiaDaMerenda; 

        switch (op) {
            case 1:

                System.out.println("\nNovo Aluninho");
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Qualidades do aluninho:");
                QualidadesAluninho = Console.lerString();

                Aluninho a = new Aluninho(matricula, nome, QualidadesAluninho);

                Cadastro.cadastrar(a);

                System.out.println("\nAluninho cadastrado com sucesso!");

                break;

            case 2:

                System.out.println("\nNovo Professor");
                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                System.out.print("Nome: ");
                nome = Console.lerString();

                System.out.print("Qualidades do Professor:");
                QualidadesProfessor = Console.lerString();

                Professor p = new Professor(matricula, nome, QualidadesProfessor);

                Cadastro.cadastrar(p);

                System.out.println("\nProfessor cadastrado com sucesso!");

                break;

            case 3: 

            System.out.println("\nNova Tia da Merenda");
            System.out.print("Matrícula: ");
            matricula = Console.lerInt();

            System.out.print("Nome: ");
            nome = Console.lerString();

            System.out.print("Especialidade da Tia da Merenda:");
            QualidadesProfessor = Console.lerString();

            Professor t = new Professor(matricula, nome, QualidadesProfessor);

            Cadastro.cadastrar(t);

            System.out.println("\nTia da merenda cadastrada com sucesso!");

            break;
            

            case 4:

                System.out.println("\nProcurar Cidadão");

                System.out.print("Matrícula: ");
                matricula = Console.lerInt();

                
                Escolinha f = Cadastro.buscar(matricula);

                if (f != null) {

                    System.out.println("\nCidadão Localizado:");
                    System.out.println(f.toString());
                    return;

                }

                System.out.println("\nCidadão " + matricula + " não foi encontrado");

                break;

            case 5:

                System.out.println("\nTodos os Cidadãos Cadastrados:");

                
                if (Cadastro.getListaCidadãos().size() == 0) {

                    System.out.println("\nNão há Cidadãos cadastrados...");
                    return; 

                }

                
                for (Escolinha temp : Cadastro.getListaCidadãos()) {

                    System.out.println(temp.toString());

                }

                break;

            case 6:

            System.out.println("\nExcluindo todos os itens cadastrados...");

            Cadastro.clear();

            System.out.println("\nTodos os itens foram excluídos com sucesso!");
                    
                break;


            case 0:

                System.out.println("\nO programa foi finalizado...");
                break;

            default:

                System.out.println("\nOpção inválida. Digite novamente.");
                break;
        }

    }

    public static void executar() {

        int op;
        do {

            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);

        } while (op != 0);

    }

}

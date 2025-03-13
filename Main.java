import java.util.Date;
import java.util.List;

// Classe Automóvel
class Automovel {
    private String placa;
    private String cor;
    private String ano;
    private String combustivel;
    private int portas;
    private int quilometragem;
    private String chassis;
    private String renavam;
    private double valorLocacao;
    private Date dataUltimaManutencao;

    public void cadastrarAuto() {
        System.out.println("Automóvel cadastrado.");
    }

    public String editarAuto() {
        return "Automóvel editado";
    }

    public String removerAuto() {
        return "Automóvel removido";
    }

    public String consultarAuto() {
        return "Informações do Automóvel";
    }
}

// Classe Locação
class Locacao {
    private Date dataHoraLocacao;
    private Date dataHoraDevolucao;
    private Automovel automovel;
    private Cliente cliente;
    private double valorTotal;
    private String status;
    private int quantDevolvida;
    private double valorCaucao;

    public void registrarLocal() {
        System.out.println("Locação registrada.");
    }

    public String consultarLocal() {
        return "Informações da Locação";
    }
}

// Classe Cliente
class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private Date dataNascimento;
    private List<Locacao> historicoLocacoes;

    public void cadastrarCliente() {
        System.out.println("Cliente cadastrado.");
    }

    public String consultarCliente(String parameter) {
        return "Informações do Cliente";
    }

    public void editarCliente() {
    }

    public int removerCliente() {
        return 0;
    }
}

// Classe Modelo
class Modelo {
    private String nome;
    private Marca marca;

    public String consultarModelo() {
        return "Informações do Modelo";
    }
}

// Classe Marca
class Marca {
    private String nome;

    public String consultarModelo() {
        return "Informações da Marca";
    }
}

// Classe principal com método main
public class Main {
    public static void main(String[] args) {
        // Código de exemplo para testar a criação de objetos e métodos
        Automovel automovel = new Automovel();
        automovel.cadastrarAuto();

        Locacao locacao = new Locacao();
        locacao.registrarLocal();

        Cliente cliente = new Cliente();
        cliente.cadastrarCliente();

        // Comentamos as linhas onde instanciamos as classes Marca e Modelo, pois não estamos utilizando elas no método main
        // Modelo modelo = new Modelo();
        // Marca marca = new Marca();

        System.out.println("Programa executado com sucesso!");
    }
}

public class Automovel {
    private String matricula; //variáveis de instância
    private String marca;
    private int cilindrada;

    private static final String MATRICULA_POR_OMISSAO = "sem matrícula"; //variáveis de classe ("static")
    private static final String MARCA_POR_OMISSAO = "sem marca";
    private static final int CILINDRADA_POR_OMISSAO = 0;

    private static int totalAutomoveis = 0;

    public Automovel() { //construtor vazio
        matricula = MATRICULA_POR_OMISSAO;
        marca = MARCA_POR_OMISSAO;
        cilindrada = CILINDRADA_POR_OMISSAO;
        totalAutomoveis++; //contador de instância
    }

    public Automovel(String matricula, String marca, int cilindrada) { //construtures têm de ser todos iguais visualmente
        this.matricula = matricula;
        this.marca = marca;
        this.cilindrada = cilindrada;
        totalAutomoveis++;
    }

    public Automovel(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
        cilindrada = CILINDRADA_POR_OMISSAO;
        totalAutomoveis++;
    }

    public Automovel(String marca, int cilindrada) {
        matricula = MATRICULA_POR_OMISSAO;
        this.marca = marca;
        this.cilindrada = cilindrada;
        totalAutomoveis++;
    }
    
}

public class TiaDaMerenda extends Escolinha {

    private String Especialidade;

    public TiaDaMerenda() {
    }

    public TiaDaMerenda(int matricula, String nome, String especialidade) {
        super(matricula, nome);
        this.Especialidade = especialidade;
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.Especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nEspecialidade da Tia da Merenda: " + Especialidade;
    }
}
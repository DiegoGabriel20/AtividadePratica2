public class Professor extends Escolinha {

    private String ConhecimentoDoProf;

    public Professor() {
    }

    public Professor(int matricula, String nome, String nomeDoProjeto) {
        super(matricula, nome);
        this.ConhecimentoDoProf = nomeDoProjeto;
    }

    public String getConhecimentoDoProf() {
        return ConhecimentoDoProf;
    }

    public void setConhecimentoDoProf(String nomeDoProjeto) {
        this.ConhecimentoDoProf = nomeDoProjeto;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nO que o prof manja?: " + ConhecimentoDoProf;
    }

}

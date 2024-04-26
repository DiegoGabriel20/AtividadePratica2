public class Aluninho extends Escolinha {

    private String OqueSabeFazer;

    public Aluninho() {
    }

    public Aluninho(int matricula, String nome, String Qualidade) {
        super(matricula, nome);
        this.OqueSabeFazer = Qualidade;
    }

    public String getOqueSabeFazer() {
        return OqueSabeFazer;
    }

    public void setOqueSabeFazer(String linguagens) {
        this.OqueSabeFazer = linguagens;
    }

    @Override
    public String toString() {

        return super.toString() +
                "\nQualidade do Aluninho?: " + OqueSabeFazer;
    }

}

public class Meses {
    private String nomeMes;

    public Meses(String nomeMes) {
        this.nomeMes = nomeMes;
    }

    public String getNomeMes() {
        return nomeMes;
    }

    public void setNomeMes(String nomeMes) {
        this.nomeMes = nomeMes;
    }

    @Override
    public String toString() {
        return nomeMes;
    }
}

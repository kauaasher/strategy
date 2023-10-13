//          Engenharia de software III - Design Patterns Strategy
//                            Kauã Asher Ribeiro da Silva

public class Disciplina {

    // Atributos
    private ICalcMedia CalcMedia;
    private double media;
    private String nome;
    private double p1;
    private double p2;
    private String Situacao;

    // Metodos
    public ICalcMedia getCalcMedia() {
        return CalcMedia;
    }

    public void setCalcMedia(ICalcMedia calcMedia) {
         CalcMedia = calcMedia;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return Situacao;
    }

    public void SetSituacao(String situacao) {
        Situacao = situacao;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    // Metodo CalcularMedia
    public void CalcularMedia() {
        this.media = this.CalcMedia.CalculaMedia(this.p1, this.p2);
        this.Situacao = this.CalcMedia.Situacao(this.media);
    }

    // Metodo Disciplina
    public Disciplina(ICalcMedia calcMedia) {
        this.CalcMedia = calcMedia;
    }
}

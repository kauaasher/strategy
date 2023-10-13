//          Engenharia de software III - Design Patterns Strategy
//                            Kaua Asher Ribeiro da Silva

public class Aritimetica implements ICalcMedia{

    //Metodo CalculaMedia
    @Override
    public double CalculaMedia(double A, double B) {
        double answer = (A+B)/2;
        return answer;
    }

    //Metodo Situacao
    @Override
    public String Situacao(double media) {
        String resultado;
        if(media>5)
        {
            resultado = "Aprovado";
        } else resultado  = "Reprovado";

        return resultado;
    }
}
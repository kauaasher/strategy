//          Engenharia de software III - Design Patterns Strategy
//                            Kaua Asher Ribeiro da Silva

public class Geometrica implements ICalcMedia{

   //Metodo CalculaMedia
    @Override
    public double CalculaMedia(double A, double B) {
        double answer = Math.sqrt(A*B);
        return answer;
    }

    //Metodo Situacao
    @Override
    public String Situacao(double media) {
        String resultado;
        if(media>7)
        {
            resultado = "Aprovado";
        } else resultado  = "Reprovado";

        return resultado;
    }
}

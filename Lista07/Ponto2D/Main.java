public class Main{
    public static void main(String[] args){
        float x = 2;
        float y = 20;

        Ponto2D ponto = new Ponto2D(x,y);

        Ponto2D segundoPonto = new Ponto2D();

        System.out.println(ponto.distEuclidiana(segundoPonto));
    }
}
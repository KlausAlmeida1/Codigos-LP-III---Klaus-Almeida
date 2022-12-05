public class Main{
    public static void main(String[] args){
        float x = 2;
        float y = 20;
        float z = 5;

        Ponto2D ponto = new Ponto2D(x,y);

        Ponto3DAgregação segundoPonto = new Ponto3DAgregação(ponto,z);

        System.out.println(segundoPonto.toString());
        System.out.println(segundoPonto.distance(1,2,3));
    }
}
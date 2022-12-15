import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
public class Adaga {
    private Image adaga;
    private int x,y;
    private int largura,altura;
    private static final int alturaLimit = 900;
    private static int vel = 3;
    private boolean isVisivel;

    public Adaga(int x, int y){
        this.x = x;
        this.y = y;
        isVisivel = true;
    }

    public void load(){
        ImageIcon referencia = new ImageIcon("imagens\\adaga.png");
        adaga = referencia.getImage();

        this.largura = adaga.getWidth(null)-10;
        this.altura = adaga.getHeight(null)-10;
    }
    
    //Gerencia a atualização da adaga, dando sua velocidade e verificando se a adaga está fora da tela
    public void update(){
        this.y += vel;
        if(this.y>alturaLimit){
            isVisivel = false;
        }
    }

    //Cria um retângulo em volta da adaga para ser utilizado na colisão
    public Rectangle getBounds(){
        return new Rectangle(this.x,this.y,this.largura,this.altura);
    }

    public boolean getVisivel(){
        return this.isVisivel;
    }
    public void setVisivel(boolean isVisivel){
        this.isVisivel = isVisivel;
    }
    public static int getVel(){
        return vel;
    }
    public static void setVel(int velo){
        vel = velo;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public Image getImage(){
        return adaga;
    }
}
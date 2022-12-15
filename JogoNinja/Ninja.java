import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;
public class Ninja {
    private int x,y;
    private int vel;
    private Image ninja;
    private int largura,altura;
    private boolean isVisivel;

    public Ninja(){
        this.x = 400;
        this.y = 420;
        this.vel = 0;
        isVisivel = true;
    }

    public void setVisivel(boolean isVisivel){
        this.isVisivel=isVisivel;
    }
    public boolean getVisivel(){
        return this.isVisivel;
    }
    public void load(){
        ImageIcon referencia = new ImageIcon("imagens\\charuto.png");
        ninja = referencia.getImage();
        altura = ninja.getHeight(null);
        largura = ninja.getWidth(null);
    }
    //Atualiza a posição do ninja conforme o valor de "vel"
    public void update(){
        x = x + vel;
    }

    //Cria um retângulo em volta da player para ser utilizado na colisão
    public Rectangle getBounds(){
        return new Rectangle(this.x,this.y,this.largura,this.altura);
    }
    //faz com que o X do ninja modifique quando as teclas são apertadas
    public void keyPressed(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if(codigo == KeyEvent.VK_LEFT){
            vel = -7;
        }
        if(codigo == KeyEvent.VK_RIGHT){
            vel = +7;
        }
    }
    //faz a mudança no valor da velocidade do ninja para 0 quando a tecla deixa de ser apertada
    public void keyRelease(KeyEvent tecla){
        int codigo = tecla.getKeyCode();

        if(codigo == KeyEvent.VK_LEFT){
            vel = 0;
        }
        if(codigo == KeyEvent.VK_RIGHT){
            vel = 0;
        }
    }
    public Image getNinja(){
        return ninja;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}

import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.Rectangle;
import javax.swing.*;

public class Fase extends JPanel implements ActionListener{
    private Image fundo;
    private Image chao;
    private Ninja ninja;
    private Timer timer;
    private List<Adaga> adaga;
    private boolean emJogo;
    
    public Fase(){
        setFocusable(true);
        setDoubleBuffered(true);
        ImageIcon referencia = new ImageIcon("imagens\\konoha.jpg");
        this.fundo = referencia.getImage();
        ImageIcon referencia2 = new ImageIcon("imagens\\layer.png");
        this.chao = referencia2.getImage();
        this.ninja = new Ninja();
        this.ninja.load();
        addKeyListener(new TecladoAdapter());
        this.timer = new Timer(3,this);
        this.timer.start();
        inicializaAdagas();
        this.emJogo = true;
    }   
    //coloca as adagas bem acima da tela
    public void inicializaAdagas(){
        int cordenadas [] = new int [70];
        adaga = new ArrayList<Adaga>();

        for(int i = 0; i<cordenadas.length;i++){
            int x = (int)(Math.random()*710);
            int y = (int)(Math.random()*8000+600);
            adaga.add(new Adaga(x,-y));
        }
    }
    //desenha os graficos do jogo
    public void paint(Graphics g){
        Graphics2D graficos = (Graphics2D) g;
        if(emJogo==true){
            graficos.drawImage(fundo,-100,0,null);
            graficos.drawImage(chao,0,-220,null);
            graficos.drawImage(ninja.getNinja(),ninja.getX(),ninja.getY(),this);
            for (int i = 0; i < adaga.size();i++){
                Adaga in = adaga.get(i);
                in.load();
                graficos.drawImage(in.getImage(), in.getX(), in.getY(),this);
            }
        }
        else{
            ImageIcon fimJogo = new ImageIcon("imagens\\wallpaper.jpg");
            graficos.drawImage(fimJogo.getImage(), 0,0,null);
        }
       
        g.dispose();
    }
    //atualiza os dados do jogador e de todas as adagas na lista, alem de remover elas quando saem da tela.
    @Override
    public void actionPerformed(ActionEvent e){
        ninja.update();
        for (int i = 0; i < adaga.size();i++){
            Adaga in = adaga.get(i);
            if(in.getVisivel()){
                in.update();
            }else {
                adaga.remove(i);
            }
        }
        checarColisoes();
        //repintar a tela a cada frame
        repaint();
    }
    //Verifica a colisao entre o jogador e a adaga
    public void checarColisoes(){
        Rectangle formaNinja = ninja.getBounds();
        Rectangle formaAdaga;

        for(int i = 0; i < adaga.size();i++){
            Adaga tempAdaga = adaga.get(i);
            formaAdaga = tempAdaga.getBounds();
            if(formaNinja.intersects(formaAdaga)){
                this.ninja.setVisivel(false);
                tempAdaga.setVisivel(false);
                this.emJogo = false;
            }
        }
    }



    private class TecladoAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            ninja.keyPressed(e);
        }
        @Override
        public void keyReleased(KeyEvent e){
            ninja.keyRelease(e);
        }
    }
}

public class Ponto2D {
    private float x,y;

    public Ponto2D(float x,float y){
        this.x = x;
        this.y = y;
    }

    public Ponto2D(){
        this(0,0);
    }
    public Ponto2D(Ponto2D p){
        this(p.getX(),p.getY());
    }


    public float getX(){
        return this.x;
    }

    public float getY(){
        return this.y;
    }

    public boolean inAxisX(){
        if(this.y==0 && this.x!=0){
            return true;
        }
        return false;
        
    }

    public boolean inAxisY(){
        if(this.x==0 && this.y!=0){
            return true;
        }
        return false;  
    }
    public boolean inAxis(){
        if(this.x!=0 && this.y!=0){
            return true;
        }
        return false;  
    }

    public boolean isOrigin(){
        if(this.x==0 && this.y==0){
            return true;
        }
        return false;
    }
  
    public void imprimirPonto(){
        System.out.printf("Ponto x:%f\nPonto y:%f\n",x,y);
    }

    public double distance(Ponto2D ponto){
        float difX = this.x - ponto.x;
        float difY = this.y - ponto.y;
        return Math.sqrt((difX)*(difX)+(difY)*(difY));
    }

    public double distance(float x,float y){
        float difX = this.x - x;
        float difY = this.y - y;
        return Math.sqrt((difX)*(difX)+(difY)*(difY));
    }

    public double distance(){
        return this.distance(0,0);
    }
}
public class Ponto3DAgregação {
    private float z;
    private Ponto2D p;

    public Ponto3DAgregação(Ponto2D p,float z){
        this.p = p;
        this.z = z;
    }

    public Ponto3DAgregação(){
        this(null,0);
    }
    public Ponto3DAgregação(Ponto2D p){
        this(p,0);
    }

    public String toString(){
        return p.toString()+" z:"+Float.toString(this.z);
    }
    public float getX(){
        return this.p.getX();
    }

    public float getY(){
        return this.p.getY();
    }
    public float getZ(){
        return this.z;
    }

    public boolean inAxisX(){
        if(p.inAxisX()== true && this.z!=0){
            return true;
        }
        return false;
        
    }

    public boolean inAxisY(){
        if(p.inAxisY()== true && this.z!=0){
            return true;
        }
        return false;  
    }
    public boolean inAxisZ(){
        if(p.inAxis()== true && this.z==0){
            return true;
        }
        return false;  
    }

    public boolean inAxis(){
        if(p.inAxis()== true && this.z!=0){
            return true;
        }
        return false;  
    }

    public boolean isOrigin(){
        if(p.isOrigin() && this.z!=0){
            return true;
        }
        return false;
    }
  
    public void imprimirPonto(){
        System.out.printf("Ponto x:%f\nPonto y:%f \n Ponto z: %f",this.p.getX(),this.p.getY(),this.z);
    }

    public double distance(float x,float y,float z){
        float difX = this.p.getX() - x;
        float difY = this.p.getY() - y;
        float difZ = this.z - z;
        return Math.sqrt((difX)*(difX)+(difY)*(difY)+(difZ)*(difZ));
    }

    public double distance(){
        return this.distance(0,0,0);
    }
}
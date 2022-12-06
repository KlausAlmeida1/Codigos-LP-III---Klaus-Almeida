public class Ponto3DHerança extends Ponto2D {
    float z;
    public Ponto3DHerança(float x,float y,float z){
        super(x,y);
        this.z = z;

    }
    @Override
    public String toString(){
        return super.toString()+" z:"+Float.toString(this.z);
    }
    
    public float getZ(){
        return this.z;
    }
    @Override
    public boolean inAxisX(){
        if(super.inAxisX()== true && this.z!=0){
            return true;
        }
        return false;
        
    }
    @Override
    public boolean inAxisY(){
        if(super.inAxisY()== true && this.z!=0){
            return true;
        }
        return false;  
    }
    public boolean inAxisZ(){
        if(super.inAxis()== true && this.z==0){
            return true;
        }
        return false;  
    }
    @Override
    public boolean inAxis(){
        if(super.inAxis()== true && this.z!=0){
            return true;
        }
        return false;  
    }
    @Override
    public boolean isOrigin(){
        if(super.isOrigin() && this.z!=0){
            return true;
        }
        return false;
    }
    @Override
    public void imprimirPonto(){
        System.out.printf("Ponto x: %f\nPonto y: %f \nPonto z: %f",this.getX(),this.getY(),this.z);
    }
    
    public double distance(float x,float y,float z){
        float difX = this.getX() - x;
        float difY = this.getY() - y;
        float difZ = this.z - z;
        return Math.sqrt((difX)*(difX)+(difY)*(difY)+(difZ)*(difZ));
    }

    public double distance(){
        return this.distance(0,0,0);
    }
}

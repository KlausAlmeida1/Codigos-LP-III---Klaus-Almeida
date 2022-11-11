public class Ponto2D {
    private float x,y;
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }
    public boolean isEixoX(){
        if(this.y==0 && this.x!=0){
            return true;
        }
        return false;
        
    }
    public boolean isEixoY(){
        if(this.x==0 && this.y!=0){
            return true;
        }
        return false;  
    }
    public boolean isEixos(){
        if(this.x==0 && this.y==0){
            return true;
        }
        return false;
    }
    public int quadrante(){
        if(isEixos()||isEixoX()||isEixoY()){
            return 0;
        }
        if(this.y>0&&this.x>0){
            return 1;
        }
        if(this.y>0&&this.x<0){
            return 2;
        }
        if(this.y<0&&this.x<0){
            return 3;
        }
        return 4;
    }
    public void imprimirPonto(){
        System.out.printf("Ponto x:%f\nPonto y:%f\n",x,y);
    }
    public double distEuclidiana(Ponto2D ponto){
        float difX = this.x - ponto.x;
        float difY = this.y - ponto.y;
        return Math.sqrt((difX)*(difX)+(difY)*(difY));
    }
}

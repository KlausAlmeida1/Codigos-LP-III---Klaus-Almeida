public class LivroBiblioteca extends Livro implements ItemBiblioteca {
    private boolean  estaEmprestado;
    private String localizacao;
    LivroBiblioteca(String titulo,String autor,int nroPagina,int anoEdicao,boolean estaEmprestado,String localizacao){
        super(titulo,autor,nroPagina,anoEdicao);
        this.estaEmprestado=estaEmprestado;
        this.localizacao=localizacao;
    }
    public String descricao(){
        return super.toString();
    }
    public boolean estaEmprestado(){
        if(this.estaEmprestado){
            return true;
        }
        return false;
    }
    public void devolver(){
        this.estaEmprestado=false;
    }
    public void emprestar(){
        this.estaEmprestado=true;
    }
    public String localizacao(){
        return "\nlocalizacao: "+this.localizacao;
    }
    @Override
    public String toString(){
        return super.toString()+localizacao()+"\nEstaEmprestado: "+estaEmprestado;
    }
}

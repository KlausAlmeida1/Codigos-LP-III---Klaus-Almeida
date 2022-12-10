public class Livro{
    private String titulo,autor;
    private int nroPagina,anoEdicao;
    Livro(String titulo,String autor,int nroPagina,int anoEdicao){
        this.titulo=titulo;
        this.autor=autor;
        this.nroPagina=nroPagina;
        this.anoEdicao=anoEdicao;
    }
    public String getAutor(){
       return this.autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String toString(){
        return "\ntitulo: "+this.titulo+"\nautor: "+this.autor+"\nedicao: "+Integer.toString(this.anoEdicao)+"\npagina: "+Integer.toString(this.nroPagina);
    }
}
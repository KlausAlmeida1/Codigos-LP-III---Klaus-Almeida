package PessoaFuncionarioChefe;
class Pessoa {
    String nome;
    long id;
    Data nascimento;
    public Pessoa(String nome,long id,Data dataNascimento){
        this.nascimento = dataNascimento;
        this.nome = nome;
        this.id = id;
    }
    public String toString(){
        return "nome: "+nome+"\nid: "+Long.toString(id)+"\nNascimento: "+nascimento.dataFomatada();
    }
    public double CalculaEmprestimo(){
        return 1000;
    }
}
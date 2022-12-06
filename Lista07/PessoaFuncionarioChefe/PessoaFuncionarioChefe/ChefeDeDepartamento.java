package PessoaFuncionarioChefe;

public class ChefeDeDepartamento extends Funcionario {
    String departamento;
    Data promocaoChefe;
    public ChefeDeDepartamento(String nome,long id,Data dataNascimento,Data admissao,String departamento,Data promocao){
        super(nome,id,dataNascimento,admissao);
        super.qualSalario("ChefeDeDepartamento");
        this.departamento = departamento;
        this.promocaoChefe = promocao;
    }
    @Override
    public String toString(){
        return super.toString()+"\nDepartamento: "+this.departamento+"\n Data da promocaoChefe"+this.promocaoChefe.dataFomatada();
    }
    public String getDepartamento(){
        return this.departamento;
    }
    @Override
    public double CalculaEmprestimo(){
        return super.CalculaEmprestimo();
    }
}

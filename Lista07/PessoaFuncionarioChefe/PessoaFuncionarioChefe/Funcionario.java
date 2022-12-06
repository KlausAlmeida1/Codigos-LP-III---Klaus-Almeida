package PessoaFuncionarioChefe;

public class Funcionario extends Pessoa {
    Data admissao;
    double salario;
    public Funcionario(String nome,long id,Data dataNascimento,Data admissao){
        super(nome,id,dataNascimento);
        this.admissao = admissao;
        this.salario = 0;
    }
    @Override
    public String toString(){
        return super.toString()+"\nAdmissao: "+admissao.dataFomatada()+"\nSalario: "+Double.toString(salario);
    }
    public void qualSalario(String cargo){
        switch(cargo){
            case "ChefeDeDepartamento":
                this.salario = 15000;
                break;
            case "Junior":
                this.salario = 3000;
                break;
            default:
                this.salario = 900;
            break;
        }
    }
    @Override
    public double CalculaEmprestimo(){
        if(this.salario==15000){
            return 30000;
        }
        return 1000+salario*0.75;
    }

    
    
}

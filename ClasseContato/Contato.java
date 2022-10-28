public class Contato {
    private String nome,telefone;
    private String email;
    private int dia = 2,mes = 3,ano= 2000;
    private int idade=0;
    public int diaAtual,mesAtual,anoAtual;
    Data2 data = new Data2();
    
    public void setInicializaDados(String email,String telefone,String nome,int dia,int mes,int ano){
        this.email = email;
        this.nome = nome;
        this.telefone = telefone;
        this.dia = dia;
        this.email = email;
        this.dia = dia;
    }
    public void setInicializaDadosAtuais(int dia,int mes,int ano){
        this.diaAtual = dia;
        this.mesAtual = mes;
        this.anoAtual = ano;
    }

    public void imprimeDados(){
        data.setInicializarData(dia, mes, ano);
        data.getImprimirdataExtenso();
        System.out.println("nome: "+nome+"  email: "+email+"telefone: "+telefone);
        calculaIdade();
        System.out.println("idade: "+idade);
    }
    public int getIdade(){
        calculaIdade();
        return idade;
    }
    public void calculaIdade(){
        this.idade = anoAtual - ano;
        if(mesAtual<mes || (mesAtual==mes && diaAtual<dia)){
            this.idade -=1;
        }
    }
    
}
  
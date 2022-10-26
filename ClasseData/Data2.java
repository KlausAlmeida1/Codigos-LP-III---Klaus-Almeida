public class Data2 {
    private int dia,mes,ano;
    private String mesExtenso;

    public void setInicializarData(int dia,int mes,int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        
        return;
    }


    public boolean VerificaData(){
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            if(dia<=31){
                return true;
            }
        }

        else if(mes==4 || mes==6 || mes==9 || mes==11){
            if(dia<=30){
                return true;
            }
        }     

        else if (mes==2){
            if ((ano%4==0) || (ano%400==0 && ano%100==0)){
                if(dia<=29){
                    return true;
                }  
            }   

            else if(dia<=28){
                return true;
            }        
        }
        return false;
    }

    public void getImprimirdata(){
        if(VerificaData()){
            System.out.printf("%d/%d/%d",dia,mes,ano);
        }
        else{
            System.out.println("data invalida ");
        }
    }
    public void getImprimirdataExtenso(){
        switch(mes){
            case 1:
                this.mesExtenso = "janeiro";
                break;
            case 2:
                this.mesExtenso = "fevereiro";
                break;
            case 3:
                this.mesExtenso = "março";
                break;
            case 4:
                this.mesExtenso = "abril";
                break;
            case 5:
                this.mesExtenso = "maio";
                break;
            case 6:
                this.mesExtenso = "junho";
                break;
            case 7:
                this.mesExtenso = "julho";
                break;
            case 8:
                this.mesExtenso = "agosto";
                break; 
            case 9:
                this.mesExtenso = "setembro";
                break;
            case 10:
                this.mesExtenso = "outubro";
                break;    
            case 11:
                this.mesExtenso = "novembro";
                break;
            case 12:
                this.mesExtenso = "dezembro";
                break;                     
        }
        if(VerificaData()){
        System.out.printf("dia %d de %s de %d",dia,mesExtenso,ano);
        }
        else{
            System.out.println("data invalida ");
        }
    }

}

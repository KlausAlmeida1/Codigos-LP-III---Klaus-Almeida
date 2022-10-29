class Main {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      Contato contato = new Contato("klaus842@gmail.com","73988773074","Klaus",24,03,2000);

      contato.setInicializaDadosAtuais(28, 10, 2022);
      contato.imprimeDados();
    }
  }
  
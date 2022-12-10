public interface ItemBiblioteca {
    int maxDiasEmprestimo=14;

    boolean estaEmprestado();
    void emprestar();
    void devolver();
    String localizacao();
    String descricao();
}

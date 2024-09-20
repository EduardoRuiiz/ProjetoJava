public class Carne {
    private String nome;
    private String tipo;
    private int quantidade;
    

    public Carne(String nomecarne, String tipocarne, int quantidadecarne)
    {

        this.nome = nomecarne;
        this.tipo = tipocarne;
        this.quantidade = quantidadecarne;
    }
     public String getNome()
     {
        return nome;
     }
     public String getTipo()
     {
        return tipo;
     }
     public int getQuant()
     {
        return quantidade;
     }
     public void setNome(String nome)
     {
        this.nome = nome;
     }
     public void setTipo(String tipo)
     {
        this.tipo = tipo;
     }
     public void setQuant(int quantidade)
     {
        this.quantidade = quantidade;
     }








}

package starwars;

public class Forca {
    protected int forca;
    protected int vida;
    protected String genero;
    protected String nome;

    public Forca(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void atacar(Forca f) {
        System.out.println(this.nome + " atacou " + f.nome);
    }
}

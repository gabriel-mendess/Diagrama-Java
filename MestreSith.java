package starwars;

public class MestreSith extends Sith implements Raios {
    public MestreSith(String nome, int vida) {
        super(nome, vida);
        this.forca = 120;
    }

    @Override
    public void usarRaio() {
        System.out.println(this.nome + " usou Raio");
    }
}

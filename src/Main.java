import it.epicode.be.dipastratto.Dipendente;
import it.epicode.be.dipstandard.DipendenteStandard;

public class Main {
    public static void main(String[] args) {
        Dipendente operai1 = new DipendenteStandard(1, Dipendente.Livello.OPERAIO, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente operai2 = new DipendenteStandard(2, Dipendente.Livello.OPERAIO, Dipendente.Dipartimento.PRODUZIONE);
        Dipendente impiegato = new DipendenteStandard(3, Dipendente.Livello.IMPIEGATO, Dipendente.Dipartimento.AMMINISTRAZIONE);
        Dipendente dirigente = new DipendenteStandard(4, Dipendente.Livello.DIRIGENTE, Dipendente.Dipartimento.VENDITE);



        System.out.println("stato iniziale dei dipendenti");
        operai1.stampaDatiDipendente();
        operai2.stampaDatiDipendente();
        impiegato.stampaDatiDipendente();
        dirigente.stampaDatiDipendente();


        System.out.println("\n promuove operaio a impiegato");
        operai2.promuovi();
        operai2.stampaDatiDipendente();

        System.out.println("\n promuove impiegato a quadro");
        impiegato.promuovi();
        impiegato.stampaDatiDipendente();

        System.out.println("stato aggiornato dei dipendenti");
        operai1.stampaDatiDipendente();
        operai2.stampaDatiDipendente();
        impiegato.stampaDatiDipendente();
        dirigente.stampaDatiDipendente();





    }
}
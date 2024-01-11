package it.epicode.be.dipstandard;

import it.epicode.be.dipastratto.Dipendente;

public class DipendenteStandard  extends Dipendente {
    public DipendenteStandard(int matricola, Livello livello, Dipartimento dipartimento) {
        super(matricola, livello, dipartimento);
        this.importoOrarioStraordinario = 30.0;
    }
    @Override
    public void stampaDatiDipendente() {
        System.out.println("Matricola: " + matricola);
        System.out.println("Livello: " + livello);
        System.out.println("Dipartimento: " + dipartimento);
        System.out.println("Stipendio: " + stipendio);
        System.out.println("Importo Orario Straordinario: " + importoOrarioStraordinario);
    }
@Override
    public Livello promuovi() {
        switch (livello) {
            case OPERAIO :
                livello = Livello.IMPIEGATO;
                break;
            case IMPIEGATO:
                livello = Livello.QUADRO;
                break;
            case QUADRO:
                livello = Livello.DIRIGENTE;
                break;
            case DIRIGENTE:
                System.out.println("Il Dirigente  è già un dirigente, non ci sono più promozioni");
                break;
        }
    // Dopo aver gestito la promozione, calcola lo stipendio base e assegna il nuovo valore
    this.stipendio = calcolaStipendioBase();


    return livello;


}
    @Override
    public double calcolaStipendio() {
        return stipendio;
    }
    @Override
    public double calcolaPagaPlus(int orestraordinario) {
        double pagaBase = calcolaStipendio();
        double pagaStraordinario = orestraordinario * importoOrarioStraordinario;
        return pagaBase + pagaStraordinario;
    }

}

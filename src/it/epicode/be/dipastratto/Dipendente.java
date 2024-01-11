package it.epicode.be.dipastratto;

public abstract class Dipendente {
    private static double stipendioBase = 1000.0;

    protected int matricola;
    protected double stipendio;
    protected double importoOrarioStraordinario;
    protected Livello livello;
    protected Dipartimento dipartimento;
 public enum Livello {
     OPERAIO,IMPIEGATO,QUADRO,DIRIGENTE
 }
    public enum Dipartimento {
        PRODUZIONE, AMMINISTRAZIONE, VENDITE
    }

    public Dipendente(int matricola, Livello livello, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.livello = livello;
        this.dipartimento = dipartimento;
        this.stipendio = calcolaStipendioBase();
    }

    public abstract void stampaDatiDipendente();
    public abstract Livello promuovi();
    public abstract double calcolaStipendio();
    public abstract double calcolaPagaPlus(int importoOrarioStraordinario);

    protected double calcolaStipendioBase() {
        switch (livello) {
            case OPERAIO:
                return stipendioBase; // L'operaio riceve solo lo stipendio base
            case IMPIEGATO:
                return stipendio * 1.2; // Aggiunta del 20% per gli impiegati
            case QUADRO:
                return stipendioBase * 1.5; // Aggiunta del 50% per i quadri
            case DIRIGENTE:
                return stipendioBase * 2.0; // Il doppio per i dirigenti
            default:
                return stipendioBase;
        }
    }

    public static double getStipendioBase() {
        return stipendioBase;
    }

    public int getMatricola() {
        return matricola;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Livello getLivello() {
        return livello;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
        this.importoOrarioStraordinario = importoOrarioStraordinario;
    }
}

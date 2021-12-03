public class Quest2{
    int andag, andat, cap, np;

    public void comeco(int c, int tt) {
        this.andag = 0;
        this.np = 0;
        this.andat = tt;
        this.cap = c;
    }

    public void enche() {
        if (np < cap) {
            np = np + 1;
        } else {
            System.out.println("O elevador esta cheio");
        }
    }

    public void esvazia() {
        if (np > 0) {
            np = np - 1;
        } else {
            System.out.println("O elevador esta vazio");
        }
    }

    public void cima() {
        if (andag < andag) {
            andag = andag + 1;
        } else {
            System.out.println("Voce chegou ao topo");
        }
    }

    public void baixo() {
        if (andag > 0) {
            andag = andag - 1;
        } else {
            System.out.println("Você chegou ao terreo");
        }
    }

    public int getAt() {
        return andag;
    }

    public int getTot() {
        return andat;
    }

    public int getPres() {
        return np;
    }

    public int getCapa() {
        return cap;
    }

    public void setCapa(int a) {
        this.cap = a;
    }

    public void setTot(int a) {
        this.andat = a;
    }

    public void setPres(int a) {
        this.np = a;
    }

    public void setAt(int a) {
        this.andag = a;
    }

}
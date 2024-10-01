public class No <T> {
    private T elemento;
    private T ponteiro;

    public No(T elemento) {
        this.elemento = elemento;
        this.ponteiro = null;
    }

    public No(T elemento, T ponteiro) {
        this.elemento = elemento;
        this.ponteiro = ponteiro;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public T getPonteiro() {
        return ponteiro;
    }

    public void setPonteiro(T ponteiro) {
        this.ponteiro = ponteiro;
    }

    @Override
    public String toString() {
        return "No{" +
                "elemento=" + elemento +
                ", ponteiro=" + ponteiro +
                '}';
    }
}

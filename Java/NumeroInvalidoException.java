public class NumeroInvalidoException extends Exception{
    public NumeroInvalidoException(String mensagem){
        super(mensagem);
    }

    public NumeroInvalidoException(){
        super("Numero Invalido!");
    }

}

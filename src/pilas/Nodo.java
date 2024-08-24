package pilas;

public class Nodo {
	// Variable en la cual se va a guardar el valor.
    private int valor;
    // Variable para enlazar los nodos.
    private Nodo siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public  Nodo(){
        this.setValor(0);
        this.setSiguiente(null);
    }
    
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
}

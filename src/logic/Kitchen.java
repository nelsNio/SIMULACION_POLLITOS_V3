/**
 * @author: Fonseca Cano. Leidy Nathalia.
 * @author: Niño Verdugo. Nelson Andres
 * @version: 3.0
 */
package logic;

import model.MyQueue;

public class Kitchen {
	MyQueue<Chef> filaCongelador;
	MyQueue<Order> pedidos;
	
	public Kitchen() {
	pedidos= new MyQueue<>();
	filaCongelador= new MyQueue<>();
	
	}
	
	public MyQueue<Chef> getFilaCongelador() {
		return filaCongelador;
	}

	public void setFilaCongelador(MyQueue<Chef> filaCongelador) {
		this.filaCongelador = filaCongelador;
	}


}

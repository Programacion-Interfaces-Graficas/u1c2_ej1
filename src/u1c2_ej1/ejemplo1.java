package u1c2_ej1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class ejemplo1 {
	

	public ejemplo1() {
		//Crear un nuevo contenedor JFrame
		JFrame ventana=new JFrame("Ejemplo 1");
		//Asignar el tamaño inicial de la ventana
		ventana.setSize(250,100);
		//Terminar el programa cuando el usuario cierre la ventana
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Crear un etiqueta usando el componente JLabel
		JLabel etiqueta=new JLabel("Sencilla aplicacion de Swing");
		//Añadir la etiqueta al panel de contenido
		ventana.add(etiqueta);
		//Mostrar la ventana
		ventana.setVisible(true);
		
	}

	public static void main(String[] args) {
		//Crea la ventana en el subproceso de entrega de eventos
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ejemplo1();
			}
			
		});

	}

}

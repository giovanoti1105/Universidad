import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JTextField;

public class LaPrimitivaEventos implements ItemListener, ActionListener, Runnable
{
	LaPrimitiva gui;
	Thread jugando;

	public LaPrimitivaEventos(LaPrimitiva in)
	{
		gui = in;
	}

	void limpiarCampos()
	{
		for (int i = 0; i < 6; i++)
		{
			gui.numeros[i].setText(null);
			gui.ganadores[i].setText(null);
		}
		gui.obtener3.setText("0");
		gui.obtener4.setText("0");
		gui.obtener5.setText("0");
		gui.obtener6.setText("0");
		gui.intentos.setText("0");
		gui.years.setText("0");
	}

	// funcion que convieerte los string en enteros y aumenta el numero
	void addUnoACampo(JTextField field)
	{
		int num = Integer.parseInt("0" + field.getText());
		num++;
		field.setText("" + num);
	}

	/**
	 * funcion que valida la no existencia de un numero repetido recibe como @param
	 * pastNums, @param pastNums, @param count
	 */

	boolean numeroRepetido(int num, JTextField[] pastNums, int count)
	{
		for (int i = 0; i < count; i++)
		{
			if (Integer.parseInt(pastNums[i].getText()) == num)
			{
				return true;
			}
		}
		return false;
	}

	boolean compararNumeros(JTextField win, JTextField[] allpicks)
	{
		for (int i = 0; i < 6; i++)
		{
			String winText = win.getText();
			if (winText.equals(allpicks[i].getText()))
			{
				return true;
			}
		}
		return false;
	}

	public void actionPerformed(ActionEvent event)
	{
		String comando = event.getActionCommand();
		if (comando.equals("Jugar"))
		{
			empezarJuego();
		}
		if (comando.equals("Parar"))
		{
			pararJuego();
		}
		if (comando.equals("Reiniciar"))
		{
			limpiarCampos();
		}
	}

	public void itemStateChanged(ItemEvent event)
	{
		Object item = event.getItem();
		if(item==gui.automatico)
		{
			for (int i = 0; i < 6; i++)
			{
				int eleccion;
				do
				{
					eleccion = (int) Math.floor(Math.random() * 50 + 1);
					
				} while (numeroRepetido(eleccion, gui.numeros, i));
				gui.numeros[i].setText("" + eleccion);
			}
		}
			else
			{
				for (int j = 0; j < 6; j++){
					gui.numeros[j].setText(null);
				}
			}
		}

	void empezarJuego()
	{
		jugando = new Thread(this);
		jugando.start();
		gui.jugar.setEnabled(false);
		gui.parar.setEnabled(true);
		gui.reiniciar.setEnabled(false);
		gui.automatico.setEnabled(false);
		gui.manual.setEnabled(false);
	}

	void pararJuego()
	{
		gui.parar.setEnabled(false);
		gui.jugar.setEnabled(true);
		gui.reiniciar.setEnabled(true);
		gui.automatico.setEnabled(true);
		gui.manual.setEnabled(true);
		jugando = null;
	}

	public void run(){
		Thread thisThread = Thread.currentThread();
		while (jugando == thisThread){
			addUnoACampo(gui.intentos);
			int draw = Integer.parseInt(gui.intentos.getText());
			float numYears = (float) draw / 104;
			gui.years.setText("" + numYears);

			int matches = 0;
			for (int i = 0; i < 6; i++){
				int bola;
				do{
					bola = (int) Math.floor(Math.random() * 50 + 1);
				} while (numeroRepetido(bola, gui.ganadores, i));
				gui.ganadores[i].setText("" + bola);
				
				if (compararNumeros(gui.ganadores[i], gui.numeros)){
					matches++;
				}
			}
			switch (matches){
			case 3:
				addUnoACampo(gui.obtener3);
				break;
			case 4:
				addUnoACampo(gui.obtener4);
				break;
			case 5:
				addUnoACampo(gui.obtener5);
				break;
			case 6:
				addUnoACampo(gui.obtener6);
				gui.parar.setEnabled(false);
				gui.jugar.setEnabled(true);
				jugando = null;
			}
			try
			{
				Thread.sleep(100);
			}catch (InterruptedException e){
				// no hacer nada
			}
		}
	}
}
package EntidaesFinancieras;

import javax.swing.JOptionPane;

public class Transaccion {
int fechaTransaccion;
int horaTransaccion;
double saldoCuenta;

//constructor de la clase
    public Transaccion(int fechaTransaccion, int horaTransaccion, int saldoCuenta) {
        this.fechaTransaccion = fechaTransaccion;
        this.horaTransaccion = horaTransaccion;
        this.saldoCuenta = saldoCuenta;
    }
    
    // constructor para objeto de consultas
    public Transaccion() {}
    
    // metodos de la clase
public void retirar(double cantidad){
        /*
     validar primero cliente y tipo de cuenta
     */
    String retirado = JOptionPane.showInputDialog("Ingrese monto a consignar");
    cantidad =Double.parseDouble(retirado);
    if (retirado != null)
    {
        try {
            saldoCuenta=saldoCuenta-cantidad;
            }
        catch (NumberFormatException e)
        {
            System.out.println("Ingrese monto a Retirar");
        }
    }
 }

public void depositar(double cantidad){
     /*
     validar primero cliente y tipo de cuenta
     */     

    String consignado = JOptionPane.showInputDialog("Ingrese monto a consignar");
    cantidad =Double.parseDouble(consignado);
    if (consignado != null)
    {
        try {
            saldoCuenta=saldoCuenta+cantidad;
            }
        catch (NumberFormatException n)
        {
            System.out.println("Ingrese monto a consignar");
        }
    }
 }

public double consultaSaldosCuentas(){
    
    return saldoCuenta;
}

public void historicoTransaccion(){
}
    
}
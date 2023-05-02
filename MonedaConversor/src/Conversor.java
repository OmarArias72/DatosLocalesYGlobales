/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
import javax.swing.JOptionPane;

public class Conversor {
    

    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Escribe una cantidad en pesos mexicanos");
        double cantidad=Double.parseDouble(texto);
        String moneda=JOptionPane.showInputDialog("Escribe la moneda a la que quieres convertir \nDolares \nEuros \nYenes");
        conversor(cantidad, moneda);
    }
   public static void conversor (double cantidad, String moneda){
        double res=0;
 
        //Este booleano se utiliza en caso de que alguien, no introduzca un nombre de moneda correcto
        boolean correcto = true;
 
        //Segun la moneda, calculamos la cantidad
        switch (moneda){
        case "Dolares":
            res=cantidad*0.056;
            break;
        case "Euros":
            res=cantidad*0.051;
            break;
        case "Yenes":
            res=cantidad*7.66;
            break;
        default:
            System.out.println("No has introducido una moneda correcta");
            correcto=false;
        }
 
        //Solo si es correcto muestra el mensaje
        if (correcto){
            System.out.println(cantidad+ " euros en " +moneda+ " son " +res);
        }
 
    }
}

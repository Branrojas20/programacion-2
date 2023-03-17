/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package com.mycompany.clase6;

import javax.swing.JOptionPane;

public class METODOS {

    int limite;
    int suma = 0;
    int i;
    int tabla;
    String mensaje = "";

    public void impares() {
        limite  = Integer.parseInt(JOptionPane.showInputDialog("Digite el limite de numeros impares"));
        for (i=1;i<=limite;i+=2){
        mensaje += i + "\n";
        suma+=i;
        
        }
JOptionPane.showMessageDialog(null,mensaje + "\n suma :" + suma,"numeros impares",JOptionPane.INFORMATION_MESSAGE);
    }
public void pares(){
  limite  = Integer.parseInt(JOptionPane.showInputDialog("Digite el limite de numeros impares"));
        for (i=0;i<=limite;i+=2){
        mensaje += i + "\n";
        suma+=i;
}
        JOptionPane.showMessageDialog(null,mensaje + "\n suma :" + suma,"numeros impares",JOptionPane.INFORMATION_MESSAGE);
}
public void tablas(){
limite  = Integer.parseInt(JOptionPane.showInputDialog("Digite el limite de tabla"));
tabla  = Integer.parseInt(JOptionPane.showInputDialog("Digite la tabla que desea"));
        for (i=1;i<=limite;i++){
        mensaje += tabla+ "*" +i+ "=" +tabla*i+"\n";
        
}
JOptionPane.showMessageDialog(null,"La tabla de Multiplicar \n"+mensaje+" ");
}
public static void main (String[]args){
    
METODOS imprimir = new METODOS();
int datos;

do{
datos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese sugun corresponda el menu"
+ "\n 1) Numero impares"
+"\n 2) Nmueros pares"
+ "\n 3) Tablas de Multiplicar"
+ "\n 4) salir"));
switch(datos){
    case 1: 
        imprimir.impares();
        break;
    case 2:
        imprimir.pares();
        break;
    case 3 :
        imprimir.tablas();
        break;
}

}while(datos!=4);

}
}












package com.mycompany.proyecto;

import java.util.Date;
import javax.swing.JOptionPane;

public class heladeria {

    public static void main(String[] args) {
        //VARIABLES
//menus
        int menu, menusabores;
//chocolate
        int cantidadchocolate = 0, cantidadchocolatetotal = 0, costochocolate = 800;
        int montochocolate;
//fresa
        int cantidadfresa = 0, cantidadfresatotal = 0, costofresa = 900;
        int montofresa;
//mango
        int cantidadmango = 0, cantidadmangototal = 0, costomango = 1200;
        int montomango;
//vainilla
        int cantidadvainilla = 0, cantidadvainillatotal = 0, costovainilla = 700;
        int montovainilla;
//matiz
        int i, j;
        int ventas = 0, indice = 0, vender;

        double IVA = 0, IVA2 = 0, montototal = 0, montototalgeneral = 0;
        String usuario, PIN, cliente = null, cedula = null;
//ciclo
        boolean continuarventa = true, continuarmenu = true;
        boolean validarPIN = false, volvermenuprincipal = false;
//vectores
        String[] vectorusuario = new String[500];
        String[] vectorPIN = new String[500];
        String[] vector = new String[500];

        do {
            //menu principal de ventas 
            menu = 0;

            menu = Integer.parseInt(JOptionPane.showInputDialog("<html><font size='8' face='Arial'><font color='red'><b>---- POPS ----</b></font><br>"
                    + "<font size='5'>1. Realizar venta</font><br>"
                    + "<font size='5'>2. Desgloce venta</font><br>"
                    + "<font size='5'>3. Registrarse</font><br>"
                    + "<font size='5'>4. Salir</font><br></html>"));

            switch (menu) {

                case 1:

                    volvermenuprincipal = false;
                    continuarventa = true;
                    validarPIN = false;

                    do {
                        //para saber si esta en el sistema
                        PIN = JOptionPane.showInputDialog("<html><font size='5' face='Arial'><font color='black'><b>Por favor ingrese su PIN, para verificar que se encuentre en el sistema: </b></font><br>");
                        //Recorre el vector para ver si esta el PIN regitrado
                        for (i = 0; i < vectorPIN.length; i++) {
                            if (PIN.equals(vectorPIN[i])) {
                                validarPIN = true;
                                indice = i;
                                break;
                            } else {
                                validarPIN = false;
                            }
                        }

                        if (validarPIN == true) {
                            cantidadchocolate = 0;
                            cantidadvainilla = 0;
                            cantidadfresa = 0;
                            cantidadmango = 0;

                            do {

                                menusabores = Integer.parseInt(JOptionPane.showInputDialog("<html><font size='6' face='Arial'><b>Seleccione un sabor de helado: </b></font><br>"
                                        + "<font size='4'>1. CHOCOLATE ₡800</font><br>"
                                        + "<font size='4'>2. VAINILLA ₡700</font><br>"
                                        + "<font size='4'>3. FRESA ₡900</font><br>"
                                        + "<font size='4'>4. MANGO ₡1200</font><br>"));
                                //sabores con if 
                                if (menusabores == 1) {

                                    cantidadchocolate = Integer.parseInt(JOptionPane.showInputDialog("<html><font size='4' face='Arial'><b>Ingrsese la cantidad de helados de Chocolate que desea:  </b></font><br>"));
                                    cantidadchocolatetotal += cantidadchocolate;
                                    ventas += 1;
                                }

                                if (menusabores == 2) {

                                    cantidadvainilla = Integer.parseInt(JOptionPane.showInputDialog("<html><font size='4' face='Arial'><b>Ingrsese la cantidad de helados de Vainilla que desea:  </b></font><br>"));
                                    cantidadvainillatotal += cantidadvainilla;
                                    ventas += 1;
                                }

                                if (menusabores == 3) {

                                    cantidadfresa = Integer.parseInt(JOptionPane.showInputDialog("<html><font size='4' face='Arial'><b>Ingrsese la cantidad de helados de Fresa que desea:  </b></font><br>"));
                                    cantidadfresatotal += cantidadfresa;
                                    ventas += 1;
                                }

                                if (menusabores == 4) {

                                    cantidadmango = Integer.parseInt(JOptionPane.showInputDialog("<html><font size='4' face='Arial'><b>Ingrsese la cantidad de helados de mango que desea:  </b></font><br>"));
                                    cantidadmangototal += cantidadmango;
                                    ventas += 1;
                                }
                                vender = Integer.parseInt(JOptionPane.showInputDialog("<html><font size='6' face='Arial'><b>Desea realizar otra venta:  </b></font><br>"
                                        + "<html><font size='4' face='Arial'><b>1. SI  </b></font><br>"
                                        + "<html><font size='4' face='Arial'><b>2. NO </b></font><br>"));
                                
                                if (vender == 2) {

                                    montochocolate = costochocolate * cantidadchocolate;
                                    montovainilla = costovainilla * cantidadvainilla;
                                    montomango = costomango * cantidadmango;
                                    montofresa = costofresa * cantidadfresa;
                                    IVA = (montochocolate + montovainilla + montofresa + montomango) * 0.13;
                                    montototal = (montochocolate + montovainilla + montofresa + montomango) + IVA;
                                    montototalgeneral += montototal;

                                    Date fecha = new Date();
                                    JOptionPane.showMessageDialog(null, "<html><font size='8' face='Arial'><b>------- FACTURA POPS -------</b></font><br>"
                                            + "<font size='5'>Fecha de hoy:  " + fecha + "</font><br>"
                                            + "<font size='5'>-----------------------------------</font><br>"
                                            + "<font size='5'>Nombre del Empleado:  " + vectorusuario[indice] + "</font><br>"
                                            + "<font size='5'>-----------------------------------</font><br>"
                                            + "<font size='5'>Nombre del Cliente: " + cliente + "</font><br>"
                                            + "<font size='5'>-----------------------------------</font><br>"
                                            + "<font size='5'>Numero de cedula de Cliente: " + cedula + "</font><br>"
                                            + "<font size='5'>-----------------------------------</font><br>"
                                            + "<font size='8'>-------------Sabores-------------</font><br>"
                                            + "<font size='5'>Chocolate || cantidad: " + cantidadchocolate + " || costo: " + montochocolate + "</font><br>"
                                            + "<font size='5'>-----------------------------------</font><br>"
                                            + "<font size='5'>Vainilla || cantidad: " + cantidadvainilla + " || costo: " + montovainilla + "</font><br>"
                                            + "<font size='5'>-----------------------------------</font><br>"
                                            + "<font size='5'>Fresa || cantidad: " + cantidadfresa + " || costo: " + montofresa + "</font><br>"
                                            + "<font size='5'>-----------------------------------</font><br>"
                                            + "<font size='5'>Mango || cantidad: " + cantidadmango + " || costo: " + montomango + "</font><br>"
                                            + "<font size='5'>-----------------------------------</font><br>"
                                            + "<font size='5'>Monto IVA (13%): " + IVA + "</font><br>"
                                            + "<font size='5'>-----------------------------------</font><br>"
                                            + "<font size='5'>Monto total: " + montototal + "</font><br>"
                                            + "<font size='5'>-----------------------------------</font><br>"
                                            + "<br><font size='8'>---MUCHAS GRACIAS POR SU COMPRA---</font></html>");

                                    continuarventa = false;
                                    volvermenuprincipal = true;

                                } else {
                                    continuarventa = true;
                                }

                            } while (continuarventa == true);

                        } else {

                            JOptionPane.showMessageDialog(null, "<html><font color='red'><font size='7'>---No se encuentra registrada la cuenta---</font></html>\n"
                                    + "<html><font color='blue'><font size='5'>Por favor registre sus datos:</font></html>");

                            usuario = JOptionPane.showInputDialog("<html><font color='blue'><font size='5'>Ingrese su USUARIO:  </font></html>");
                            PIN = JOptionPane.showInputDialog("<html><font color='green'><font size='5'>Ingrese su PIN: </font></html>");
                            cliente = JOptionPane.showInputDialog("<html><font color='blue'><font size='5'>Ingrese el nombre del cliente: </font></html>");
                            cedula = JOptionPane.showInputDialog("<html><font color='blue'><font size='5'>Ingrese el numero de cedula del cliente: </font></html>");
                            //PIN
                            j = 0;
                            if (j < vectorPIN.length) {
                                vectorusuario[j] = usuario;
                                vectorPIN[j] = PIN;
                                j += 1;
                            }

                        }

                    } while (volvermenuprincipal = false);
                    break;

                //Desgloce de ventas 
                case 2:
                    IVA2 = ((cantidadchocolatetotal * costochocolate) + (cantidadvainillatotal * costovainilla) + (cantidadfresatotal * costofresa) + (cantidadmangototal * costomango)) * 0.13;
                    JOptionPane.showMessageDialog(null, "<html><font size='8' face='Arial'><b>----DESGLOCE DE VENTAS----</b></font><br>"
                            + "<font size='5'>Chocolate | Cantidad: " + cantidadchocolatetotal + " | Costo: " + cantidadchocolatetotal * costochocolate + "</font><br>"
                            + "<font size='5'>Vainilla | Cantidad: " + cantidadvainillatotal + " | Costo: " + cantidadvainillatotal * costovainilla + "</font><br>"
                            + "<font size='5'>Fresa | Cantidad: " + cantidadfresatotal + " | Costo: " + cantidadfresatotal * costofresa + "</font><br>"
                            + "<font size='5'>Mango | Cantidad: " + cantidadmangototal + " | Costo: " + cantidadmangototal * costomango + "</font><br>"
                            + "<font size='5'>IVA: " + IVA2 + "</font><br>"
                            + "<font size='5'>Monto total facturado con IVA: " + montototalgeneral + "</font><br>"
                            + "<font size='7'>-------------Muchas gracias-------------</font></html>");

                    break;
                //registrarse
                case 3:
                    usuario = JOptionPane.showInputDialog("<html><font color='blue'><font size='4'>Ingrese su USUARIO:  </font></html>");
                    PIN = JOptionPane.showInputDialog("<html><font color='green'><font size='4'>Ingrese su PIN: </font></html>");
                    cliente = JOptionPane.showInputDialog("<html><font color='blue'><font size='4'>Ingrese el nombre del cliente: </font></html>");
                    cedula = JOptionPane.showInputDialog("<html><font color='blue'><font size='4'>Ingrese el numero de cedula del cliente: </font></html>");
                    j = 0;
                    if (j < vectorPIN.length) {
                        vectorusuario[j] = usuario;
                        vectorPIN[j] = PIN;
                        j += 1;
                    }
                    break;

                //salir
                case 4:
                    continuarmenu = false;
                    break;

            }

        } while (continuarmenu == true);

    }
}

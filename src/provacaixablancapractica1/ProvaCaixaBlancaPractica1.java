/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provacaixablancapractica1;

/**
 *
 * @author ernes
 */
public class ProvaCaixaBlancaPractica1 {

    public static void main(String[] args) {
        String[][] cotxes = new String[8][4]; //Posicions: 0.Matricula, 1.Any Matriculacio, 2.Carburant, 3.Marcat
        String[][] vehiclesRetirats = new String[8][4];

        cotxes[0][0] = "4150 PQD";
        cotxes[0][1] = "2011";
        cotxes[0][2] = "GASOLINA";
        cotxes[0][3] = "Sense marcar";
        cotxes[1][0] = "6625 UQE";
        cotxes[1][1] = "2009";
        cotxes[1][2] = "GASOIL";
        cotxes[1][3] = "Sense marcar";
        cotxes[2][0] = "2237 LUX";
        cotxes[2][1] = "2023";
        cotxes[2][2] = "ELECTRIC";
        cotxes[2][3] = "Sense marcar";
        cotxes[3][0] = "3053 WLR";
        cotxes[3][1] = "2000";
        cotxes[3][2] = "GASOLINA";
        cotxes[3][3] = "Sense marcar";
        cotxes[4][0] = "3839 FVK";
        cotxes[4][1] = "2003";
        cotxes[4][2] = "GASOLINA";
        cotxes[4][3] = "Sense marcar";
        cotxes[5][0] = "3393 HXJ";
        cotxes[5][1] = "1970";
        cotxes[5][2] = "GASOIL";
        cotxes[5][3] = "Sense marcar";
        cotxes[6][0] = "6515 YUE";
        cotxes[6][1] = "2015";
        cotxes[6][2] = "GASOLINA";
        cotxes[6][3] = "Sense marcar";
        cotxes[7][0] = "2336 PML";
        cotxes[7][1] = "2019";
        cotxes[7][2] = "GASOLINA";
        cotxes[7][3] = "Sense marcar";
        vehiclesRetirats = comprovarCotxes(cotxes, vehiclesRetirats);
        printejarStrings(vehiclesRetirats);
    }

    private static String[][] comprovarCotxes(String[][] arrayPerComprovar, String[][] vehiclesRetirats) {
        for (String[] objecte : arrayPerComprovar) {
            if (Integer.parseInt(objecte[1]) < 2010) {
                objecte[3] = "Marcat";
                if ("GASOIL".equals(objecte[2])) {
                    for (String[] vehicleRetirat : vehiclesRetirats) {
                        if (vehicleRetirat[0] == null) {
                            vehicleRetirat[0] = objecte[0];
                            vehicleRetirat[1] = objecte[1];
                            vehicleRetirat[2] = objecte[2];
                            vehicleRetirat[3] = objecte[3];
                            break;
                        }
                    }
                }
            }
        }
        return vehiclesRetirats;
    }

    private static void printejarStrings(String[][] arrayPerPrintejar) {
        for (String[] cotxe : arrayPerPrintejar) {
            if (cotxe[0] != null) {
                System.out.println("");
                System.out.println("---------------");
                System.out.println("Matricula: " + cotxe[0]);
                System.out.println("Any matriculacio: " + cotxe[1]);
                System.out.println("Carburant: " + cotxe[2]);
                System.out.println("Estat: " + cotxe[3]);
                System.out.println("---------------");
                System.out.println("");
            }
        }
    }
}

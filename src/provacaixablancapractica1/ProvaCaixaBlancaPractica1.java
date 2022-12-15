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
        cotxes[0][3] = "";
        cotxes[1][0] = "6625 UQE";
        cotxes[1][1] = "2009";
        cotxes[1][2] = "GASOIL";
        cotxes[1][3] = "";
        cotxes[2][0] = "2237 LUX";
        cotxes[2][1] = "2023";
        cotxes[2][2] = "ELECTRIC";
        cotxes[2][3] = "";
        cotxes[3][0] = "3053 WLR";
        cotxes[3][1] = "2000";
        cotxes[3][2] = "GASOLINA";
        cotxes[3][3] = "";
        cotxes[4][0] = "3839 FVK";
        cotxes[4][1] = "2003";
        cotxes[4][2] = "GASOLINA";
        cotxes[4][3] = "";
        cotxes[5][0] = "3393 HXJ";
        cotxes[5][1] = "1970";
        cotxes[5][2] = "GASOIL";
        cotxes[5][3] = "";
        cotxes[6][0] = "6515 YUE";
        cotxes[6][1] = "2015";
        cotxes[6][2] = "GASOLINA";
        cotxes[6][3] = "";
        cotxes[7][0] = "2336 PML";
        cotxes[7][1] = "2019";
        cotxes[7][2] = "GASOLINA";
        cotxes[7][3] = "";
        comprovarCotxes(cotxes);
    }

    private static String[][] comprovarCotxes(String[][] arrayPerComprovar) {
        String[][] vehiclesRetirats = new String[8][4];

        return arrayPerComprovar;
    }

    private static void printejarStrings(String[][] arrayPerPrintejar) {
        System.out.println("Hola");
    }
}

/* 
 * Copyright 2016  - Raul Granel - raul.granel@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.app;

//Importación del método Scanner.
import java.util.Scanner;

/**
 * La clase App contiene la lógica del proyecto.
 *
 * @author - Raul Granel - raul.granel@gmail.com
 */
public class App {

    /**
     * El método lanzarAplicación es el método de entrada de la clase App.
     */
    public void lanzarAplicacion() {

        //Instanciación del método Scanner.
        Scanner scn = new Scanner(System.in, "ISO-8859-1");

        //Instanciación del Array que contiene el número completo del boleto de Primitiva.
        int numeroBoleto[] = new int[5];

        int numero = 0;

        //Repetir introducir el número por teclado.  
        for (int veces = 0; veces < 5; veces++) {

            //Controla que el número introducido sea un número entre 0 y 49.
            boolean numeroOK;
            do {

                //Introducir un número por teclado.
                boolean testOK = true;
                do {
                    try {
                        System.out.printf("Introduce el número deseado....: ");
                        numero = scn.nextInt();
                        testOK = false;
                    } catch (Exception e) {
                        System.out.println("Error de entrada.");
                    }
                } while (testOK);

                numeroOK = !(numero >= 0 && numero <= 49);
                if (numeroOK) {
                    System.out.println("Número no valido...");
                }
            } while (numeroOK);

            numeroBoleto[veces] = numero;
        }

        //Mensaje con el número del boleto de Primitiva.
        System.out.printf("Número boleto......: %d-%d-%d-%d-%d", numeroBoleto[0], numeroBoleto[1], numeroBoleto[2], numeroBoleto[3], numeroBoleto[4]);
    }

}

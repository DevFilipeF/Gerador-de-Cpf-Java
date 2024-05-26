
package main;

import java.util.Random;
import javax.swing.JOptionPane;


public class Main {

    
   public static void main(String[] args) {
        
        int[] cpf = new int[11];

       
        Random r = new Random();
        for (int i = 0; i < 9; i++) {
            cpf[i] = r.nextInt(10);
        }

       
        int soma = 0;
        int peso = 10;
        for (int i = 0; i < 9; i++) {
            soma += cpf[i] * peso;
            peso--;
        }
        int resto = soma % 11;
        if (resto < 2) {
            cpf[9] = 0;
        } else {
            cpf[9] = 11 - resto;
        }

      
        soma = 0;
        peso = 11;
        for (int i = 0; i < 10; i++) {
            soma += cpf[i] * peso;
            peso--;
        }
        resto = soma % 11;
        if (resto < 2) {
            cpf[10] = 0;
        } else {
            cpf[10] = 11 - resto;
        }

       
        String cpfString = "";
        for (int i = 0; i < 11; i++) {
            cpfString += cpf[i];
        }
        JOptionPane.showMessageDialog(null, "CPF gerado foi: " + cpfString);
    }
}
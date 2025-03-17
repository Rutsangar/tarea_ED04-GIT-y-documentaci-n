public class Solution {
    static String toCamelCase(String s){
        /**
         * Metodo que hace un camel case de un string separado por "-" como separador estos caracteres
         * El metodo respeta la primera letra de la primera palabra, sea mayuscula o minuscula y convierte el resto de palabras
         * @param s el parametro es un string
         * @return devuelve el string convertido
         */
        boolean espacio = false;
        String str = "";

        for(char caracteres : s.toCharArray()){
            if(Character.isLetter(caracteres)){
                if(espacio == true){
                    str += Character.toUpperCase(caracteres);
                    espacio = false;
                } else {
                    str += caracteres;
                }
            } else {
                espacio = true;
            }
        }
        return str;
    }

}

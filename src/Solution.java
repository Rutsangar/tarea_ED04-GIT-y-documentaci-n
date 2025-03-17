public class Solution {
    static String toCamelCase(String s){
        boolean espacio = false;
        String str = "";

        for(char caracter : s.toCharArray()){
            if(Character.isLetter(caracter)){
                if(espacio == true){
                    str += Character.toUpperCase(caracter);
                    espacio = false;
                } else {
                    str += caracter;
                }
            } else {
                espacio = true;
            }
        }

        return str;
    }
}

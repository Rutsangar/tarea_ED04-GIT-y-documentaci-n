public class Solution {
    static String toCamelCase(String s){
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

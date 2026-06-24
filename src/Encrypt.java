public class Encrypt {

    public static String encrypt(String text, int shift) {
        /*
        *  ***StringBuilder*** é uma classe usada para manipular textos.
        *  Ela permite adicionar e modificar informações em uma sequência de caracteres
        *  sem criar novos objetos a cada alteração,
        *  sendo mais eficiente que a String para operações repetidas de concatenação.
        */
        StringBuilder result = new StringBuilder();

        /*
        *  O for-each é uma variação do laço for que permite percorrer automaticamente
        *  todos os elementos de um array ou coleção sem a utilizaçao de um índice (i).
        *  Ele percorre automaticamente todos os elementos de um array ou coleção. Diferente do for tradicional,
        *  ele não exige o uso de um contador ou a definição manual da quantidade de elementos a serem percorridos,
        *  pois o Java faz isso automaticamente. Sua sintaxe é identificada pelo uso de : (dois pontos).
        */
        for(char character : text.toCharArray() /* Para cada elemento do array faça */){
            /*
            * ***Character*** uma classe do Java utilizada para manipular,
            * converter e verificar características de um único caractere (char).
            */
            if (Character.isLetter(character)){
                /*  Os simbolos ? : é uma forma simplificada de usar o If-Else */
                char base = Character.isLowerCase(character) ? 'a' : 'A';
                char shifted = (char) ((character - base + shift) %26 + base);
                result.append(shifted);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        String s = "aabbbdddac"; int k = 3;
        char letter = '#'; char nextLetter;
        int count = 0; int index = 0; char n = 'a';


        while (index < s.length()){

            // nextLetter vai receber as letra de s
            nextLetter = s.charAt(index);index++;

            // identificada repetição de letras
            if (nextLetter == letter){
                count++;

                //quando count for igual a k, s recebe as substrings da esquerda e da direita sem as letras repetidas
                if (count == k){
                    s = s.substring(0,index-k).concat(s.substring(index,s.length()));
                    // com index = 0 e count = 0, inicia uma iteração do início
                    index = 0; count = 0;
                    continue;
                }
                continue;
            }
            else { // nextLetter recebe uma letra diferente e atribui a letter para iniciar uma nova contagem
                letter = nextLetter;
                count=1;
            }
        }
        System.out.println(s);
    }

}
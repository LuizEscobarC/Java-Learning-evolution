public class ConfereIdadeDono {
    public static void main (String[] args){
        int idade = 15;
        //boolean amigoDoDono = true;
        boolean amigoDoDono = false;
        // mesma coisa que if (idade <18 & amigoDoDono == false)
        if (idade < 18 & !amigoDoDono){
            System.out.println("Não pode entrar");
        }
        else{
            System.out.println("Pode entrar");
        }
    }
}
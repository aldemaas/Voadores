import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VoadoresMain {
    public static void main(String[] args) {
        List <Voador> voadorList = new ArrayList<>();

        Random geraVoadores = new Random();
        for (int i = 0; i < 10 ; i++) {
            int opcao = geraVoadores.nextInt(3);

            if (opcao == 0){

                GalinhaVoadora novaGalinha = new GalinhaVoadora();
                voadorList.add(novaGalinha);
            }
            if (opcao == 1){
                Drone novoDrone = new Drone("Não especificado");
                voadorList.add(novoDrone);
            }
            if (opcao == 2){
                Morcego novoMorcego = new Morcego();
                voadorList.add(novoMorcego);
            }
        }

        for (int i = 0; i < 10; i++) {
            voadorList.get(i).voar();
        }
        for (int i = 0; i < 10; i++) {
            voadorList.get(i).pousar();
        }


    }

}




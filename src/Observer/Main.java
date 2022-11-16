package Observer;

public class Main {

//Essa é a classe cliente

        public static void main(String[] args) {
            //Objeto que será observado é instanciado
            CarroRoubado carroRoubado = new CarroRoubado();

            //Objetos que seram os observadores é instanciado
            CarroPoliceI carroPoliceI = new CarroPoliceI();
            CarroPoliceII carroPoliceII = new CarroPoliceII();

            //Adicionando os observadores na lista de notificação
            carroRoubado.addObserver(carroPoliceI);
            carroRoubado.addObserver(carroPoliceII);

            //Ações do objeto que está sendo observado
            carroRoubado.adiante();
            carroRoubado.direita();
            carroRoubado.retornar();
            carroRoubado.para();
        }
    }


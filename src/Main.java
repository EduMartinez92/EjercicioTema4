public class Main {
    public static void main(String[] args) {
        int numeroif = -15;
        int numeroWhile = 1;
        int numeroDoWhile = 6;
        String estacion = "Verano";

        if(numeroif>0){
            System.out.println("El númeroif es positivo");
        }else if(numeroif<0){
            System.out.println("El númeroif es negativo");
        }else{
            System.out.println("El númeroif es 0");
        }

        while(numeroWhile < 3){
            System.out.println("El bucle del númeroWhile es: " +numeroWhile);
            numeroWhile++;
        }

        do{
            System.out.println("El bucle del númeroDoWhile es: " + numeroDoWhile);
        }while (numeroDoWhile<3);

        for(int numeroFor = 0; numeroFor <3; numeroFor++){
            System.out.println("El bucle del númeroFor es: " + numeroFor);
        }

        switch(estacion){
            case "Primavera":
                System.out.println("Estamos en la estación de Primavera");
                break;
            case "Verano":
                System.out.println("Estamos en la estación de Verano");
                break;
            case "Otoño":
                System.out.println("Estamos en la estación de Otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en la estación de Invierno");
                break;
            default:
                System.out.println("El dato introducido no es una estación");
        }
    }


}
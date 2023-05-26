package proyecto_acronimos;

public class Acronimos {   

    public String obtenerAcronimo(String cadena){ //Pondria un throws exception para que en caso de null o otro erros lanzará excepcion en vez de cortarse
        String resultado="";
        char caracter;
        int n = cadena.length();
        
        for (int i = 0; i<n; i++){
            caracter = cadena.charAt(i);
            if(caracter != ' '){
                if (i==0){
                    resultado = resultado + caracter + '.';
                }
                else{
                    if(cadena.charAt(i-1) == ' ' && cadena.charAt(i) != 'Z'){
                        resultado = resultado + caracter + '.';
                    } else if(cadena.charAt(i-1) == ' ' && cadena.charAt(i) == 'Z')
                        resultado = resultado + '*'+ '.';
                }
            }
            if (caracter == 'j' && cadena.charAt(i-1)  == ' ' || caracter == 'p' && cadena.charAt(i-1)  == ' '){
                break;
            } 
            
        }
        return resultado;
    }
}


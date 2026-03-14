public class ExemploDeOperadoresAritimeticos {

    public static void main(String[] args) {
        //declarar uma variavel do tipo int e atribuir um valor

        int x = 12;
        int y = 32;

        x ++;
        System.out.println("x é: " + x); //13
        x --;
        System.out.println("x agora é: " + x); //12

        x += 2; //x= x + 2; (aumentar o x em 2 unidades)
        System.out.println("x ficou: " + x);//14
        x -= 10;
        System.out.println("x é:" + x);//4
        x *= 3;
        System.out.println("x é: " + x);//12
        x /= 2;
        System.out.println("x é: " + x);//6
        x %= 4;
        System.out.println("x é: " + x);//2
        y *= x;
        System.out.println("x é: " + y);//0

    }

}

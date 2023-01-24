public class Main {

        public static void main(String[] args) {
            System.out.println("Exercício retornor");
            double areaQuadrado = Quadrilatero.area(3.0);
            System.out.println("Área do quadrado: " + areaQuadrado);
            double areaRetangulo = Quadrilatero.area(5.0, 5.0);
            System.out.println("Área do retângulo: " + areaRetangulo);
            double areaTrapezio = Quadrilatero.area(7.0, 8.0, 9.0);
            System.out.println("Área do trapézio: " + areaTrapezio);
        }
    }

}

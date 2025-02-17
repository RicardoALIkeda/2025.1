public class Main {
    public static void main(String[] args) {
        int[][] predio = new int[10][8];
        preencheMat(predio);
        mostraMat(predio);
        int vazios = calcVazios(predio);
        System.out.println("\nQtde de apartamentos vazios: " + vazios);
        
        int andarMaiorNumMoradores = calcAndar(predio);
        System.out.println("Andar com maior número de moradores: " + andarMaiorNumMoradores);
        
        int totalMoradores = calcTotal(predio);
        System.out.println("Quantidade total de moradores do prédio: " + totalMoradores);
    }

    public static int calcVazios(int[][] predio) {
        int count = 0;
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                if (predio[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void preencheMat(int[][] predio) {
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                predio[i][j] = (int) (Math.random() * 7);
            }
        }
    }

    public static void mostraMat(int[][] predio) {
        for (int i = 0; i < predio.length; i++) {
            System.out.println();
            for (int j = 0; j < predio[i].length; j++) {
                System.out.print(predio[i][j] + "\t");
            }
        }
    }

    public static int calcAndar(int[][] predio) {
        int maxMoradores = 0;
        int andar = 0;
        for (int i = 0; i < predio.length; i++) {
            int totalMoradoresAndar = 0;
            for (int j = 0; j < predio[i].length; j++) {
                totalMoradoresAndar += predio[i][j];
            }
            if (totalMoradoresAndar > maxMoradores) {
                maxMoradores = totalMoradoresAndar;
                andar = i;
            }
        }
        return andar;
    }

    public static int calcTotal(int[][] predio) {
        int total = 0;
        for (int i = 0; i < predio.length; i++) {
            for (int j = 0; j < predio[i].length; j++) {
                total += predio[i][j];
            }
        }
        return total;
    }
}
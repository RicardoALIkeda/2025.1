public class Main{
    public static void main(String[] args){
        int[][] predio = new int [10][8];
        preencheMat(predio);
        mostraMat(predio);
        int vazios = calcVazios(predio);
        System.out.println("\nQtde de apartamentos vazios: "+vazios);
    }

public static int calcVazios(int [][]predio){
    int count = 0;
    for(int i=0; i<predio.length; i++){
        for(int j=0; j<predio[i].length; j++){
            if(predio[i][j] == 0){
                count++;
            }
        }
    }
    return count;
}
public static void preencheMat(int [][] predio){
    for(int i=0; i<predio.length; i++){
        for (int j=0; j<predio[i].length; j++){
            predio[i][j] = (int)(Math.random()*7);
        }
    }
}
public static void mostraMat(int[][] predio){
    for(int i=0; i<predio.length;i++){
        System.out.println();
        for(int j=0; j<predio[i].length;j++){
            System.out.print(predio[i][j]+ "\t");
        }        
    }
    }
}
package com.company;

public class Main {

    public static void main(String []args){
        int[] tab = {2, 13, 4, 5, 8, 9, 12, 6, 18, 47};
        for(int i=0;i<10;i++){
            System.out.print(tab[i]+" ");
        }
        System.out.print("\n");


        int tmp;
        for (int i=4; i>=0; i--){
            for(int j=0; j<i; j++){
            if(tab[j]>tab[j+1]) {
                //echange(tab[j], tab[j + 1]);
                tmp = tab[j];
                tab[j] = tab[j+1];
                tab[j+1] = tmp;

            }
            }
        }

        for(int i=0;i<10;i++){
            System.out.print(tab[i]+" ");
        }

    }

}
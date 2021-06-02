package com.company;

public class Main {

    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG    ";

        String s01 = original.toLowerCase(); // transforma tudo em minúsculo
        String s02 = original.toUpperCase(); // transforma tudo em maiúsculo
        String s03 = original.trim(); // elimina espaços no final da string
        String s04 = original.substring(2); // cria uma nova string a parte a posição 2 da string original
        String s05 = original.substring(2, 9); // começa a nova string na posição 2 e termina na posição 9
        String s06 = original.replace('a', 'x'); // substitui todos os caracteres selecionado por outro
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc"); // acha a posição da primeira ocorrencia do parâmetro na String
        int j = original.lastIndexOf("bc"); // acha a posição que contém a última ocorrência do parâmetro na String

        System.out.println("Original: " + original);
        System.out.println("toLowerCase : " + s01);
        System.out.println("toUpperCase: " + s02);
        System.out.println("trim: " + s03);
        System.out.println("substring(2): " + s04);
        System.out.println("substring(2, 9): " + s05);
        System.out.println("replace('a', 'x'): " + s06);
        System.out.println("replace('abc', 'xy' ): " + s07);
        System.out.println("indexOf('bc'): " + i);
        System.out.println("indexOf('bc'): " + j);

        String s = "protato apple lemon";

        String[] vect = s.split(" "); // reparte uma string de acordo com o parâmetro que será o separador da string

        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

    }
}

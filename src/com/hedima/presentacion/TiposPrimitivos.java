package com.hedima.presentacion;

public class TiposPrimitivos {
    public static void main(String[] args) {

        //Tipos numericos
         byte nByte = 123;
         short nShort =3_400;
         int nInt = 123_456;
         long nLong = 123_456_789_012L;


         //Tipos numericos con decimales
         float nFloat = 123.456f;
         double nDouble = 123.456_789_012;

         //Tipos booleanos
         boolean bBoolean = true;
         boolean bBoolean2 = false;

         //Tipos char
         char cChar = 'H';

         System.out.println("Valor de nByte: " + nByte);
         System.out.println("Valor de nShort: " + nShort);
         System.out.println("Valor de nInt: " + nInt);
         System.out.println("Valor de nLong: " + nLong);
         System.out.println("Valor de nFloat: " + nFloat);
          System.out.println("Valor de nDouble: " + nDouble);
          System.out.println("Valor de bBoolean: " + bBoolean);
          System.out.println("Valor de bBoolean2: " + bBoolean2);
          System.out.println("Valor de cChar: " + cChar);

          //Definir String para tipo de texto
         String sString = "Hola Mundo";
         System.out.println("Valor de sString: " + sString);

         //Calcular el area de un rectangulo

         double base = 6.5;
         double altura = 10.5;
         double area = base * altura;
         System.out.println("Valor de area: " + area);

         //Calcular el area de un circulo
        double radio = 5;
//         double areaCirculo = Math.PI * radio * radio;
         double areaCirculo = Math.PI * Math.pow(radio, 2);
         System.out.println("Valor de areaCirculo: " + areaCirculo);

    }
}

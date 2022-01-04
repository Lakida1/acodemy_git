package homework;


import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class homework_java_1 {
  public static void main(String[] args) {
    String typeByte = ("byte");
    String typeShort = ("short");
    String typeInt = ("int");
    String typeLong = ("long");
    String typeFloat = ("float");
    String typeDouble = ("double");
    String typeChar = ("char");
    String typeBoolean = ("boolean");
    String minValue = ("min value:");
    String maxValue = ("max value:");
// String example
    String stringJava = ("Java");
    String stringLanguage = ("programming language");
    String stringLanguageType = ("statically-typed");
    String stringVariables = ("variables");
         System.out.println(stringJava + " - " + stringLanguage + " is " + stringLanguageType + ", which means that all " + stringVariables
            + " must first be declared before they can be used." + "\n" + "The primitive types are: " + typeByte + ", " + typeShort + ", " + typeInt + ", " + typeLong + ", " + typeFloat
            + ", " + typeDouble + ", " + typeChar + ", " + typeBoolean +"."+ '\n');
// byte
    System.out.println(typeByte + " : " + minValue + Byte.MIN_VALUE + "," + " " + maxValue + Byte.MAX_VALUE + (",  ") +
            ("integer,") + " " + ("default Value:") + " " + ("0;"));
      byte byteZero = 0;
      byte byteOne = 1;
      byte byteTwo = 2;
      byte byteThree = 3;
      byte byteFour = 4;
      byte byteFive = 5;
      byte byteEleven = 11;
      byte byteTwentyFive = 25;
      byte byteMinValue = -128;
      byte byteMaxValue = 127;
        System.out.println("10 variables of byte: " + byteZero + " " + byteOne + " " + byteTwo + " " + byteThree + " " + byteFour + " " + byteTwentyFive + " " + byteFive + " "
                + byteEleven + " " + byteMinValue + " " + byteMaxValue + '\n');
  //short
        System.out.println(typeShort + " : " + minValue + Short.MIN_VALUE + "," + " " + maxValue + Short.MAX_VALUE + (",  ") +
            ("integer,") + " " + ("default Value:") + " " + ("0;"));
      short shortZero = 0;
      short shortMin = -32768;
      short shortMax = 32767;
      short shortSix = 6;
      short shortSeven = 7;
      short shortEight = 8;
      short shortNine = 9;
      short shortTen = 10;
      short shortSumSevenAndNine = 7+9;
      short shortSumElevenAndFour = 11+4;
           System.out.println("10 variables of short: " + shortZero + " " + shortSix + " " + shortSeven + " " + shortEight + " "
                              + shortNine + " " + shortTen + " " + shortSumElevenAndFour + " " + shortSumSevenAndNine + " " + shortMin + " " + shortMax + '\n');
  // int
    System.out.println(typeInt + " : " + minValue + Integer.MIN_VALUE + "," + " " + maxValue + Integer.MAX_VALUE + (" ") + (",  ") +
            ("integer,") + " " + ("default Value:") + " " + ("0;"));
      int populationOfLatvia = 1886198; // not possible to put population of world max value due;
      int temperatureAbsoluteZeroWithoutDecimal = -273;
      int areaLatviaTotal = 64589;
      int populationOfLithuania = 2784279;
      int areaLithuaniaTotal = 65300;
      int populationOfEstonia = 1330038;
      int areaEstoniaTotal = 45339;
      int coronavirusLatvia = 277692;
      int coronavirusLithuania = 524128;
      int coronavirusEstonia = 243236;
          System.out.println("10 variables of int: " + populationOfLatvia + " " + areaLatviaTotal + " " + populationOfLithuania + " " + areaLithuaniaTotal + " " + populationOfEstonia + " "
                             + areaEstoniaTotal + " " + coronavirusLatvia + " " + coronavirusLithuania + " " + coronavirusEstonia + " " + temperatureAbsoluteZeroWithoutDecimal + '\n');
 //long
    System.out.println(typeLong + " : " + minValue + Long.MIN_VALUE + "," + " " + maxValue + Long.MAX_VALUE + " " + ",  " +
            "integer," + " " + "default Value:" + " " + "0L;");
      long populationOfWorld = 7915872600L;
      long coronavirusWorld = 291014081L;
      long coronavirusUsa = 56142175L;
      long coronavirusIndia = 34922882L;
      long coronavirusBrazil = 34922882L;
      long populationOfUsa = 331893745L;
      long populationOfIndia = 1400000000L;
      long populationOfBrazil = 210147125L;
      long coronavirusRussia = 10554309L;
      long populationOfRussia = 146171015L;
           System.out.println("10 variables of long: " + " " + populationOfWorld + " " + coronavirusWorld + " " + populationOfUsa + " " + coronavirusUsa + " "
                              +  populationOfIndia + " " + coronavirusIndia + " " + populationOfBrazil + " " + coronavirusBrazil + " " + populationOfRussia + " " + coronavirusRussia + " "
                              +'\n');
  //float
    System.out.println(typeFloat + " : " + minValue + Float.MIN_VALUE + "," + " " + maxValue + Float.MAX_VALUE + (" ") + (",  ") +
            ("real number with floating point,") + " " + ("default Value:") + " " + ("0f;") + (" DO NOT USING FOR PRECISE VALUES"));
      float floatTemperatureAbsolutZero = -273.15f;
      float numberPi = 3.141592653589793236128f;
      float floatEulierConstant = 2.7182818284590452353602874713527f;
      float floatGoldenRatio = 1.6180339887498948482f;
      float floatExampleOne = 32.22558878874F;
      float floatExampleTwo = -1258.287f;
      float floatExampleThree = 2.121354658456465f;
      float floatExampleFour = -2222.80848541f;
      float floatExampleFive = 201545.1f;
      float floatExampleSix = 889.22228862f;
    System.out.println("10 variables of float: " + floatTemperatureAbsolutZero + " " + numberPi + " " + floatEulierConstant + " " + floatGoldenRatio + " " + floatExampleOne + " "
                       + floatExampleTwo + " " + floatExampleThree + " " + floatExampleFour + " " + floatExampleFive + " " + floatExampleSix +'\n');
 //char
    System.out.print(typeChar + ": " + "character");
      char charNumberPi = '\u03C0';
      char charTemperature = '\u00B0';
      char charPercent = '\u0025';
      char charAUpperCase = 'A';
      char charALowerCase = 'a';
      char charAt = '\u0040';
      char charMultiplie = '\u002A';
      char charDevide = '\u003D';
      char charEquals = '\u003D';
      char charPlus = '\u002B';
      char charMinus = '\u002D';
      char charSqaured = '\u00B2';
    System.out.println('\n' + "10 variables of char: " + charNumberPi + " " + charTemperature + " " + charAt + " " + charMinus + " " + charDevide + " "
            + charAUpperCase + " " + charALowerCase + " " + charMultiplie + " " + " " + charEquals + " " + charPercent + " " + charPlus + '\n');
  //double
    System.out.println(typeDouble + " : " + minValue + Double.MIN_VALUE + "," + " " + maxValue + Double.MAX_VALUE + (" ") + (",  ") +
            ("real number with floating point,") + " " + ("default Value:") + " " + ("0d;") + (" DO NOT USING FOR PRECISE VALUES"));
      double doubleTemperatureAbsolutZero = -273.15d;
      double doubleNumberPi = 3.141592653589793236128d;
      double doubleExampleOne = 89.8992211d;
      double doubleExampleTwo = 71008.88522d;
      double doubleExampleThree = -0.5244647d;
      double doubleExampleFour = 1054.8;
      double doubleExampleFive= 4545.3541545;
      double doubleExampleSix = -8748.7;
      double doubleExampleSeven = 0.8818;
      double doubleExampleEight = 633212.554;
//char
            System.out.println("10 variables of double: " + '\n' + "The Absolute Zero of Temperature: " + doubleTemperatureAbsolutZero + charTemperature + "C" + '\n'
            + charNumberPi + "=" + doubleNumberPi + '\n' + doubleExampleOne + " "+ doubleExampleTwo + " " + doubleExampleThree + " "
            + " " + doubleExampleFour + " " + doubleExampleFive + " " + doubleExampleSix + " " + doubleExampleSeven
            + " " + doubleExampleEight + '\n');
//boolean
    System.out.println(typeBoolean + " " + "possible variables: " + FALSE + " and " + TRUE);
      boolean variableFalse = FALSE; // not possible to create 10 variables, only 2;
      boolean variableTrue = TRUE;
           System.out.println("variables: " + variableFalse + " " + variableTrue + '\n');
//Examples
    int exampleAdditionFirst = 2+3;
    int exampleAdditionSecond = 6+32767;
    int areaDifferenceLatviaLithuania = areaLithuaniaTotal-areaLatviaTotal;
    byte exampleModulusFirst = 89%3;
    byte exampleModulusSecond = 8%7;
    int exampleSubtractionFirst = shortMin-shortMax;

    System.out.println("Examples:" + '\n' + "2" + charPlus + "3" + charDevide + exampleAdditionFirst + '\n'
            + "6+32767 = " + exampleAdditionSecond + '\n'
            + "-32768-32767 = " + exampleSubtractionFirst + '\n'
            + "area Latvia vs. Lithuania: " + areaDifferenceLatviaLithuania + " km" + '\n'
            + "5*2=" + 5*2 + '\n'
            + "area of circle" + charDevide + charNumberPi + charMultiplie + "R" + charSqaured + " " + "where R = 7 cm" + ": area of circle=" + 7*7*doubleNumberPi + " cm" + '\n'
            + "15*(-273.15) = " + shortSumElevenAndFour*floatTemperatureAbsolutZero + '\n'
            + "633212.554/1054.8= " + doubleExampleEight/doubleExampleFour + '\n'
            + "89 % 3 = " + exampleModulusFirst + '\n'
            + "8 % 7 = " + exampleModulusSecond);

     }
}


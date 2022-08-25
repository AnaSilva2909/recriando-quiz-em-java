import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    int p1 = 1;
    int p2 = 2;
    int p3 = 1;
    int p4 = 1;
    int p5 = 2;
    int p6 = 1;
    int p7 = 2;
    int p8 = 1;
    int p9 = 2;
    int p10 = 1;

    boolean resposta = false;
    
    int erros = 0;
    int acertos = 0;
    int pontuacao = 0;
    int count = 0;
    String name;
    System.out.println("Digite seu nome: ");
    name = scan.next();

    System.out.println("Seja bem vindo " + name + ", vamos começar o jogo:");
    
    //Pergunta 01
    do {
        System.out.println("Pergunta 01: Algoritmos representa uma forma de se elaborar soluções computacionais?");
        System.out.println("1) VERDADE");
        System.out.println("2) FALSO");
        p1 = scan.nextInt();

        if(p1 ==  1 ){
         acertos += 1;
         pontuacao += 10;
         System.out.println("Você acertou!");
         break;
        }else{
           System.out.println("Você ERROU, tente novamente: "); 
           System.out.println("Pergunta 01: Algoritmos representa uma forma de se elaborar soluções computacionais?");
           System.out.println("1) VERDADE");
           System.out.println("2) FALSO");
           p1 = scan.nextInt();
   
           if(p1 ==  1 ){
            acertos += 1;
            pontuacao += 5;
            System.out.println("Você acertou!");
            break;
           
        }else{
            erros += 1;
            System.out.println("Chances Esgotadas;");      
    }
    }
    } while ( count == 1);
    
 
    //Pergunta 02
    do {
        System.out.println("Pergunta 02: Algoritmos é a unica forma de representar possiveis soluções compiutacionais?");
        System.out.println("1) VERDADE");
        System.out.println("2) FALSO");
        p2 = scan.nextInt();

        if(p2 == 2  ){
         acertos += 1;
         pontuacao += 10;
         System.out.println("Você acertou!");
         break;
        }else{
           System.out.println("Você ERROU, tente novamente: "); 
           System.out.println("Pergunta 02: Algoritmos é a unica forma de representar possiveis soluções compiutacionais?");
           System.out.println("1) VERDADE");
           System.out.println("2) FALSO");
           p2 = scan.nextInt();
   
           if(p2 ==  2 ){
            acertos += 1;
            pontuacao += 5;
            System.out.println("Você acertou!");
            break;
        }else{
            
            erros += 1;
            System.out.println("Chances Esgotadas;");
    }
    }
    } while (count == 1 );

   
    //Pergunta 03
    do {
        System.out.println("Pergunta 03: Suas formas de representação é:Descrição Narrativa,Fluxograma e Pseudocodigo?");
        System.out.println("1) VERDADE");
        System.out.println("2) FALSO");
        p3 = scan.nextInt();

        if(p3 == 1  ){
         acertos += 1;
         pontuacao += 10;
         System.out.println("Você acertou!");
         break;
        }else{
           System.out.println("Você ERROU, tente novamente: "); 
           System.out.println("Pergunta 03: Suas formas de representação é:Descrição Narrativa,Fluxograma e Pseudocodigo?");
           System.out.println("1) VERDADE");
           System.out.println("2) FALSO");
           p3= scan.nextInt();
   
           if(p3 ==  1){
            acertos += 1;
            pontuacao += 5;
            System.out.println("Você acertou!");
            break;
        }else{
            
            erros += 1;
            System.out.println("Chances Esgotadas;");
    }
    }
    } while (count == 1);

    //Pergunta 04
    do {
        System.out.println("Pergunta 04: As palavras reservadas LEIA representa entrada de dados e ESCREVA saída de dados?");
        System.out.println("1) VERDADE");
        System.out.println("2) FALSO");
        p4 = scan.nextInt();

        if(p4 == 1  ){
         acertos += 1;
         pontuacao += 10;
         System.out.println("Você acertou!");
         break;
        }else{
           System.out.println("Você ERROU, tente novamente: "); 
           System.out.println("Pergunta 04: As palavras reservadas LEIA representa entrada de dados e ESCREVA saída de dados?");
           System.out.println("1) VERDADE");
           System.out.println("2) FALSO");
           p4= scan.nextInt();
   
           if(p4 ==  1){
            acertos += 1;
            pontuacao += 5;
            System.out.println("Você acertou!");
            break;
        }else{
            
            erros += 1;
            System.out.println("Chances Esgotadas;");
    }
    }
    } while (count == 1);

    //Pergunta 05
    do {
        System.out.println("Pergunta 05: A palavra reservada FIM corresponde a descrição Final de comando condicional?");
        System.out.println("1) VERDADE");
        System.out.println("2) FALSO");
        p5 = scan.nextInt();

        if(p5 == 2 ){
         acertos += 1;
         pontuacao += 10;
         System.out.println("Você acertou!");
         break;
        }else{
           System.out.println("Você ERROU, tente novamente: "); 
           System.out.println("Pergunta 05: A palavra reservada FIM corresponde a descrição Final de comando condicional?");
           System.out.println("1) VERDADE");
           System.out.println("2) FALSO");
           p5= scan.nextInt();
   
           if(p5 ==  2){
            acertos += 1;
            pontuacao += 5;
            System.out.println("Você acertou!");
            break;
        }else{
            
            erros += 1;
            System.out.println("Chances Esgotadas;");
    }
    }
    } while (count == 1);

    //Pergunta 06
    do {
        System.out.println("Pergunta 06: Dado a variavel Real:altura, recebendo o valor altura <- 2.3, está correta?");
        System.out.println("1) VERDADE");
        System.out.println("2) FALSO");
        p6 = scan.nextInt();

        if(p6 == 1){
         acertos += 1;
         pontuacao += 10;
         System.out.println("Você acertou!");
         break;
        }else{
           System.out.println("Você ERROU, tente novamente: "); 
           System.out.println("Pergunta 06: Dado a variavel Real:altura, recebendo o valor altura <- 2.3, está correta?");
           System.out.println("1) VERDADE");
           System.out.println("2) FALSO");
           p6= scan.nextInt();
   
           if(p6 ==  1){
            acertos += 1;
            pontuacao += 5;
            System.out.println("Você acertou!");
            break;
        }else{
            
            erros += 1;
            System.out.println("Chances Esgotadas;");
    }
    }
    } while (count == 1);

    //Pergunta 07
    do {
        System.out.println("Pergunta 07: O simbolo %(porcentagem) não é utilizado como operador de resto de divisão?");
        System.out.println("1) VERDADE");
        System.out.println("2) FALSO");
        p7 = scan.nextInt();

        if(p7 == 2){
         acertos += 1;
         pontuacao += 10;
         System.out.println("Você acertou!");
         break;
        }else{
           System.out.println("Você ERROU, tente novamente: "); 
           System.out.println("Pergunta 07: O simbolo %(porcentagem) não é utilizado como operador de resto de divisão?");
           System.out.println("1) VERDADE");
           System.out.println("2) FALSO");
           p7= scan.nextInt();
   
           if(p7 ==  2){
            acertos += 1;
            pontuacao += 5;
            System.out.println("Você acertou!");
            break;
        }else{
            
            erros += 1;
            System.out.println("Chances Esgotadas;");
    }
    }
    } while (count == 1);



    //Pergunta 08
    do {
        System.out.println("Pergunta 08: Os operadores relacionais estabelece relação entre dados que resultam em valores verdadeiros ou falsos?");
        System.out.println("1) VERDADE");
        System.out.println("2) FALSO");
       p8 = scan.nextInt();

        if(p8 == 1){
         acertos += 1;
         pontuacao += 10;
         System.out.println("Você acertou!");
         break;
        }else{
           System.out.println("Você ERROU, tente novamente: "); 
           System.out.println("Pergunta 08: Os operadores relacionais estabelece relação entre dados que resultam em valores verdadeiros ou falsos?");
           System.out.println("1) VERDADE");
           System.out.println("2) FALSO");
           p8 = scan.nextInt();
   
           if(p8 ==  1){
            acertos += 1;
            pontuacao += 5;
            System.out.println("Você acertou!");
            break;
        }else{
            
            erros += 1;
            System.out.println("Chances Esgotadas;");
    }
    }
    } while (count == 1);



    //Pergunta 09
    do {
        System.out.println("Pergunta 09: A expressão IDADE <- 2.5, sendo que idade é do tipo INTEIRO está correta?");
        System.out.println("1) VERDADE");
        System.out.println("2) FALSO");
        p9 = scan.nextInt();

        if(p9 == 2){
         acertos += 1;
         pontuacao += 10;
         System.out.println("Você acertou!");
         break;
        }else{
           System.out.println("Você ERROU, tente novamente: "); 
           System.out.println("Pergunta 09: A expressão IDADE <- 2.5, sendo que idade é do tipo INTEIRO está correta?");
           System.out.println("1) VERDADE");
           System.out.println("2) FALSO");
           p9 = scan.nextInt();
   
           if(p9 ==  2){
            acertos += 1;
            pontuacao += 5;
            System.out.println("Você acertou!");
            break;
        }else{
            
            erros += 1;
            System.out.println("Chances Esgotadas;");
    }
    }
    } while (count == 1);


    //Pergunta 10

    do {
        System.out.println("Pergunta 10: Estruturas de algoritmos são: Imperativo, Estruturados e Orientados a objetos?");
        System.out.println("1) VERDADE");
        System.out.println("2) FALSO");
        p10 = scan.nextInt();

        if(p10 == 1){
         acertos += 1;
         pontuacao += 10;
         System.out.println("Você acertou!");
         break;
        }else{
           System.out.println("Você ERROU, tente novamente: "); 
           System.out.println("Pergunta 10: Estruturas de algoritmos são: Imperativo, Estruturados e Orientados a objetos?");
           System.out.println("1) VERDADE");
           System.out.println("2) FALSO");
           p10= scan.nextInt();
   
           if(p10 ==  1){
            acertos += 1;
            pontuacao += 5;
            System.out.println("Você acertou!");
            break;
        }else{
            
            erros += 1;
            System.out.println("Chances Esgotadas;"); 
  
    } 
    }
    }while (count == 1);

   System.out.println(name + " você acertou: " + acertos);
   System.out.println("Errou: " + erros);
   System.out.println("Pontuação: " + pontuacao);
   
}



}

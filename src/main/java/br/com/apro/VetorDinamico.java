package br.com.apro;

public class VetorDinamico {
    private int [] elementos;
    private int quantidade;
    private int capacidade;
    private final static int PADRAO_CAPACIDADE_INICIAL = 4;

    public VetorDinamico(){
       this(PADRAO_CAPACIDADE_INICIAL);
    }

    // main(){
    //     VetorDinamico v = new VetorDinamico(16);
    //     VetorDinamico v2 = new VetorDinamico();
    // }

    public VetorDinamico(int capacidadeInicialDesejada){
    if(capacidadeInicialDesejada > 0){
            elementos = new int[capacidadeInicialDesejada];
            capacidade = capacidadeInicialDesejada;
        }
    else{
        elementos = new int[capacidadeInicialDesejada];
        capacidade = PADRAO_CAPACIDADE_INICIAL;
    }
    quantidade = 0;
    }
    public void adicionar(int e){
        //ArrayIndexOutOfBoundsException
        elementos[quantidade++] = e;
    }
}
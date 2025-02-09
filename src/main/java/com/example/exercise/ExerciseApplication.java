package com.example.exercise;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class ExerciseApplication {

	public static void main(String[] args) throws IOException {
		/*###############EXERCÍCIO 01###############*/
		Loop exer1 = new Loop();
		int somaAoFinalDoLoop;
		somaAoFinalDoLoop = exer1.fazLoop();
		System.out.println("VALOR DA VARIÁVEL ''SOMA'' NO FINAL DO PROCESSAMENTO: " + somaAoFinalDoLoop);
		/*##########################################*/
		/*###############EXERCÍCIO 02###############*/
		Fibonacci exer2 = new Fibonacci();
		exer2.fibonacciSequence();
		/*##########################################*/
		/*###############EXERCÍCIO 03###############*/
		Faturamento exer3 = new Faturamento();
		exer3.leitorDeJson();
		/*##########################################*/
		/*###############EXERCÍCIO 04###############*/
		FaturamentoPorEstado exer4 = new FaturamentoPorEstado();
		exer4.faturamento();
		/*##########################################*/
		/*###############EXERCÍCIO 05###############*/
		InverteString exer05 = new InverteString();
		exer05.invertendoAString();
		/*##########################################*/
	}
}


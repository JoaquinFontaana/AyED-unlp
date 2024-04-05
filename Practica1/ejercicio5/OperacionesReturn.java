package ejercicio5;

import java.util.Iterator;

public class OperacionesReturn {
	private int max;
	private int minimo;
	private int promedio;
	
	 private int calcularMax(int[] arreglo) {
		 int max = -9999;
		 for (int i = 0; i < arreglo.length; i++) {
			if(arreglo[i] > max) {
				max = arreglo[i];
			}
		}
		 return max;
	 }
	 private int calcularMinimo(int[] arreglo) {
		 int minimo = 9999;
		 for(int i = 0; i < arreglo.length; i++) {
			 if(arreglo[i] < minimo) {
				 minimo = arreglo[i];
			 }
		 }
		 return minimo;
	 }
	 private int calcularPromedio(int[] arreglo) {
		 int suma = 0;
		 for(int i = 0; i < arreglo.length;i++) {
			 suma += arreglo[i];
		 }
		 return(suma / arreglo.length);
	 }
	 
	 public String calcularValores(int[] arreglo) {
		 int max = this.calcularMax(arreglo);
		 int minimo = this.calcularMinimo(arreglo);
		 int promedio = this.calcularPromedio(arreglo);
		 return ("Promedio: "+ promedio + " Maximo: "+  max+ " Minimo: "+ minimo);
	 }

		public void calcularValoresSinReturn(int[] arreglo, Resultados resultados) {
         resultados.setMaximo(this.calcularMax(arreglo));
         resultados.setMinimo(this.calcularMinimo(arreglo));
         resultados.setPromedio(this.calcularPromedio(arreglo));
     }
		public void calcularValoresPorPropiedades(int[] arreglo) {
			this.max= this.calcularMax(arreglo);
			this.minimo = this.calcularMinimo(arreglo);
			this.promedio = this.calcularPromedio(arreglo);
		}
}

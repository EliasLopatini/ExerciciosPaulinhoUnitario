/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.bosing.exemplotesteunitario;

/**
3. Conversor de Temperatura
Crie uma classe ConversorTemperatura com métodos para converter temperaturas
entre Celsius, Fahrenheit e Kelvin: celsiusParaFahrenheit(double celsius),
fahrenheitParaCelsius(double fahrenheit), e celsiusParaKelvin(double celsius).
Escreva testes unitários para garantir que as conversões de temperatura sejam
precisas. Inclua testes para valores extremos e casos especiais, como a temperatura
zero absoluto.
 */
public class ConversorTemp {
    
    public double celsiusParaFah(Double celsius){
        return celsius * 9 / 5 + 32;
    }
    public double fahParaCelsius(Double fah){
        
        double teste = (fah - 32) * 5 / 9;
        return Math.round(teste);
    }
    public double celsiusParaKelvin(Double celsius){
        return celsius + 273.15;
    }
}

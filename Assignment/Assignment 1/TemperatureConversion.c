#include <stdio.h>
	
	float celsiusToFahrenheit(float c);
	float fahrenheitToCelsius(float f);

	int main(void){
		 celsiusToFahrenheit(98.5f);
		fahrenheitToCelsius(209.3f);
		return 0;
	}
	
	float celsiusToFahrenheit(float c){
	
		float fahrenheit =  (c * 9/5) + 32;
		printf("%.2f Fahrenheit\n", fahrenheit);
	}
	
	float fahrenheitToCelsius(float f){
		float celsius = (f - 32) * 5/9;
		printf("%.2f Celsius\n", celsius);
	}
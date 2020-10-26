/*
 Controlling a servo position using a potentiometer (variable resistor)
 by Michal Rinott <http://people.interaction-ivrea.it/m.rinott>

 modified on 8 Nov 2013
 by Scott Fitzgerald
 http://www.arduino.cc/en/Tutorial/Knob
*/

#include <Servo.h>

Servo myservo;  // Cria o objeto servo

int potpin = 0;   // pino analogico usada para conectar o potenciometro
int val;          // variavel para ler o valor do pino analogico

void setup() {
  myservo.attach(9);  // conecta o servo que está no pino 9 ao servo objeto
}

void loop() {
  val = analogRead(potpin);            // Le o valor do potenciometro (valor entre 0 and 1023)
  val = map(val, 0, 1023, 0, 180);     // faz a escala para usar com o servo (valor entre 0 and 180)
  myservo.write(val);                  // muda o valor do servo de acordo com o valor da escala
  delay(15);                           // tempo de espera para o servo trabalhar
}

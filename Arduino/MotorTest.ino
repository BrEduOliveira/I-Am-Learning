#include <AFMotor.h>    // Inclui a Biblioteca AFMotor.h
 
AF_DCMotor motor(1);    // Define M4 como posição de controle para motor
 
void setup() {
  motor.setSpeed(200);    // Define velocidade inicial do motor
  motor.run(RELEASE);     // Define a função Stop
}
 
void loop() {
  uint8_t i;
  motor.run(FORWARD);           // Liga o Motor
   
  for (i=0; i<255; i++)   {     // Acelera de 0 até a velocidade máxima
    motor.setSpeed(i);
    delay(10);
  }

  delay(5000)
   
  for (i=255; i!=0; i--)   {    // Diminui da velocidade máxima até 0
    motor.setSpeed(i);
    delay(10);
  }
   
  motor.run(BACKWARD);          // Inverte a direção do motor
   
  for (i=0; i<255; i++)   {     // Acelera de 0 até a velocidade máxima
    motor.setSpeed(i);
    delay(10);
  }
   
  for (i=255; i!=0; i--)   {    // Diminui da velocidade máxima até 0
    motor.setSpeed(i);
    delay(10);
  }
   
  motor.run(RELEASE);           // Desliga o Motor
  delay(1000);
}

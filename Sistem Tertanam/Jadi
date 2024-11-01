#include <Servo.h>
const int gas = A0; // Connect A0 to the gas sensor
const int buzzer = D0;
Servo myServo; // Create a Servo object

void setup() {
  myServo.attach(D1); // Attach the servo to pin D1
  pinMode(buzzer, OUTPUT);
  Serial.begin(9600); // Start serial communication
}

void loop() {
  // Read the analog value from the sensor
  int sensor = analogRead(gas);
  
  // Print the value to the Serial Monitor
  Serial.print("MQ-2 Sensor Value: ");
  Serial.println(sensor);
  delay(200); 

  if (sensor >= 800) {
    digitalWrite(buzzer, HIGH); // Turn on the buzzer
    myServo.write(180); // Move to 180 degrees
    delay(1000); // Wait for 1 second
  } else {
    digitalWrite(buzzer, LOW);  // Turn off the buzzer
    myServo.write(0); // Move to 0 degrees
    delay(1000); // Wait for 1 second
  }
}

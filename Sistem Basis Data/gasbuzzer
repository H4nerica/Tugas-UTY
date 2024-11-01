const int fanPin = D0; // PWM pin connected to the transistor base

void setup() {
  pinMode(fanPin, OUTPUT); // Set the fan pin as an output
  
}



======================================================
void loop() {
  // Keep the fan running
  // Optionally, you can add a delay here
  digitalWrite(fanPin, HIGH); // Turn the fan on
  delay(10);
}

  tone(buzzerPin, 1000); // Play a 1 kHz tone
  delay(500);            // Wait for half a second
  noTone(buzzerPin);     // Stop the tone
  delay(500);            // Wait for half a second




===============================================

#define fan D1 // Pin connected to the fan

void setup() {
  pinMode(fan, OUTPUT); // Set the fan pin as an output
  digitalWrite(fan, HIGH); // Turn the fan on initially
}

void loop() {
}









=================================================





const int analogPin = A0; // Analog pin connected to AOUT
const int buzzerPin = D0;

void setup() {
  Serial.begin(9600); // Start the Serial communication at 9600 baud rate
}

void loop() {
  int analogValue = analogRead(analogPin); // Read the analog value
  float voltage = (analogValue / 1023.0) * 3.3; // Convert to voltage (3.3V reference)

  Serial.print("Analog Value: ");
  Serial.print(analogValue); // Print the raw analog value
  Serial.print(" | Voltage: ");
  Serial.println(voltage); // Print the corresponding voltage

  delay(200); // Wait for 1 second before the next read

if (analogValue==14){
  tone(buzzerPin, 1000); // Play a 1 kHz tone
  delay(500);            // Wait for half a second
  noTone(buzzerPin);     // Stop the tone
  delay(500);            // Wait for half a second
}
}


==============================
#define fan D5 // Pin connected to the fan

void setup() {
  pinMode(fan, OUTPUT); // Set the fan pin as an output
  //digitalWrite(fan, HIGH); // Turn the fan on initially
}

void loop() {
  digitalWrite(fan, HIGH); // Turn the fan on initially
  delay(0);
}








===============================================

const int gas = A0; // Connect AO to A0
const int buzzer = D0;
const int fan = D1;

void setup() {
  pinMode(buzzer, OUTPUT);
  pinMode(fan, OUTPUT); 
  Serial.begin(9600); // Start serial communication
}

void loop() {
  // Read the analog value from the sensor
  int sensor = analogRead(gas);
  
  // Print the value to the Serial Monitor
  Serial.print("MQ-2 Sensor Value: ");
  Serial.println(sensor);
  delay(200); 

  if (sensor >= 710) {
    digitalWrite(buzzer, HIGH); // Turn on the buzzer
  } else {
    digitalWrite(buzzer, LOW);  // Turn off the buzzer
  }
}

===============================================
const int servo = D1; // Pin connected to the servo

void setup() {
  pinMode(servo, OUTPUT);
}

void loop() {
  // Move to 0 degrees
  digitalWrite(servo, HIGH);
  delay(1); // 1 ms HIGH for 0 degrees
  digitalWrite(servo, LOW);
  delay(19); // 19 ms LOW to complete the 20 ms cycle
  delay(1000); // Wait for 1 second

  // Move to 180 degrees
  digitalWrite(servo, HIGH);
  delay(2); // 2 ms HIGH for 180 degrees
  digitalWrite(servo, LOW);
  delay(18); // 18 ms LOW to complete the 20 ms cycle
  delay(1000); // Wait for 1 second
}









#include <Wire.h>
#include <LiquidCrystal_I2C.h>

LiquidCrystal_I2C lcd1 (0x20, 16, 2);
LiquidCrystal_I2C lcd2 (0x21, 16, 2);
LiquidCrystal_I2C lcd3 (0x22, 16, 2);

//ldr
int ldr = A0;    
int ldrV = 0; 

//pir
int pirPin = 7;
int pirState = LOW;

//tanah basah
int basah = A1;
int basahnya = 0;

void setup()
{
  Serial.begin(9600);
  pinMode(ldr, INPUT);
  pinMode(pirPin, INPUT);
  pinMode(basah, INPUT);

  lcd1.init();
  lcd1.backlight();
  
  lcd2.init();
  lcd2.backlight();
  
  lcd3.init();
  lcd3.backlight();
  delay(500);
}

void loop()
{
  //sensor ldr
  ldrV = analogRead(ldr);
  Serial.print("LDR: ");
  Serial.println(ldrV);
  //lcd pir
  lcd1.clear();
  lcd1.setCursor(0, 0);
  lcd1.print("LDR:");
  lcd1.print(ldrV);

  //sensor gerakan
  pirState = digitalRead(pirPin);
  if (pirState == HIGH) {
    Serial.println("Motion detected!");
  } else {
    Serial.println("No motion detected.");
  }
  //lcd gerakan
  lcd2.clear();
  lcd2.setCursor(0, 0);
  if (pirState == HIGH) {
    lcd2.print("Motion Detected");
  } else {
    lcd2.print("No Motion");
  }
  
  
  //sensor basah
  basahnya = analogRead(basah);
  Serial.print("Basahnyua: ");
  Serial.println(basahnya);
  //lcd basah
  lcd3.clear();
  lcd3.setCursor(0, 0);
  lcd3.print("Basahnya:");
  lcd3.print(basahnya);
  
  delay(500);
}

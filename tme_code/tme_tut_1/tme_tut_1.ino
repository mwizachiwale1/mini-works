int LEDR = 9;
int LEDG = 10;
int LEDB = 11;

void setup() {
  // put your setup code here, to run once:
  pinMode(LEDR, OUTPUT);
  pinMode(LEDG, OUTPUT);
  pinMode(LEDB, OUTPUT);

}

void loop() {
  // put your main code here, to run repeatedly:
  // RED LED
  digitalWrite(LEDR, HIGH);
  digitalWrite(LEDG, LOW); 
  digitalWrite(LEDB, LOW); 
  delay(500);
  // GREEN LED
  digitalWrite(LEDR, LOW);
  digitalWrite(LEDG, HIGH);
  digitalWrite(LEDB, LOW); 
  delay(500);
    analogWrite(LEDR, 50);
    // BLUE LED
  analogWrite(LEDG, 50); 
  analogWrite(LEDB, 100);
  delay(500);
}

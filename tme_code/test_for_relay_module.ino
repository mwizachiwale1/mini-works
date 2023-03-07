// code to test functioning of relay module

int relay_signal = 7;
void setup() {
  // put your setup code here, to run once:
  pinMode(relay_signal, OUTPUT);

}

void loop() {
  delay(200);
  // put your main code here, to run repeatedly:
  digitalWrite(relay_signal, HIGH);
  delay(2000);
  digitalWrite(relay_signal, LOW);
  delay(2000);
  

}

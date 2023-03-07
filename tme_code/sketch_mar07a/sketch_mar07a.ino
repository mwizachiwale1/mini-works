int ledR = 9;
int ledG = 10;
int ledB = 11;
int BUTTON = 8;
int ledState = 0;
int buttonCount = 0;
void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
//  Serial.print("UCS");
//  delay(6000);
  pinMode(ledR, OUTPUT);
  pinMode(ledG, OUTPUT);
  pinMode(ledB, OUTPUT);
  pinMode(BUTTON, INPUT);

  digitalWrite(ledR, LOW);
  digitalWrite(ledG, LOW);
  digitalWrite(ledB, LOW);
}

void loop() {
  // put your main code here, to run repeatedly:
//  Serial.print("\n");
//  Serial.print("Hello world");
  
  int buttonState = digitalRead(BUTTON);
  
  if(buttonState == 1){
      ledState = 1;

      if(buttonCount == 0){
        ledState = 1;
        
    }
  if(ledState == 1){
      digitalWrite(ledR, HIGH);
      digitalWrite(ledG, LOW);
      digitalWrite(ledB, LOW);

      delay(5000);
      // yellow
      digitalWrite(ledR, HIGH);
      digitalWrite(ledG, HIGH);
      digitalWrite(ledB, LOW);

delay(5000);
      // Green
      digitalWrite(ledR, LOW);
      digitalWrite(ledG, HIGH);
      digitalWrite(ledB, LOW);
      delay(5000);
      }

}

int LED1 = 13;

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(LED1,OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  int light = analogRead(A0);
  Serial.print("\n");
  Serial.print(light);
  if(light > 300){
    digitalWrite(LED1, HIGH);
  }else{
    digitalWrite(LED1, LOW);
  }

}

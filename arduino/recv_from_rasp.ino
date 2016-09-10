String val;
int E1 = 5;     //M1 Speed Control
int E2 = 6;     //M2 Speed Control
int M1 = 4;    //M1 Direction Control
int M2 = 7;    //M1 Direction Control

void setup() {
  Serial1.begin(115200);
  pinMode(M1, OUTPUT);
  pinMode(M2, OUTPUT);
  pinMode(E1, OUTPUT);
  pinMode(E2, OUTPUT);
}

void loop() {

  while (Serial1.available() > 0)
  {
    val += char(Serial1.read());
    delay(2);
  }

  if (val.length() > 0)
  {
    if (val.equals("1") == true)
    {
      //Forward
      digitalWrite(M1, HIGH);
      digitalWrite(M2, HIGH);
      analogWrite(E1, 150);
      analogWrite(E2, 150);
    }

    else if (val.equals("2") == true)
    {
      //Left
      digitalWrite(M1, HIGH);
      digitalWrite(M2, LOW);
      analogWrite(E1, 150);
      analogWrite(E2, 150);
    }

    else if (val.equals("3") == true)
    {
      //Stop
      analogWrite(E1, 0);
      analogWrite(E2, 0);
    }

    else if (val.equals("4") == true)
    {
      //Right
      digitalWrite(M1, LOW);
      digitalWrite(M2, HIGH);
      analogWrite(E1, 150);
      analogWrite(E2, 150);
    }

    else if (val.equals("5") == true)
    {
      //Backward
      digitalWrite(M1, LOW);
      digitalWrite(M2, LOW);
      analogWrite(E1, 150);
      analogWrite(E2, 150);
    }
    val = "";
  }
}

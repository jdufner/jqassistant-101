package your.project.cohesionmetrics.lcom.one;

class C5 {

  int f5;

  int m8() {
    return f5 + m9();
  }

  int m9() {
    return m8();
  }

}

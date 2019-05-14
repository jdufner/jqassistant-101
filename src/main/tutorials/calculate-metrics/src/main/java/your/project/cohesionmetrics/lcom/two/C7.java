package your.project.cohesionmetrics.lcom.two;

class C7 {

  int f13;
  int f14;

  int m13() {
    return f13 + f14 + m14();
  }

  int m14() {
    return f13 + f14 + m13();
  }

}

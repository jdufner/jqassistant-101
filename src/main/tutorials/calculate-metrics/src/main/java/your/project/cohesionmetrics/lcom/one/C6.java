package your.project.cohesionmetrics.lcom.one;

class C6 {

  int f6;

  int m10() {
    return f6 + m11();
  }

  int m11() {
    return f6 + m10();
  }

}

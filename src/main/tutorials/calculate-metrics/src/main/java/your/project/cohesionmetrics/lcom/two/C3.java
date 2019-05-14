package your.project.cohesionmetrics.lcom.two;

class C3 {

  int f5;
  int f6;

  int m5() {
    return f5;
  }

  int m6() {
    return f6 + m5();
  }

}

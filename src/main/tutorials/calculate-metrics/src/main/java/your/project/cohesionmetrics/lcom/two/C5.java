package your.project.cohesionmetrics.lcom.two;

class C5 {

  int f9;
  int f10;

  int m9() {
    return f9 + f10;
  }

  int m10() {
    return f9 + f10 + m9();
  }

}

package your.project.cohesionmetrics.lcom.one;

class C4 {

  int f4;

  int m6() {
    return f4;
  }

  int m7() {
    return f4 + m6();
  }

}

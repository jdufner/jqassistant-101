package your.project.cohesionmetrics.lcom.two;

class C4 {

  int f7;
  int f8;

  int m7() {
    return f7;
  }

  int m8() {
    return f7 + f8 + m7();
  }

}

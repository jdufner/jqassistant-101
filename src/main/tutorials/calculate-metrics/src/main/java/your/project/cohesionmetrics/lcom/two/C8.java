package your.project.cohesionmetrics.lcom.two;

class C8 {

  int f15;
  int f16;

  int m15() {
    return f15 + m16();
  }

  int m16() {
    return f16 + m15();
  }

}

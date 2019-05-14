package your.project.cohesionmetrics.lcom.one;

class All {

  int f1, f2, f3, f4, f5, f6, f7, f8;

  int m1() {
    return  f1;
  }

  int m2() {
    return f2;
  }

  int m3() {
    return f2;
  }

  int m4() {
    return f3;
  }

  int m5() {
    return m4();
  }

  int m6() {
    return f4;
  }

  int m7() {
    return f4 + m6();
  }

  int m8() {
    return f5 + m9();
  }

  int m9() {
    return m8();
  }

  int m10() {
    return f6 + m11();
  }

  int m11() {
    return f6 + m10();
  }

  int m12() {
    return f7 + m12();
  }

  int m13() {
    return f8;
  }

  int m14() {
    return m13();
  }

  int m15() {
    return m14();
  }
}

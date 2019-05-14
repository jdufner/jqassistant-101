package your.project.cohesionmetrics.lcom.two;

class All {

  int f1;
  int f2;

  int m1() {
    return f1;
  }

  int m2() {
    return f2;
  }

  int f1a;
  int f2a;

  int m1a() {
    return f1a;
  }

  int m2a() {
    return f1a;
  }

  int f3;
  int f4;

  int m3() {
    return f3;
  }

  int m4() {
    return f3 + f4;
  }

  int f5;
  int f6;

  int m5() {
    return f5;
  }

  int m6() {
    return f6 + m5();
  }

  int f7;
  int f8;

  int m7() {
    return f7;
  }

  int m8() {
    return f7 + f8 + m7();
  }

  int f9;
  int f10;

  int m9() {
    return f9 + f10;
  }

  int m10() {
    return f9 + f10 + m9();
  }

  int f11;
  int f12;

  int m11() {
    return f11 + f12;
  }

  int m12() {
    return f11 + f12;
  }

  int f13;
  int f14;

  int m13() {
    return f13 + f14 + m14();
  }

  int m14() {
    return f13 + f14 + m13();
  }

  int f15;
  int f16;

  int m15() {
    return f15 + m16();
  }

  int m16() {
    return f16 + m15();
  }

}

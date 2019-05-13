package your.project.cohesionmetrics.lcom;

final class Clazz6 {

  private final int field1;

  Clazz6(int field1) {
    this.field1 = field1;
  }

  int foo() {
    return bar() + field1;
  }

  int bar() {
    return foo() + field1;
  }

}

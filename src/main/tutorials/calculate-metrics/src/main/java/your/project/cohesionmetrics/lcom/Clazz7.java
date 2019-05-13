package your.project.cohesionmetrics.lcom;

public class Clazz7 {

  private final int field1;

  Clazz7(int field1) {
    this.field1 = field1;
  }

  int getField1() {
    return field1;
  }

  int foo() {
    return bar() + getField1();
  }

  int bar() {
    return foo() + getField1();
  }

}

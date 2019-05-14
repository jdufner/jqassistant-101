package your.project.cohesionmetrics.lcom.unstructured;

final class Clazz1 {

  private static String log = "myLogger";

  private int field1;
  private int field2;
  private int field3;

  Clazz1(int field1, int field2) {
    log = "Clazz1";
    this.field1 = field1;
    this.field2 = field2;
  }

  int getSumOfField1AndField2() {
    log = "getSumOfField1AndField2";
    return field1 + field2;
  }

  int getField3() {
    log = "getField3";
    return field3;
  }

  void setField3(int field3) {
    log = "setField3";
    this.field3 = field3;
  }

  int getHalfOfSumOfField1AndField2() {
    return getSumOfField1AndField2() / 2;
  }

}

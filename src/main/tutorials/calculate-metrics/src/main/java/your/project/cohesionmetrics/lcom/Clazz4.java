package your.project.cohesionmetrics.lcom;

final class Clazz4 {

  private int field1;

  Clazz4(int field1) {
    this.field1 = field1;
  }

  int getField1() {
    return field1;
  }

  double getSqrtOfField1() {
    return Math.sqrt((double) field1);
  }

  double getLogOfField1() {
    return Math.log((double) field1);
  }

  double getCosOfField1() {
    return Math.cos((double) field1);
  }

  double getSinOfField1() {
    return Math.sin((double) field1);
  }

  double getTanOfField1() {
    return Math.tan((double) field1);
  }

}

package your.project.cohesionmetrics.lcom;

final class Clazz2 {

  private int value = 1;

  int getValue() {
    return value;
  }

  int getIncrementedValue() {
    return getValue() + 1;
  }

  int getDoubleIncrementedValue() {
    return getIncrementedValue() + 1;
  }

  int getTripleIncrementedValue() {
    return getDoubleIncrementedValue() + 1;
  }

}

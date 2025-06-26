package ch08_interface.sec13_sealed;

public sealed interface InterfaceA permits InterfaceB {
    void methodA();
}

module modules.practice.gradle.moduleB {
    requires modules.practice.gradle.moduleA;
    provides dev.phil.MyInterface with dev.phil.impl.MyClass;
}
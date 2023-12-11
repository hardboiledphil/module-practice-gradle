module modules.practice.gradle.moduleB {
    requires modules.practice.gradle.moduleA;
    exports dev.phil.impl;
    provides dev.phil.MyInterface with dev.phil.impl.MyService;
}
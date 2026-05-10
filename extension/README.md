## Versioning and Regression testing

The library is not including any version of Operaton but defines it as a `provided` dependency.
This allows you to use the library with any of supported versions.

The library distinguishes between the version of Operaton it is using as a version during
the compilation and the runtime version used during regression testing.

Current compile version is Operaton 1.1.2

Regression test versions are:

| JDK \ Operaton Version | 1.1.2 | 2.0.2 | 
|------------------------|-------|-------|
| JDK 17 (LTS)           | yes   | yes   | 
| JDK 21 (LTS)           | yes   | yes   |
|                        |       |       |




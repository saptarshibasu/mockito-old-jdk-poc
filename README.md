# Mockito 2.x tests fail when run on JDK 1.8.0_05

[INFO] Running com.sapbasu.mockitopoc.TestClass
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0, Time elapsed: 0.62 s <<< FAILURE! - in com.sapbasu.mockitopoc.TestClass
[ERROR] com.sapbasu.mockitopoc.TestClass  Time elapsed: 0.62 s  <<< ERROR!
org.mockito.exceptions.base.MockitoException: 

Mockito cannot mock this class: class com.sapbasu.mockitopoc.Foo.

Mockito can only mock non-private & non-final classes.
If you're not sure why you're getting this error, please report to the mailing list.


Java               : 1.8
JVM vendor name    : Oracle Corporation
JVM vendor version : 25.5-b02
JVM name           : Java HotSpot(TM) 64-Bit Server VM
JVM version        : 1.8.0_05-b13
JVM info           : mixed mode
OS name            : Windows 8.1
OS version         : 6.3


Underlying exception : java.lang.IllegalArgumentException: object is not an instance of declaring class
Caused by: java.lang.IllegalArgumentException: object is not an instance of declaring class

[INFO] 
[INFO] Results:
[INFO] 
[ERROR] Errors: 
[ERROR]   TestClass.com.sapbasu.mockitopoc.TestClass » Mockito 
Mockito cannot mock this...
[INFO] 
[ERROR] Tests run: 1, Failures: 0, Errors: 1, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 3.821 s
[INFO] Finished at: 2019-05-11T23:27:31+05:30
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.22.1:test (default-test) on project mockito-poc: There are test failures.
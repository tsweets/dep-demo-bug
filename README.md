### Test Dependency Lock Bug
This is a test project to demonstrate a bug in Gradle's dependency lock feature. This project is locked to version 19 of guava
and this works if I explicitly try to use a value greater an 19. If I use 17 the build is an success, it should not be. 
If I use latest ('+') it works.

To test simply clone this project and run

```
gradlew clean build
``` 

Currently this uses the "17" version as shown below and it should be a failed build. 

```groovy


dependencies {
    // I'm dependency locked to version 19
    //compile group: 'com.google.guava', name: 'guava', version: '19.0'

    // Expect this to fail - but it does not
    compile group: 'com.google.guava', name: 'guava', version: '17.0'

    // Expect this to fail - but it does not
    //compile group: 'com.google.guava', name: 'guava', version: '+'

    // Expect this to fail and it does
    //compile group: 'com.google.guava', name: 'guava', version: '22.0'

    testCompile group: 'junit', name: 'junit', version: '4.12'
}

```

You can then run the jar and see what Guava version it uses
```groovy
Tonys-iMac-3:dep-demo tsweets$ java -jar build/libs/dep-demo-1.0-SNAPSHOT.jar 
Gradle Rocks!
Guava Version: 17.0
```

### Demo
#### Create Jar (Write lock file)
1. gradle build --write-locks 
2. run jar

#### Update build.gradle
1. Edit build.gradle

#### Running Fat Jar
java -jar build/libs/dep-demo-1.0-SNAPSHOT.jar
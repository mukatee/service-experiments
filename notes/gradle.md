https://www.baeldung.com/gradle
https://www.vogella.com/tutorials/Gradle/article.html
https://rominirani.com/gradle-tutorial-part-1-installation-setup-2ea77729fc8c


## Ajetaan hello niminen taski build.gradle tiedostosta:
gradle hello

## Ajetaan toLower niminen taski build_tolower.gradle tiedostosta:
gradle -b build_tolower.gradle toLower

## Tietoa projektista, mahdollinen kuvaus yms, kuten annetussa .gradle filessä määritelty
gradle project

## Tietoa projektin taskeista
gradle tasks

## JVM
export GRADLE_OPTS=-Xmx1024m
tai gradle.properties
org.gradle.jvmargs=-Xms2g -Xmx4g -XX\:MaxHeapSize\=3g

## hiljaa
gradle -q tasks


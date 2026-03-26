plugins {
    id ("application")
    id("org.sonarqube") version "7.2.3.7755"
    checkstyle
    id("com.github.ben-manes.versions") version "0.53.0"
}

checkstyle {
    toolVersion = "10.12.4"
}

sonar {
    properties {
        property("sonar.projectKey", "Artem-Maksimenko09_java-project-61")
        property("sonar.organization", "artem-maksimenko09")
    }
}

application {
    mainClass.set("hexlet.code.App")
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
}
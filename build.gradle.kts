plugins {
    id("java")
    id("org.springframework.boot") version "3.2.3"
    id("io.spring.dependency-management") version "1.1.4"
}

group = "nl.fontys"

java {
    sourceCompatibility = JavaVersion.VERSION_21
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencyManagement {
    dependencies {
        dependency("org.springframework.boot:spring-boot-starter:3.2.3")
        dependency("org.projectlombok:lombok:1.18.30")
        dependency("org.junit:junit-bom:5.10.2")
        dependency("org.junit:junit-jupiter:5.10.2")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")

    testImplementation(platform("org.junit:junit-bom"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    compileOnly("org.projectlombok:lombok")

    annotationProcessor("org.projectlombok:lombok")
}

tasks.test {
    useJUnitPlatform()
}
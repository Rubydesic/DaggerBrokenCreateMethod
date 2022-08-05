import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    kotlin("kapt") version "1.7.10"

}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    val daggerVersion = "2.43.2"
    implementation("com.google.dagger", "dagger", daggerVersion)
    annotationProcessor("com.google.dagger", "dagger-compiler", daggerVersion)
    kapt("com.google.dagger", "dagger-compiler", daggerVersion)
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
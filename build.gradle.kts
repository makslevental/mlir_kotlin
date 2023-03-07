plugins {
    kotlin("jvm") version "1.8.0"
    application
}

group = "org.mlevental"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.withType<JavaCompile> {
    options.compilerArgs.add("--enable-preview")
}


kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
    }
}

application {
    mainClass.set("MainKt")
    applicationDefaultJvmArgs += arrayOf(
        "--enable-preview",
        "--source 19",
        "--enable-native-access=ALL-UNNAMED",
    )
}

//tasks.test {
//    useJUnitPlatform()
//    jvmArgs("--enable-preview", "--enable-native-access=ALL-UNNAMED")
//}
